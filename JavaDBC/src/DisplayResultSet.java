import java.sql.*;


public class DisplayResultSet {
	public static void showResultSet(ResultSet resultset) throws SQLException{//��Ե���executeQuery��ִ�н��
	    ResultSetMetaData metadata = resultset.getMetaData();
		int columnCount = metadata.getColumnCount();
		for(int i = 1; i <= columnCount; i++){//���ݿ���к��Ǵ�1��ʼ��
			if( i == 1)
				System.out.print(metadata.getColumnLabel(i)+"                            ");
			else
				System.out.print(metadata.getColumnLabel(i)+"   ");
		}
		System.out.println();
		while(resultset.next()){
		for(int i = 1; i <= columnCount; i++){
			System.out.print(resultset.getString(i) + "  ");
		}
		System.out.println();
		}
	}
	public static void main(String args[]) throws SQLException{
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/javabook", "JeanJing", "jing");
		Statement statement = conn.createStatement();
		ResultSet resultset = statement.executeQuery("select title, price from books;");
		showResultSet(resultset);
	}

}
