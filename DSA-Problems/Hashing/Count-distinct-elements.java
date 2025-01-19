/*
Given an array A of N integers, return the number of unique elements in the array.

A = [3, 4, 3, 6, 6]
o/p: 3
*/

public class Solution {
    public int solve(ArrayList<Integer> A) {
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<A.size();i++){
            h.add(A.get(i));
        }
        return h.size();
    }
}
