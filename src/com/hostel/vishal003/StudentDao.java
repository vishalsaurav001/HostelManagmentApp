package com.hostel.vishal003;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class StudentDao {
	
	public static boolean insertStudentToDB(Student st) {
		
		boolean f=false;
		 
		try {
			//jdbc code ...
			Connection con = CP.createC();
			String q = "insert into hostels(hname,hphone,haddress) values(?,?,?)";
			//preparedStatment
			PreparedStatement pstmt = con.prepareStatement(q);
			//set the value of parameter
			pstmt.setString(1, st.getPersonName());
			pstmt.setString(2, st.getPersonPhone());
			pstmt.setString(3, st.getPersonAddress());
			
			//execute..
			pstmt.executeUpdate();
			f=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}

	public static boolean deleteStudent(int userId) {
		// TODO Auto-generated method stub
		boolean f=false;
		 
		try {
			//jdbc code ...
			Connection con = CP.createC();
			String q = "delete from hostels where hid=?";
			//preparedStatment
			PreparedStatement pstmt = con.prepareStatement(q);
			//set the value of parameter
			pstmt.setInt(1, userId);
			
			
			//execute..
			pstmt.executeUpdate();
			f=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}

	public static void  showAllStudent() {
		// TODO Auto-generated method stub
		 
		try {
			//jdbc code ...
			Connection con = CP.createC();
			String q = "select * from hostels;";
			Statement stmt=con.createStatement();
			
			ResultSet set = stmt.executeQuery(q);
			
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String address = set.getString(4);
				
				System.out.println("ID : "+id);
				System.out.println("Name : "+name);
				System.out.println("Phone : "+phone);
				System.out.println("Address : "+address);
				System.out.println("++++++++++++++++++++++++++++++");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
