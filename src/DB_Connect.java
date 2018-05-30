import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB_Connect {
	static Statement stmt;
	
	static void connect()throws Exception{
		String CONNECTION = "jdbc:mariadb://140.127.74.184:4406/myfirst";
		Class.forName("org.mariadb.jdbc.Driver");
		Properties p = new Properties();
	    p.put("user","root");
	    p.put("password","jordan123451");
		Connection testCon = DriverManager.getConnection(CONNECTION, p);
		stmt = testCon.createStatement();
		System.out.println(123);
	}
	
	
}
