package com.manisha.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlJdbcConnection {

	public static void main(String[] args) {
		
		try {
			//Step1: Load and register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step2: Establish a connection to the retailStore database
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/retailstore", "root", "admin");
			
			//Step3: Create a statement object and perform insertion operation 
			Statement statement = connection.createStatement();
			statement.executeUpdate("insert into product values (10, 'Durga', '12.50')");
			System.out.println("Insertion successful");
			
			//Step4: Close the connection
			connection.close();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
