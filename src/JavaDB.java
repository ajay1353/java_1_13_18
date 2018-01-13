import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaDB {

	public static void main(String args[]) {

		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/", "postgres",
					"adn652");

			System.out.println("Schema" + con.getSchema());

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
