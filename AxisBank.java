package methodoverriding;

public class AxisBank extends BankInfo{
	
public void deposit() {
		
		System.out.println("Depost limit will be 1Lakh");
		
	}
	
public static void main(String[] args) {
	AxisBank axis=new AxisBank();
	axis.deposit();
}
	

}
