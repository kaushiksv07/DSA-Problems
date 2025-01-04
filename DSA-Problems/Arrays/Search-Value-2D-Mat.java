/*
 Search in a row wise and column wise sorted matrix

 Given a matrix of integers A of size N x M and an integer B.

In the given matrix every row and column is sorted in non-decreasing order. Find and return the position of B in the matrix in the given form:
If A[i][j] = B then return (i * 1009 + j)
If B is not present return -1.

Note 1: Rows are numbered from top to bottom and columns are numbered from left to right.
Note 2: If there are multiple B in A then return the smallest value of i*1009 +j such that A[i][j]=B.
Note 3: Expected time complexity is linear
Note 4: Use 1-based indexing
i/p: A = [[1, 2, 3]
     [4, 5, 6]
     [7, 8, 9]]
B = 2

o/p: 1011
*/

public class Solution {
    public int solve(ArrayList < ArrayList < Integer >> A, int B) {
        int ans = Integer.MAX_VALUE;
        boolean found = false;
        int i = 0;
        int j = A.get(0).size() - 1;

        int n = A.size();
        while (i < n && j >= 0) {
            if (A.get(i).get(j) == B) {
                found = true;
                ans = Math.min(ans, (i + 1) * 1009 + (j + 1));
                j--;
            } else if (A.get(i).get(j) < B) {
                i++;
            } else {
                j--;
            }
        }
        if (found) {
            return ans;
        } else {
            return -1;
        }
    }
}