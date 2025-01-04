/*
 You have a set of non-overlapping intervals. You are given a new interval [start, end],
  insert this new interval into the set of intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.

Given intervals [1, 3], [6, 9] insert and merge [2, 5] .

[ [1, 5], [6, 9] ]

(2,5) does not completely merge the given intervals
*/

public class Solution {
    public ArrayList < ArrayList < Integer >> insert(ArrayList < ArrayList < Integer >> A, ArrayList < Integer > B) {
        ArrayList < ArrayList < Integer >> ans = new ArrayList < > ();
        int a1 = B.get(0);
        int b1 = B.get(1);
        int n = A.size();
        int i = 0;
        while (i < n) {
            int a2 = A.get(i).get(0);
            int b2 = A.get(i).get(1);

            if (a1 > b2) {
                ans.add(A.get(i));
            } else if (b1 < a2) {
                ArrayList < Integer > row1 = new ArrayList < > ();
                row1.add(a1);
                row1.add(b1);
                ans.add(row1);
                while (i < n) {
                    ans.add(A.get(i));
                    i++;
                }
                return ans;
            } else {
                a1 = Math.min(a1, a2);
                b1 = Math.max(b1, b2);
            }
            i++;
        }
        ArrayList < Integer > row4 = new ArrayList < > ();
        row4.add(a1);
        row4.add(b1);
        ans.add(row4);
        return ans;
    }
}

