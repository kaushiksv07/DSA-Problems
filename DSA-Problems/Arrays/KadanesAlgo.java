/*
Kadans algo - find maximum sum of subarray in array

A[] =  5 6 7 3 2 10 12 8 12 21 4 7
Sfm =  5 11 18 15 17 7 -5/0 8 20 41 37 44
Max =  5 11 18 18 18 18 18 18 20 41 41 44



*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List < Integer > A) {
        //kadans algo
        // mss -> maximum subarray sum
        int mss = Integer.MIN_VALUE;
        int sum = 0;
        int n = A.size();
        for (int i = 0; i < n; i++) {
            sum += A.get(i);
            mss = Math.max(sum, mss);
            if (sum < 0) {
                sum = 0;
            }
        }
        return mss;
    }
}