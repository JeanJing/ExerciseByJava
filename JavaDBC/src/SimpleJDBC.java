import java.sql.*;

import javax.naming.spi.DirStateFactory.Result;


public class SimpleJDBC {
	public static void main(String args[]) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		System.out.println("�����������");
		//��μ��سɹ���
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/javabook","root","zheng");
	    System.out.println("���ݿ����ӳɹ�");
	    
	   // System.out.println("�������������������ǣ�"+ connection.getMetaData().getMaxStatements());
	    Statement statement = connection.createStatement();
	    ResultSet set= statement.executeQuery("select * from jing;");
	    //int i = statement.executeUpdate("create user 'JeanJing'@'localhost' identified by 'jing'");
	    
	    int column = set.getMetaData().getColumnCount();
	    System.out.println("����Ϊ��" + column);
	    Statement statement2 = connection.createStatement(); 
	    //��ô���ǿ����Ľ�����ǣ�һ����statement�������һ��resultset��������ô֮ǰ���Ǹ���statement������resultset�ͻᱻ�رգ�����������ʹ����
	    System.out.println("�����statement�������һ��resultset��������ô֮ǰ���Ǹ���statement������resultset�Ƿ񱻹ر����أ���"+set.isClosed());
	    
	    ResultSet set2 = statement2.executeQuery("select count(*) as rowCount from  sc;");
	    System.out.println("�����statement�������һ��resultset��������ô֮ǰ���Ǹ���statement������resultset�Ƿ񱻹ر����أ���"+set.isClosed());
	    set2.next();
	    System.out.println("����Ϊ��" + set2.getInt("ROWCOUNT"));//������������Կ����ǲ��ִ�Сд��
	    while(set.next()){
	    	for(int i = 1; i <= column; i++)
	    	System.out.print(set.getString(i) + " ");
	    	System.out.println();
	    }
	    /*
	    Statement statement3 = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	    ResultSet set3 = statement3.executeQuery("select * from sc;");
	    set3.last();
	    System.out.println("����Ϊ��"+set3.getRow());
	    set3.beforeFirst();
	    while(set3.next()){
	    	for(int i = 1; i <= column; i++)
	    	System.out.print(set3.getString(i) + " ");
	    	System.out.println();
	    }*/
	    System.out.println(connection.getMetaData().getMaxStatements());
	    connection.close();//�ص�����
	   
	    
	}

}
