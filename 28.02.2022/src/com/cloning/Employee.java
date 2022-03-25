package com.cloning;

public class Employee implements Cloneable{
	
		
		int id;
		String name;
		
		//constructor
		public Employee() 
		{
			id = 4930;
			name = "jaya";
		}
		
		
		public void getStudentInfo()
		{
			System.out.println(id);
			System.out.println(name);
		}
		
		public static void main(String[] args) throws CloneNotSupportedException
		{
			
			System.out.println("=========by using new keyword and constructor=========");
			
		
			Employee employee = new Employee();
			employee.getStudentInfo();
			
			System.out.println("=========by using clone() method=========");
			
			
			Employee employee2 = (Employee) employee.clone();
			
			employee2.getStudentInfo();
			
		}
		
		
	}

	


