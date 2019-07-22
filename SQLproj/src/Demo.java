import java.sql.*;  
public class Demo {
	public static void main(String[] args) throws ClassNotFoundException{
		try{
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/test","root","root");  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from persons");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(3)+"  "+rs.getString(4));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  
}  
		