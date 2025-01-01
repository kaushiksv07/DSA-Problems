/*
You have given a string A having Uppercase English letters.

You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.

Eg : A = "ABCGAG"
o/p: 3
*/

public class Solution {
    public Long solve(String A) {
        long ans = 0;
        int gcount = 0;
        long acount = 0;
        int n = A.length();
        for (int i = n - 1; i >= 0; i--) {
            if (A.charAt(i) == 'G') {
                gcount++;
            } else if (A.charAt(i) == 'A') {
                acount = acount + gcount;
            }

        }
        return acount;
    }
}