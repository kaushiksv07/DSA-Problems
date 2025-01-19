/*
Given an Array of integers B, and a target sum A.
Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j.

Input 1:
    A = 8   
    B = [3, 5, 1, 2, 1, 2]
    Output ->1
Input 2:
    A = 21   
    B = [9, 10, 7, 10, 9, 1, 5, 1, 5]
    Output -> 0
*/

public class Solution {
    public int solve(int A, ArrayList<Integer> B) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<B.size();i++){
            int target = A - B.get(i);
            if(set.contains(target)){
                return 1;
            }else{
                set.add(B.get(i));
            }
        }
        return 0;
    }
}
