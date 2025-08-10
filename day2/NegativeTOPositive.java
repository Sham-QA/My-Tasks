package week1.day2;

public class NegativeTOPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Number=-40;
	
		
		//to check whether the number is in positive or negative
		if (Number<0) {
			//chaning the negative num to positive num by Math 
			int positiveNumber = Math.abs(Number);
			System.out.println("The number "+Number+" is converted to "+positiveNumber);
			
		}else {
			System.out.println("The given number is positive number");
		}

	}

}
