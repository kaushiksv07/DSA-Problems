/*
Check Palindrome using Recursion

Write a recursive function that checks whether string A is a palindrome or Not.
Return 1 if the string A is a palindrome, else return 0.

Note: A palindrome is a string that's the same when read forward and backward.

Example Input
    Input 1:
        A = "naman"
    Input 2:
        A = "strings"
    Example Output
        Output 1:
            1
        Output 2:
            0
    Example Explanation
        Explanation 1:
            "naman" is a palindomic string, so return 1.
        Explanation 2:
            "strings" is not a palindrome, so return 0.
*/

public class Solution {
    public int solve(String A) {
         return checkIfPalindrome(A, 0, A.length()-1);
    }
    public int checkIfPalindrome(String A, int f, int l){
        if(f >= l){
            return 1;
        }
        if(A.charAt(f) != A.charAt(l)){
            return 0;
        }
        return checkIfPalindrome(A, f+1, l-1);
    }
}
