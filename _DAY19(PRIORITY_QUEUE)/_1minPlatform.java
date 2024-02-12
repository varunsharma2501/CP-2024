// Approach 1 :using the array 

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n) {
        // first we will take all elements in a set
        if (n == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
            set.add(dep[i]);
        }

        Integer[] timing = set.toArray(new Integer[0]);
        Arrays.sort(timing);

        HashMap<Integer, Integer> timeInd = new HashMap<>();
        int i = 0;
        for (int t : timing) {
            timeInd.put(t, i);
            i++;
        }

        int[] array = new int[set.size()];
        // now traverse the arrays
        for (int j = 0; j < n; j++) {
            int st = arr[j];
            int en = dep[j];
            if (st == en) {
                continue;
            } else {
                int stInd = timeInd.get(st);
                int enInd = timeInd.get(en);
                // modify array arr
                for (i = stInd; i < enInd; i++) {
                    array[i]++;
                }
            }
        }

        // traverse array and return max value
        int max = 0;
        for (i = 0; i < array.length; i++) {
            max = Math.max(array[i], max);
        }
        return max;
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        int n = arr.length;
        System.out.println("Minimum number of platforms required: " + findPlatform(arr, dep, n));
    }
}
