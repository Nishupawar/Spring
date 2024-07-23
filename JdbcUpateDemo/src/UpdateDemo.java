import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {

	
	public static void main(String[] args) throws Exception
	{
		String name1="Vikram";
		String email1 ="vikram2000@gmail.com";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/insertDemo","root","NishuPawar@123");
		
	   PreparedStatement ps= con.prepareStatement("update register set name=?  where email=? ");
	   ps.setString(1, name1);
	   ps.setString(2, email1);
	   
	  int cnt= ps.executeUpdate();
	  if(cnt >0)
		  System.out.println("Successfully Updated");
	  else
		  System.out.println("Failed");
	
	
	}
}
