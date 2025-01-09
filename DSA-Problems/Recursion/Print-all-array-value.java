/*
 Print Array using Recursion

You are given an array A. Print the elements of the array using recursion.

Note: A palindrome is a string that's the same when read forward and backward.

A = [6, -2, 5, 3]

6 -2 5 3 
*/

public class Solution {
    public void PrintArray(ArrayList<Integer> A) {
        print(A, 0);
        System.out.println();
    }
    public void print(ArrayList<Integer> A, int i){
        if(i == A.size()){
            return;
        }
        System.out.print(A.get(i));
        System.out.print(" ");
        print(A, i+1);
    }
}
