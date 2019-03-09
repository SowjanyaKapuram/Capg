import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseEx {

	public static void main(String[] args) {


		//1
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			//3
			Statement statement = connection.createStatement();
			//4
			ResultSet resultset= statement.executeQuery("select * from employee ");
			while(resultset.next()) {
				System.out.println(resultset.getInt(1)+" "+resultset.getString(2));
				
			}
			connection.close();
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
