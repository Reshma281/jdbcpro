import java.sql.*;
public class Delete {
	public static void createstudent() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/world";
		String username="root";
		String password="2821";
		String Query="delete from sr where id=101";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[] args)throws Exception {
		createstudent();	
	}

}
