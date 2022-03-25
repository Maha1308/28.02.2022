package com.cloning;

public class hotel  implements Cloneable{
	
	String food_name;
	double food_rate;
	

		
		public hotel() 
		{

			food_name = "dosa";
			 food_rate= 40;
			
			
		}
		
		public void getDetails()
		{
			
			System.out.println(food_name);
			System.out.println(food_rate);
		}
		
		public static void main (String[] args) throws CloneNotSupportedException
		{

			System.out.println("***************by using new keyword and constructor************");
			hotel Hotel = new hotel();
			Hotel.getDetails();
			
		
			
			
			System.out.println("****************by using clone() method*************");
			hotel Hotel2 = new hotel();
			Hotel2.getDetails();
			
		}


}
