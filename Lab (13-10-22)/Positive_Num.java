package Raj_Singh;

import java.util.Scanner;

public class Positive_Num {

	public static void main(String[] args) {

		 int sum = 0;
		    int number = 0;

		    // create an object of Scanner class
		    Scanner sc = new Scanner(System.in);
		    
		    // do...while loop continues 
		    // until entered number is positive
		    do {
		      // add only positive numbers
		      sum += number;
		      System.out.print("Enter a number: ");
		      number = sc.nextInt();
		      
		    } while(number >= 0); 
		    
		    System.out.println("Sum is = " + sum);
		    sc.close();
	}

}
