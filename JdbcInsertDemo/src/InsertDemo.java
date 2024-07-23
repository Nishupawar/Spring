import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {

	
	public static void main(String[] args)throws Exception
	
	{
		String name1 ="Nisha";
		String email1= "nisha@gmail.com";
		String pass1 = "Nisha123";
		String gender1= "Female";
		String city1= "Mumbai";
	Class.forName("com.mysql.cj.jdbc.Driver");
    
    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/insertDemo", "root", "NishuPawar@123");
    
   // PreparedStatement ps = con.prepareStatement("insert into register values('"+name1+"','"+email1+"','Vikram@123','Male','Pune')");
    PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
    ps.setString(1,name1);
    ps.setString(2,email1);
    ps.setString(3, pass1);
    ps.setString(4,gender1);
    ps.setString(5, city1);
    
    int i=ps.executeUpdate();
    if(i > 0)
    	System.out.println("Success");
    else
    	System.out.println("Fail");
	}
}
