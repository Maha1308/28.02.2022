package com.cloning;

public class student {
	int roll_no;
	String student_name;
	double student_mark;
public  student()
{
	roll_no=786;
	student_name="devi";
	student_mark=567.90;
	
	
}
public void getinfo ()
{
	System.out.println("student_rollno:"+roll_no);
	System.out.println("student_name:"+student_name);
	System.out.println("student_mark:"+student_mark);
}

	public static void main(String[] args) throws CloneNotSupportedException
	{

		System.out.println("=========by using new keyword and constructor=========");
		student Student=new student();
		Student.getinfo();
		
		System.out.println("=========by using clone() method=========");
		student Student1=new student();
		Student1.getinfo();
	}

}
