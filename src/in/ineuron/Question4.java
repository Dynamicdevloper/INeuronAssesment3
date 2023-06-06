package in.ineuron;

public class Question4 {

public static void main(String[] args) {
		
		FastScanner fs= new FastScanner();
		int n=fs.nextInt();
		int[] arr= new int[n];
		int element= fs.nextInt();
		
		for(int i=0; i<n; i++) {
			arr[i]=fs.nextInt();
		}
		
		int output= binarySearch(arr, n, element);
		System.out.println(output);
	}

	private static int binarySearch(int[] arr, int n, int element) {
		int start=0;
		int end=n-1;
		
		while(start<=end) {
			int mid= start +(end-start)/2;
			if(arr[mid]==element) {
				return mid;
			}else if(element>arr[mid]) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return start;
	}

}
