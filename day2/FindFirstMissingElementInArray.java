package week1.day2;
import java.util.Arrays;

public class FindFirstMissingElementInArray {
	
	
	    public static void main(String[] args) {
	        // Here is the input
	        int[] array = {1, 2, 3, 4, 7, 6, 8};

	        //  Sort the array
	        Arrays.sort(array); // Now array becomes {1, 2, 3, 4, 6, 7, 8}

	        // Loop through the array
	        for (int i = 0; i < array.length; i++) {
	            // Here we expect each number to be i+1
	            if (array[i] != i + 1) {	
	                System.out.println("Missing number is: " + (i + 1));
	                break; 
	                //Stop after finding first missing
	            }
	        }
	    }
	}

