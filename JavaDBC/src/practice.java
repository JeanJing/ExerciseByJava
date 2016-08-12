import java.sql.*;


public class practice {
	public static void main(String args[]) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/javabook","JingJean","jing");
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery("select * from course");
		while(result.next()){
			System.out.println(result.getString(1));
		}
		
		
		Class.forName("com.mysql.jdbc.Driver");//这个第一句话我有点忘了
	}
}
