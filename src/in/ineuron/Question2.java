package in.ineuron;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question2 {
	
	
	 public static void main(String[] args) {
	        int[] kun = {1, 0, -1, 0, -2, 2};
	        int tar = 0;
	        List<List<Integer>> result = fourSum(kun, tar);
	        System.out.println(result);
	    }

	public static List<List<Integer>> fourSum(int[] kun, int tar) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(kun);

        int n = kun.length;
        for (int a = 0; a < n - 3; a++) {
        
            if (a > 0 && kun[a] == kun[a - 1]) {
                continue;
            }

            for (int b = a + 1; b < n - 2; b++) {
  
                if (b > a + 1 && kun[b] == kun[b - 1]) {
                    continue;
                }

                int lef = b + 1;
                int rig = n - 1;
                while (lef < rig) {
                    int currentSum = kun[a] + kun[b] + kun[lef] + kun[rig];

                    if (currentSum == tar) {
                        result.add(Arrays.asList(kun[a], kun[b], kun[lef], kun[rig]));


                        while (lef < rig && kun[lef] == kun[lef + 1]) {
                            lef++;
                        }
                        while (lef < rig && kun[rig] == kun[rig - 1]) {
                            rig--;
                        }

                        lef++;
                        rig--;
                    } else if (currentSum < tar) {
                        lef++;
                    } else {
                        rig--;
                    }
                }
            }
        }

        return result;
    }

}
