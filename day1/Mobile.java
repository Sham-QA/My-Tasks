package week1.day1;

public class Mobile {
	

	public void Makecall() {
	
	String mobileModel= ("iphone");
	float mobileWeight= 187.2f;
	
	System.out.println("mobile model:"+mobileModel);
	System.out.println("mobile Weight:"+ mobileWeight +"g");
	
	}
	
	public void  Sendemessage() {
		
		boolean isFullcharged = true;
		int mobilecost = 55000;
		
		System.out.println("Is fullycharged " +isFullcharged);
		System.out.println("Mobile cost: " + mobilecost);

	} 
	
	public static void main(String[] args) {
		Mobile value = new Mobile();
		
	    value.Makecall();
	    value.Sendemessage();
	    System.out.println("This is My Mobile");
	
	}
	
		
	}



