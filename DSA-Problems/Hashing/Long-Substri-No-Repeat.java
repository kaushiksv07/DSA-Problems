/*
Longest Substring Without Repeat

Determine the "GOOD"ness of a given string A, where the "GOOD"ness is defined by the 
length of the longest substring that contains no repeating characters. The greater 
the length of this unique-character substring, the higher the "GOOD"ness of the string.

Your task is to return an integer representing the "GOOD"ness of string A.


A = "abcabcbb"
o/p:  3

Substring "abc" is the longest substring without repeating characters in string A.
*/

public class Solution {
    public int lengthOfLongestSubstring(String A) {
        char[] c = A.toCharArray();
        int p1 = 0;
        int p2 = 0;
        int count = 0;
        int n = A.length();
        HashSet<Character> h = new HashSet<>(); 
        while(p2 < n){
            if(!h.contains(c[p2])){
                h.add(c[p2]);
                p2++;
            }else{
                while(h.contains(c[p2])){
                    h.remove(c[p1]);
                    p1++;
                }
            }
            count = Math.max(count, p2-p1);
        }
        return count;
    }
}
