package arcadis;
 import java.sql.*;
// C:\oracle\product\10.2.0\db_1\jdbc\lib\ojdbc14.jar
public class hello {
	public static void main(String[] args) throws Exception{
		System.out.println("type 2 driver demo");
		Class.forName("com.mySql.cj.jdbc.driver");
		Connection con=DriverManager.getConnection("jdbc:mySql://localHost:3306:/suleman","root","root");
		Statement st=con.createStatement();
		boolean rs=st.execute("create table emp(empno integer, ename varchar2(10), salary number(6)");
		
	}
}
