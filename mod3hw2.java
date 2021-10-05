package Java;
import java.util.Scanner;

public class mod3hw2 {

	public static void main(String[] args) {
		
		
		System.out.println("Question 1");
		
		// Question #1 : Write Fibonnaci series between the user entered start and end values
		
		Scanner Fib = new Scanner(System.in);
		
		System.out.println("Please Enter a Start Value ");
		Double Start = Fib.nextDouble();
		
		System.out.println("Please Enter an End Value ");
		Double End = Fib.nextDouble();
		
		int num1 = 0;
		int num2 = 1;
		
		int count = 0;
		
//		for(int i=0; i < End; i++) {
//			if(i >= Start) {
//			count = num1 + num2;
//			num1 = num2;
//			num2 = count;
//			
		for (int i = 1; i <= End; i++) {
	    	if (i == 1 && i >= Start) {
	    		System.out.println(i + " position in Fibonacci sequence is " + i);
	    	}
	    	else if (i >= Start) {
	        	System.out.println(i + " position in Fibonacci sequence is " + count);
	        	}
	        count = num2 + num1;
	        num1 = num2;
	        num2 = count;
	    }

			

		
		
		
		
		
		
		
		
		
		
		System.out.println("Question 2");
		
		// Question #2 : Determine whether a user entered number is an Armstrong number
		
		int number = 371, originalNumber, remainder, result = 0;
		
		Scanner scann = new Scanner(System.in);
		System.out.println("Enter a number, is it an Armstrong number?");
		number = scann.nextInt();

		
        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Question 3");
		// Question #3 : Write a program to see if a user entered string is a palindrome or not
	
		String str, rev ="";
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a string is it a palindrome?");
		str = sc.nextLine();
		
		
		int length = str.length();
		
		for(int i = length - 1; i >=0; i-- )
			rev = rev + str.charAt(i);
		
		
		if(str.equals(rev))
			System.out.println(str + "is a palindrome!!");
		else
			System.out.println(str + "is not a palindrome!!");
	}
	
	
	
	
	
	
	}
	


