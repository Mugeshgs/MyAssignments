package week1.day2.assignment;

public class SmallestNumber {

	public static void main(String[] args) {

		int arr[]= {20,30,40,10,50};
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>min) {
				System.out.println("arr[i]"+arr[i]+" is greater than min" +min);
			}
			else if(arr[i]<min){
				
				min=arr[i];
				System.out.println("arr[i]"+arr[i]+" is lesser than min" +min);

			}
			
		}
			
		
	}

}
