import java.sql.*;

public class College {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
	          Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	         // PreparedStatement pst=con.prepareStatement("insert into college values(?,?,?)");
	          String query = " insert into college values (?, ?, ?)";

	        	      // create the mysql insert preparedstatement
	        	      PreparedStatement preparedStmt = con.prepareStatement(query);
	        	      preparedStmt.setInt (1, 3);
	        	      preparedStmt.setString (2, "Swati");
	        	      preparedStmt.setInt   (3, 820);
	        	     
	        	      

	        	      // execute the preparedstatement
	        	      preparedStmt.execute();
	        	      System.out.println("Saved SUCCESSFULLY!!!!!!");
	        	      con.close();      
		            }
	                  catch (Exception ex) 
		            {
	                     ex.printStackTrace();
	                }

		}

}


