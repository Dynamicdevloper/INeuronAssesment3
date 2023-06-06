package in.ineuron;

public class Question5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FastScanner fs=new FastScanner();
		int n= fs.nextInt();
		int[] arr= new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=fs.nextInt();
		}
		
		int[] ans =sumOfDigits(arr, n);
		
		for(int i: ans) {
			System.out.print(i);
		}
	}

	private static int[] sumOfDigits(int[] arr, int n) {
		
		for(int i=n-1; i>=0; i--) {
			arr[i]+=1;
			
			if(arr[i]<10) {
				return arr;
			}
			
			arr[i]=0;
		}
		
		arr=new int[n+1];
		arr[0]=1;
		return arr;
	}


}
