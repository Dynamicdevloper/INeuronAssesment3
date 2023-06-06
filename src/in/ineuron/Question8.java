package in.ineuron;

import java.util.Arrays;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] intervals= {{0,30}, {0,10}, {15, 20}};
		System.out.println(attendMeetings(intervals));
		
	}
	
	public static boolean attendMeetings(int[][] intervals) {
		
		Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));
		
		for(int i=1; i<intervals.length; i++) {
			if(intervals[i][0]<intervals[i-1][1]) return false;
		}
		return true;
	}

}
