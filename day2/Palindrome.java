package week1.day2;

public class Palindrome {

	 public static void main(String[] args) {
	        int num = 34343;
	        int temp = num;  
	        int reversed = 0;

	        // Reverse the number using for loop
	        for (int i = num; i > 0; i = i / 10) {
	            int digit = i % 10;         
	            reversed = reversed * 10 + digit;  
	        }

	       
	        if (temp == reversed) {
	            System.out.println(num + " is a palindrome number");
	        } else {
	            System.out.println(num + " is not a palindrome number");
	        }
	    }
	

	}