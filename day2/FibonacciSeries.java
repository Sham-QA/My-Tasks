package week1.day2;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {

		int  i=8,firstNum=0,secNum=1,sum ;
		
		System.out.println(firstNum);
	    System.out.println(secNum);

	  for(i=2; i<=8;i++) {
		  
		  sum=firstNum + secNum;
			firstNum = secNum;                                                          
			secNum = sum;
			
		
			System.out.println(sum);
	  }
   }

}
