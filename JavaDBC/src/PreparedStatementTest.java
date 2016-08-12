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
		insert_update.setString(2,"�Ա�ͼƬ");
		insert_update.setBlob(3, inf);
		int count = insert_update.executeUpdate();
		System.out.println(count);*/
		
		//���������ݿ��д�Ŵ�Ķ����ƶ�������ͼƬ
		/*
		Statement st = conn.createStatement();
		ResultSet set = st.executeQuery("select * from pig");
		set.next();//������ͨ��resultset���ԣ���ͨ������ʽ����ʱ������Ҫ��ָ��ָ���һ����
		Blob blob = set.getBlob(3);
		Image image = ImageIO.read(blob.getBinaryStream());
		//û��ֱ�ӵı�ʾͼƬ�ķ���
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
		System.out.println("��Ǯ���������У�"+ n + "��");
		//stat.setInt(1, 10);
		//stat.setString(2, "Addison-Wesley");
		//int m = stat.executeUpdate();
	    //System.out.println("��Ǯ���������У�"+ m + "��");*/
		/*PreparedStatement stat_sql = conn.prepareStatement(
				"select * from books where title = ?;");//�õ��Ľ������Ԥ����statement�еı�����������ִ�в�ѯ֮ǰ����
	    //stat_sql.setString(1, "title");
	   // stat_sql.setString(2, "price");
		ResultSet set = stat_sql.executeQuery();
		DisplayResultSet.showResultSet(set);*/
        //�ɸ��½����
		/*
		Statement stat = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet set4 = stat.executeQuery("select * from sc");
        System.out.println("������Ƿ���Ը���:"+ set4.getConcurrency());
        set4.next();
        set4.updateInt(3,80);
        set4.updateRow();//���������֮�����Ŷ���
        RowSetFactory factory = RowSetProvider.newFactory();
        factory.createJdbcRowSet();
        */
		 DatabaseMetaData meta = conn.getMetaData();
		 ResultSet mrs = meta.getTables(null, null, null, new String[]{"TABLE"});
		 ArrayList<String> tabelname = new ArrayList<String>();
		 while(mrs.next())
			 tabelname.add(mrs.getString(3));
		 System.out.println(tabelname);
		 System.out.println("�Ƿ�֧�����ݿ��������²���"+meta.supportsBatchUpdates());
		 
       
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
