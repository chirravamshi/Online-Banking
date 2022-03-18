package DbCongiguration;
import java.util.*;
import java.sql.*;
public class DbConfigure {
	static Connection con=null;
	static Statement st;
	public static Statement dbConnection() {
	Scanner obj=new Scanner(System.in);
	String url="jdbc:postgresql://localhost:5432/revaturebank";
	String user="postgres";
	String psw="Aravindh@123";
	try {
	Class.forName("org.postgresql.Driver");
	con=DriverManager.getConnection(url,user,psw);
	st=con.createStatement();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	return st;
	}
}
