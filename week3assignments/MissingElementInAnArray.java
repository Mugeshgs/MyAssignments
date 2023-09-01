package week3assignments;

public class MissingElementInAnArray {
	
public static void main(String[] args) {
	 int[] arr = {1,2,3,4,7,6,8}; 
	 
     // Calculate n value  
     int n = arr.length + 1;

     // Calculate Sum of N Number 
     // using Math formula n(n+1)/2 
     int sumOfNNumbers = sumOfAllNNumbers(n);
     
     // Calculate Sum of all numbers in input array
     int sumOfInputArray = sumOfInputArrayNumbers(arr);
     
     // Calculate missing number

     int missingNumber = sumOfNNumbers - sumOfInputArray; 

     System.out.println("Missing number in an array is : " 
                                         + missingNumber);
 }
 
 public static int sumOfAllNNumbers(int n){
     int sum = (n*(n+1))/2;
     return sum;
 }
 
 public static int sumOfInputArrayNumbers(int[] input){
     int sum = 0;
     for(int i=0; i < input.length ;i++){
         sum = sum + input[i];
     }
     return sum;
 }
}


	

//0,1,2,3,4,5,6,7