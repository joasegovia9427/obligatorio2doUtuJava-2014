import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class modelo 
{
	private final static String drv="com.mysql.jdbc.Driver";
	 private final static String url="jdbc:mysql://localhost:3306/test";
	 private final static String usr="root";
	 private final static String pass="12345";
	 Connection cnn=null;
	 Statement stmt = null;
	 ResultSet rs = null;
	 PreparedStatement preparedStatement = null;
	 //falta un metodo, es el metodo especifico para el x boton
	 	 
	 
	public void BMlaceptar1() {
//		public void BMlaceptar1(String nombreL, String ID) {
		// TODO Auto-generated method stub
		try{
			//3 Instanciar los 4 Objetos
			try{
			    Class.forName("com.mysql.jdbc.Driver");
			    }catch (ClassNotFoundException e) 
			    	{
				// TODO Auto-generated catch block
				e.printStackTrace();		}
			cnn=DriverManager.getConnection(url,usr,pass);
			
			stmt = cnn.createStatement();
//			rs = stmt.executeQuery("select * from estudiantes");		
//			stmt = cnn.prepareStatement
					
//			prepareStatement = cnn.prepareStatement("insert into estudiantes values (?, ?, ?)");
//			      // "myuser, webpage, datum, summary, COMMENTS from FEEDBACK.COMMENTS");
//			      // parameters start with 1
//			      preparedStatement.setString(1, "555");
//			      preparedStatement.setString(2, "nob1");
//			      preparedStatement.setString(3, "c");
//			      preparedStatement.executeUpdate();
			
			String sql = "INSERT INTO estudiantes " +
	                   "VALUES (555, 'nob1', 'c')";
	      stmt.executeUpdate(sql);
			
			
//			4 muestro rs 
//				while (rs.next())
//				{
//				String n = rs.getString(1);
//				String t = rs.getString(2);	
//				String d = rs.getString(3);	
//				
//				//lst.add(n+" "+ String.valueOf(d) );
////				lst.add(n+" joakin "+ d );
//				System.out.println(n+" "+t+" "+ d);
//				}
		}
	 	catch (SQLException e)
	 	    {
	 		System.out.println("errorSQL"); 
		                         e.printStackTrace();	
		    } 
	   finally
	   {
		   try {
			   
			   cnn.close();
			stmt.close();
			
			rs.close();
		       } catch (SQLException e)
		       {
				// TODO Auto-generated catch block
				e.printStackTrace();
			   }
	   }
	}

 
}
