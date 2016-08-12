import javax.sql.*;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import java.io.*;
import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JFrame;


public class PreparedStatementTest {
	private static final String price = "UPDATE Books " + "SET Price = Price + ? "
	         + " WHERE Books.Publisher_Id = (SELECT Publisher_Id FROM Publishers WHERE Name = ?)";
	public static void main(String args[]) throws SQLException, IOException{
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/javabook", "JeanJing", "jing");
		/*File file = new File("1.png");
		FileInputStream inf = new FileInputStream(file);
		PreparedStatement insert_update = conn.prepareStatement("insert into pig values(?,?,?)");
		insert_update.setInt(1,1);
		insert_update.setString(2,"淘宝图片");
		insert_update.setBlob(3, inf);
		int count = insert_update.executeUpdate();
		System.out.println(count);*/
		
		//测试在数据库中存放大的二进制对象，例如图片
		/*
		Statement st = conn.createStatement();
		ResultSet set = st.executeQuery("select * from pig");
		set.next();//对于普通的resultset而言，在通过其访问结果集时，首先要将指针指向第一个行
		Blob blob = set.getBlob(3);
		Image image = ImageIO.read(blob.getBinaryStream());
		//没有直接的表示图片的方法
		System.out.println(image);
		
		JFrame f=new JFrame();
        MyCanvas mc=new MyCanvas();
        
        mc.setImage(image);
        f.add(mc);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,550);
        f.setVisible(true);
        */
		
		/*PreparedStatement stat_update = conn.prepareStatement(
				"update books set price= price + ? " +
				"where publisher_id in " +
				"(select publisher_id from publishers where name LIKE ?)");
		stat_update.setInt(1, 20);
		stat_update.setString(2,"Addison-Wesley");
		int n = stat_update.executeUpdate();
		System.out.println("价钱提升的书有："+ n + "本");
		//stat.setInt(1, 10);
		//stat.setString(2, "Addison-Wesley");
		//int m = stat.executeUpdate();
	    //System.out.println("价钱提升的书有："+ m + "本");*/
		/*PreparedStatement stat_sql = conn.prepareStatement(
				"select * from books where title = ?;");//得到的结果就是预处理statement中的变量？必须在执行查询之前设置
	    //stat_sql.setString(1, "title");
	   // stat_sql.setString(2, "price");
		ResultSet set = stat_sql.executeQuery();
		DisplayResultSet.showResultSet(set);*/
        //可更新结果集
		/*
		Statement stat = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet set4 = stat.executeQuery("select * from sc");
        System.out.println("结果集是否可以更新:"+ set4.getConcurrency());
        set4.next();
        set4.updateInt(3,80);
        set4.updateRow();//调用了这个之后结果才对了
        RowSetFactory factory = RowSetProvider.newFactory();
        factory.createJdbcRowSet();
        */
		 DatabaseMetaData meta = conn.getMetaData();
		 ResultSet mrs = meta.getTables(null, null, null, new String[]{"TABLE"});
		 ArrayList<String> tabelname = new ArrayList<String>();
		 while(mrs.next())
			 tabelname.add(mrs.getString(3));
		 System.out.println(tabelname);
		 System.out.println("是否支持数据库批量更新操作"+meta.supportsBatchUpdates());
		 
       
	}

}
class MyCanvas extends Canvas {
    private Image in;
    private int image_width;
    private int image_height;
    
    public void setImage(Image in){
        this.in=in;
    }
    
    public void paint(Graphics g){
        g.drawImage(in,0,0,this.getWidth(),this.getHeight(),this);
    }    
}
