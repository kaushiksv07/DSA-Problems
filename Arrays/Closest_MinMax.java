/*
Given an array A, find the size of the smallest subarray such that 
it contains at least one occurrence of the maximum value of the array
and at least one occurrence of the minimum value of the array.

Eg : A = [2, 6, 1, 6, 9]
o/p: 3
*/

public class Solution {
    public int solve(ArrayList < Integer > A) {
        int minVal = minValue(A);
        int maxVal = maxValue(A);
        if (minVal == maxVal) {
            return 1;
        }
        int min_idx = -1;
        int max_idx = -1;
        int occ = Integer.MAX_VALUE;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == minVal) {
                min_idx = i;
            } else if (A.get(i) == maxVal) {
                max_idx = i;
            }
            if (min_idx != -1 && max_idx != -1) {
                int lenght = Math.abs(max_idx - min_idx) + 1;
                occ = Math.min(occ, lenght);
            }
        }
        return occ;
    }
    public int minValue(ArrayList < Integer > arr) {
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < minVal) {
                minVal = arr.get(i);
            }
        }
        return minVal;
    }
    public int maxValue(ArrayList < Integer > arr) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > maxValue) {
                maxValue = arr.get(i);
            }
        }
        return maxValue;
    }
}