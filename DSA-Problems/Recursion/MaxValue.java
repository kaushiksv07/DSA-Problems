/*
Max of an Array Using Recursion
Given an array A of size N, write a recursive function that returns the maximum element of the array.
i/p:A = [12, 10, 3, 4, 5]
o/p:12
*/

public class Solution {
    public int getMax(ArrayList<Integer> A) {
        return maxElm(A, 1, A.get(0));
    }
    public int maxElm(ArrayList<Integer> A, int i, int max){
        if(i == A.size()){
            return max;
        }
        if(A.get(i) > max){
            max = A.get(i);
        }
        return maxElm(A, i+1, max);
    }
}

