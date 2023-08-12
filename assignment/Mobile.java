package week1.day1.assignment;

public class Mobile {
	
	public void makecall() {
		
		String mobileModel="Nokia";
		float mobileWeight=12.5f;
		
		System.out.println("Mobile model is: " + mobileModel + 
				" and the " + "Mobile Weight is :" + mobileWeight);
		
	}
	
	public void sendMsg() {
		boolean isFullCharged=true; 
		int mobileCost=30000;
		
		System.out.println("Is your mobile is fully charged ?: " + isFullCharged + 
				" and the " + "Cost of my Mobile is :" + mobileCost);
	}
	
	
	
	public static void main(String args[]) {
		
		Mobile m=new Mobile();
		
		System.out.println("This is My Mobile");
		
		m.makecall();
		m.sendMsg();
		
		
		
		
		
	}

}
