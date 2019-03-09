
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			
		PreparedStatement preparedStatement = connection.prepareStatement("update employee set address='Mysore' where id=?");
		
			System.out.println("Enter id");
			int id = sc.nextInt();
			preparedStatement.setInt(1, id);
			 int i=preparedStatement.executeUpdate();
			 if(i==1)
				 System.out.println("Done");
			 else
				 System.out.println("Error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
