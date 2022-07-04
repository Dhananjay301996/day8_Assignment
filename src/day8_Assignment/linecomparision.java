package day8_Assignment;

import java.util.*;

public class linecomparision {
	
		
		static int x1 = 1 , x2 = 2 , x3 = 3 , x4 = 4;
		static int y1 = 5 , y2 = 6 , y3 = 7 , y4 = 8;
		int lenght_of_line1;
		int lenght_of_line2;
		
		
		void length_of_line() {
			
			System.out.println("Welcome to Line Comparision Program");
		
		int lenght_of_line1 = (int) Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
		int lenght_of_line2 = (int) Math.sqrt(Math.pow((x4-x3),2)+ Math.pow((y4-y3),2));
		
		System.out.println("Lenght of line1 = "+lenght_of_line1);
		System.out.println("Lenght of line2 = "+lenght_of_line2);

}
		
		void equal_method() {
			
			if (Objects.equals(lenght_of_line1,lenght_of_line2))
	        {
	            System.out.println("length of line 1 is equal length of line 2");
	        }
	        else
	        {
	            System.out.println("length of line 1 is not equal to length of line 2");
	        }
			
		}
		
		void compare_method(){
			 int compare = Integer.compare (lenght_of_line1,lenght_of_line2);

		        if(compare == 0) {
		            System.out.println("length of line 1 is greater than length of line 2 ");
		        }
		        else {
		            System.out.println("length of line 2 is greater than length of line 1 ");
		        }
			
		}
		


		public static void main(String[] args) {
			linecomparision linecomparision = new linecomparision();
			linecomparision.length_of_line();
			linecomparision.equal_method();
			linecomparision.compare_method();

			
		}}