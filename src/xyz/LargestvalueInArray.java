package xyz;

public class LargestvalueInArray {
	public static void main(String[] args) {
		int[] arr={28,3,15,9,17,4,23,2};
		int j=arr[0]; 
		for(int i=0; i<arr.length; i++){
			if(arr[i] > j){
				j=arr[i];
			}
		}
		System.out.println("Largest value in the Given Array is "+ j);
	}		
	
	

}
