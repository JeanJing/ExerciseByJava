import java.sql.*;

import javax.naming.spi.DirStateFactory.Result;


public class SimpleJDBC {
	public static void main(String args[]) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		System.out.println("驱动程序加载");
		//这次加载成功了
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/javabook","root","zheng");
	    System.out.println("数据库链接成功");
	    
	   // System.out.println("连接允许的最大连接数是："+ connection.getMetaData().getMaxStatements());
	    Statement statement = connection.createStatement();
	    ResultSet set= statement.executeQuery("select * from jing;");
	    //int i = statement.executeUpdate("create user 'JeanJing'@'localhost' identified by 'jing'");
	    
	    int column = set.getMetaData().getColumnCount();
	    System.out.println("列数为：" + column);
	    Statement statement2 = connection.createStatement(); 
	    //那么我们看到的结果就是，一旦将statement和另外的一个resultset关联：那么之前的那个和statement关联的resultset就会被关闭，并不可以再使用了
	    System.out.println("如果将statement和另外的一个resultset关联：那么之前的那个和statement关联的resultset是否被关闭了呢？："+set.isClosed());
	    
	    ResultSet set2 = statement2.executeQuery("select count(*) as rowCount from  sc;");
	    System.out.println("如果将statement和另外的一个resultset关联：那么之前的那个和statement关联的resultset是否被关闭了呢？："+set.isClosed());
	    set2.next();
	    System.out.println("行数为：" + set2.getInt("ROWCOUNT"));//所以由这里可以看出是不分大小写的
	    while(set.next()){
	    	for(int i = 1; i <= column; i++)
	    	System.out.print(set.getString(i) + " ");
	    	System.out.println();
	    }
	    /*
	    Statement statement3 = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	    ResultSet set3 = statement3.executeQuery("select * from sc;");
	    set3.last();
	    System.out.println("行数为："+set3.getRow());
	    set3.beforeFirst();
	    while(set3.next()){
	    	for(int i = 1; i <= column; i++)
	    	System.out.print(set3.getString(i) + " ");
	    	System.out.println();
	    }*/
	    System.out.println(connection.getMetaData().getMaxStatements());
	    connection.close();//关掉连接
	   
	    
	}

}
