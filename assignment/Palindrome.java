package week1.day2.assignment;

public class Palindrome {

	public static void main(String[] args) {

		int num=12345;
		int rev=0;
		int remainder;
		
		for(;num!=0;num=num/10) {
			remainder=num%10;
			
			
			rev=rev*10+remainder;
			
			System.out.println(rev);
			
		
			}
			if(num==rev) {
				System.out.println("Palindrome");
			}	
		}
		
		
	
	
	
	
	
}
	


