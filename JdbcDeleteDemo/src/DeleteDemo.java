import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {

	
	public static void main(String[] args) throws Exception
	{
		String email1="Vikram@gmail.com";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/insertDemo","root","NishuPawar@123");
		PreparedStatement ps= con.prepareStatement("delete from register where email =?");
	     ps.setString(1,email1);
		 int cnt=ps.executeUpdate();
		 if(cnt > 0)
			 System.out.println("Successfully Deleted");
		 else
			 System.out.println("Failed");
	}
}
