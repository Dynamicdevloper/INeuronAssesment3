package in.ineuron;

import java.util.ArrayList;
import java.util.List;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		    int[] nums = {0, 1, 3, 50, 75};
		    int lower = 0;
		    int upper = 99;
		    List<List<Integer>> missingRanges = findMissingRanges(nums, lower, upper);
		    System.out.println(missingRanges);
	}
	
	
	 public static List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
	        List<List<Integer>> ranges = new ArrayList<>();
	        int start = lower;

	        for (int num : nums) {
	            if (num > upper) {
	                break;
	            }

	            if (num == start) {
	                start++;
	            } else {
	                ranges.add(createRange(start, num - 1));
	                start = num + 1;
	            }
	        }

	        if (start <= upper) {
	            ranges.add(createRange(start, upper));
	        }

	        return ranges;
	    }

	    private static List<Integer> createRange(int start, int end) {
	        List<Integer> range = new ArrayList<>();
            range.add(start);
            range.add(end);

	        return range;
	    }

}
