package in.ineuron;

public class Question6 {

	public static void main(String[] args) {
		
			FastScanner fs= new FastScanner();
			int n=fs.nextInt();
			int[] arr= new int[n];
		
			for(int i=0; i<n; i++) {
				arr[i]=fs.nextInt();
			}
		
			int output= singleElement(arr, n);
			System.out.println(output);
	}

	private static int singleElement(int[] arr, int n) {
		
		int ans=arr[0];
		for(int i=1; i<n; i++) ans^=arr[i];
		return ans;
	}

}
