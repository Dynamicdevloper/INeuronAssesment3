package in.ineuron;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {4,3,2,1};
		nextPermutation(arr);
		for(int num : arr) {
			System.out.print(num+" ");
		}
	}
	
	public static int[] nextPermutation(int[] arr) {
		
		if(arr.length<=1) return arr;
		
		int i= arr.length-2;
		
		while(i>=0 && arr[i]>=arr[i+1]) i--;
		
		if(i>=0) {
			
			int j=arr.length-1;
			if(j>=0 && arr[j]<=arr[i]) j--;
			swap(arr, i, j);
		}
		
		reverse(arr, i+1, arr.length-1);
		return arr;
	}

	private static void reverse(int[] arr, int i, int j) {
		while(i<=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

}
