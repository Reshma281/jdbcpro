import java.sql.*;
public class Update {
	public static void createstudent() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/world";
		String username="root";
		String password="2821";
		String Query="update sr set name='ramya' where id=100";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[] args)throws Exception {
		createstudent();	
	}

}
