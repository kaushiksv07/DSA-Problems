/*
 Given a 2D Matrix A of dimensions N*N, we need to return the sum of all possible submatrices.

 A = [ [1, 1]
      [1, 1] ]

o/p: 16
*/

public class Solution {
    public int solve(ArrayList < ArrayList < Integer >> A) {
        int n = A.size();
        int m = A.get(0).size();
        int total = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int topLeft = (i + 1) * (j + 1);
                int bottomLeft = (n - i) * (m - j);
                int occ = topLeft * bottomLeft;
                total = total + A.get(i).get(j) * occ;
            }
        }
        return total;
    }
}