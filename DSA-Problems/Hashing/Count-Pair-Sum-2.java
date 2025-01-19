/*
You are given an array A of N integers and an integer B. Count the number of pairs (i,j) such that A[i] + A[j] = B and i ≠ j.
Since the answer can be very large, return the remainder after dividing the count with 109+7.
Note - The pair (i,j) is same as the pair (j,i) and we need to count it only once.


A = [3, 5, 1, 2]
B = 8

op: 1
*/

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int count = 0;
        int MOD = 1_000_000_007;
        for(int val : A){
            int target = B - val;
            if(h.containsKey(target)){
                int freq = h.get(target);
                count += freq;
            } 
            if(h.containsKey(val)){
                int freq = h.get(val);
               h.put(val, freq + 1);
            }else{
                 h.put(val, 1);
            }
        }
        return count%MOD;
    }
}
