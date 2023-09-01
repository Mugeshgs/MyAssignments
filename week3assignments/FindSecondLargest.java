package week3assignments;

public class FindSecondLargest {

	public static void main(String[] args) {

int [] arr= {3,2,11,4,6,7};
int count=0;
int i,j;
int size=arr.length;

for(i=0;i<size;i++) {
	for(j=i+1;j<size;j++) {
		
		if(arr[i]>arr[j]) {
			
			count=arr[i]; 
			arr[i]=arr[j];
			arr[j]=count;
		
			
		}
		
	}



	System.out.print(arr[i]);
	
	System.out.print("\n");
}


System.out.print("Second largest number: "+arr[size-2]);



	}

}
/*
Compare the first two elements of the array
If the first element is greater than the second swap them.
Then, compare 2nd and 3rd elements if the second element is greater than the 3rd swap them.
Repeat this till the end of the array.
 * 
 */

