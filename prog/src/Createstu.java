import java.sql.*;
public class Createstu {
	public static void createstudent() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/world";
		String username="root";
		String password="2821";
		String Query="insert into sr values(?,?,?)";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.setInt(1, 101);
		pst.setString(2, "Sre");
		pst.setString(3, "See@gmail.com");
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[] args)throws Exception {
		createstudent();	
	}

}
