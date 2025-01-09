/*
Fast Power

Given two positive integers A and B. Implement Fast Power function to compute AB
i/p:
    A = 2 , B = 10
o/p:
    1024
*/

public class Solution { nvb
    public Long power(int A, int B) {
        if(B == 0){
            return (long)1;
        }
        long sa =  power(A, B/2);
        if(B %2 == 0){
            return sa * sa;
        }else{
            return sa * sa * A;
        }
    }
}
