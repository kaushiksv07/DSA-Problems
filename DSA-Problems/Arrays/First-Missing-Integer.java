/*
 Given an unsorted integer array, A of size N. Find the first missing positive integer.
 Note: Your algorithm should run in O(n) time and use constant space.

 ip: [3, 4, -1, 1]
 op : 2
*/

public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        int i=0;
        int n = A.size();
        while(i<n){
            if(A.get(i) > 0 && A.get(i)<=n){
                int correctIdx = A.get(i) -1;
                if(A.get(i) != A.get(correctIdx)){
                    A = swap(i, correctIdx, A);
                }else{
                    i++;
                }
            }else{
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(A.get(j) -1 != j){
                return j+1;
            }
        }
        return n+1;
    }
    public ArrayList<Integer> swap(int i, int j,ArrayList<Integer> A){
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
        return A;
    }
}
