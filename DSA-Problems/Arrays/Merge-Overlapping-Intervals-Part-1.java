/*
 You are given a collection of intervals A in a 2-D array format, where each interval is represented by a pair
of integers `[start, end]`. The intervals are sorted based on their start values.

Your task is to merge all overlapping intervals and return the resulting set of non-overlapping intervals.

i/p: [ [1, 3], [2, 6], [8, 10], [15, 18] ]
o/p: [ [1, 6], [8, 10], [15, 18] ]

exp: Merge intervals [1,3] and [2,6] -> [1,6].
so, the required answer after merging is [1,6],[8,10],[15,18].
No more overlapping intervals present.
*/

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = A.size();
        int a1 = A.get(0).get(0);
        int b1 = A.get(0).get(1);
        for(int i=1;i<n;i++){
            int a2 = A.get(i).get(0);
            int b2 = A.get(i).get(1);
            if(b1 >= a2){
                a1 = Math.min(a1, a2);
                b1 = Math.max(b1, b2);
            }else{
                ArrayList<Integer> row = new ArrayList<>();
                row.add(a1);
                row.add(b1);
                ans.add(row);
                a1 = a2;
                b1 = b2;
            }
        }
        ArrayList<Integer> row = new ArrayList<>();
        row.add(a1);
        row.add(b1);
        ans.add(row);
        return ans;
    }
}

