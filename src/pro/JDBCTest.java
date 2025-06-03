package pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCTest {

	public static void main(String[] args) {
		try {
		// 1. Load the JDBC driver
		Class.forNaame("com.mysql.cj.jdbc.Driver");
		// 2. Connect to the databse
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testtb","root","Madhu@123");
		//3. Insert multiple students		
		String insertSQL = "REPLACE INTO STUDENT VALUES (?, ?)";
		PreparedStatement pstmt =con.prepareStatement(insertSQL);
		// Inserting 6 students(1 existing + 5 new)
		Object[][] students = {
				{1, "Alice"},
				{2, "Bob"},
				{3, "Charlie"},
				{4, "David"},
				{5, "Eve"},
				{6, "Fiona"}
		};
		
		for (Object[] student :students) {
			pstmt.setInt(1, (int) student[0]);
			pstmt.setString(2, (String)student[1]);
			pstmt.executeUpdate();
		}
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM students");
		System.out.println("Student List");
		while(rs.next()) {
			System.out.println(rs.getInt("id") + " " + rs.getString("name"));
		}
		
		con.close();


		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		}
		

}
