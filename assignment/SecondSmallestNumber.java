package week1.day2.assignment;

public class SecondSmallestNumber {

	public static void main(String[] args) {

		int a[]= {20,30,10,40,50};
		int temp;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
			
				if(a[i]>a[j]) {
					
					
					

					temp=a[i];
					System.out.println("Temp  is "+ temp);


					a[i]=a[j];
					System.out.println("a[i]  is "+ a[i]);


					a[j]=temp;
					System.out.println("a[j]  is "+ a[j]);

					
					
				}
			}
		}
		System.out.println(a[1]);

	}

}
