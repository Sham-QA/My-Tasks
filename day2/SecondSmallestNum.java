package week1.day2;

public class SecondSmallestNum {

	public static void main(String[] args) {
		  
		   int[] arr = {5, 2, 8, 1, 9, 3};

	   
	    int smallest = Integer.MAX_VALUE;
	    int secondSmallest = Integer.MAX_VALUE;

	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] < smallest) {
	            // Update both smallest and second smallest
	            secondSmallest = smallest;
	            smallest = arr[i];
	        } else if (arr[i] < secondSmallest && arr[i] != smallest) {
	            // Update only second smallest
	            secondSmallest = arr[i];
	        }
	    }

	  
	    System.out.println("Second smallest number is: " + secondSmallest);
	}
	}
