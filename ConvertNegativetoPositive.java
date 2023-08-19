package week1.day2.assignment;

public class ConvertNegativetoPositive {

	public static void main(String[] args) {

		int a=-40;
		if(a<0) {
			System.out.println("This is a Negative Number");
			System.out.println("Converting -ve to +ve:" + a + " to " + a*-1);
		}
else if(a>0) {
			
			System.out.println("The number is Positive");
		}
		else {
			System.out.println("The number is neither Positive nor Negative");
		}
	}
	}

