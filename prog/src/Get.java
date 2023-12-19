import java.sql.*;
public class Get {
	public static void createstudent() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/world";
		String username="root";
		String password="2821";
		String Query="Select*from sr";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement pst=con.createStatement();
		ResultSet rs=pst.executeQuery(Query);
		while(rs.next()) {
			System.out.println("id"+rs.getInt(1));
			System.out.println("name"+rs.getString(2));
			System.out.println("email"+rs.getString(3));
		}
		
		con.close();
	}
	public static void main(String[] args)throws Exception {
		createstudent();	
	}

}
