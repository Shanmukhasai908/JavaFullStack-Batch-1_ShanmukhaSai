package com.ram.learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
record details(int id,String name) {};

public class student {
	
	public static final String DB_URLTOCONNECT = "jdbc:mysql://localhost:3306/karthik";

	public static final String DB_USERNAME = "root";

	public static final String DB_PASSWORD = "";
	
	String qry;
	
	static  Connection dbConnection;
	
	static Statement theStatement;
	
	static ResultSet resultSet;


	public static void main(String[] args) {
		
		try {
//			1. Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

//			2. Try to establish the connection
			dbConnection = DriverManager.getConnection(DB_URLTOCONNECT, DB_USERNAME, DB_PASSWORD);
			
//			Get a reference to the Statment object
			theStatement = dbConnection.createStatement();
			System.out.println("db connected");
		
			
		}		

		catch (ClassNotFoundException | SQLException e) {
			System.out.println("Problems while connecting to the db : " + e.getMessage());
		}
		new student().getAllLearners();
		
}
	void getAllLearners() {

		try {
			
			//Write the query to fetch all learners
			qry = "select * from student";
			

			
//			Get a reference to the ResultSet object
			resultSet = theStatement.executeQuery(qry);
			
//			Traverse through the results
			while(resultSet.next()) {
				System.out.println(resultSet.getString("name")
						+ " with ID : "
						+ resultSet.getInt("id"));
			}
			
//			Close the connection
			dbConnection.close();
			
			
			
		} catch (SQLException e) {
			System.out.println("Issues while reading from table  : " + e.getMessage());
		}
	}
	public void drink() {
		// TODO Auto-generated method stub
		
	}
}
