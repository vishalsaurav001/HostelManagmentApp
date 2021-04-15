package com.hostel.vishal003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class start {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO HOSTEL MANAGEMENT APP");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(true) {
    	System.out.println("PRESS 1 to ADD person");
    	System.out.println("PRESS 2 to DELETE person");
    	System.out.println("PRESS 3 to DISPLAY person");
    	System.out.println("PRESS 4 to EXIT person");
    	int c = Integer.parseInt(br.readLine());
    	
    	if (c==1) {
    		//add person..
    		System.out.println("Enter user Name : ");
    		String name = br.readLine();
    		
    		System.out.println("Enter user Phone : ");
    		String phone = br.readLine();
    		
    		System.out.println("Enter user Address : ");
    		String address = br.readLine();
    		
    		//create student object to store person details
    		Student st =new Student(name , phone ,address);
    		boolean answer = StudentDao.insertStudentToDB(st);
    		if(answer) {
    			System.out.println("Person is added Successfully...");
    		}else {
    			System.out.println("Something went Worng try Again...");
    		}
    		System.out.println(st);
    		
    	}else if (c==2) {
    		//delete person..
    		System.out.println("Enter Person id to delete : ");
    		int userId=Integer.parseInt(br.readLine());
    		boolean f = StudentDao.deleteStudent(userId);
    		if(f) {
    			System.out.println("Deleted.....");
    		}else {
    			System.out.println("Something went Worng......");
    		}
    		
    	}else if (c==3) {
    		//display person..
    		StudentDao.showAllStudent();
    	}else if (c==4) {
    		// exit
    		break;
    	}else {
    	
      }
   }
   System.out.println("THANKYOU for ussing my application ....");
    System.out.println("See you soon ..... bye bye :)");
 }
}