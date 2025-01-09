/*
 All Indices Of Array

Given an array of integers A with N elements and a target integer B, the task is to find all the indices at which B occurs in the array.

A = [1, 2, 3, 4, 5]
B = 1

[0]

A = [8, 9, 5, 6, 5, 5]
B = 5

[2, 4, 5]
*/

public class Solution {
    public ArrayList<Integer> allIndices(ArrayList<Integer> A, int B) {
        ArrayList<Integer> sol = new ArrayList<>();
        return findSameValues(A, B, 0, sol);
    }
    public ArrayList<Integer> findSameValues(ArrayList<Integer> A, int B, int i, ArrayList<Integer> sol){
        if(i == A.size()){ 
            return sol;
        }
        
        if(B == A.get(i)){
            sol.add(i);
        }
        return findSameValues(A, B, i+1, sol);
    }
}
