git config --global user.name/*
Special Index

Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element 
from these indices makes the sum of even-indexed and odd-indexed array elements equal.
eg: A = [2, 1, 6, 4]
o/p: 1

explanation: Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1]. 
Therefore, the required output is 1. 

code:
*/

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> evenPreSum = new ArrayList<>();
        ArrayList<Integer> oddPreSum = new ArrayList<>();
        ArrayList<Integer> evenSufSum = new ArrayList<>();
        ArrayList<Integer> oddSufSum = new ArrayList<>();
        for(int i=0;i<n;i++){
            evenSufSum.add(0);
            oddSufSum.add(0);
        }
        evenPreSum.add(A.get(0));
        oddPreSum.add(0);
        for(int i=1;i<n;i++){
            if(i%2 == 0){
                evenPreSum.add(evenPreSum.get(i-1) + A.get(i));
                oddPreSum.add(oddPreSum.get(i-1));
            }else{
                oddPreSum.add(oddPreSum.get(i-1) + A.get(i));
                evenPreSum.add(evenPreSum.get(i-1));
            }
        }

        if((n-1)%2 == 0){
            evenSufSum.set((n-1), A.get(n-1));
            oddSufSum.set((n-1), 0);
        }else{
            oddSufSum.set((n-1), A.get(n-1));
            evenSufSum.set((n-1), 0);
        }
        for(int i=n-2;i>=0;i--){
            if(i%2 == 0){
                evenSufSum.set(i, evenSufSum.get(i+1) + A.get(i));
                oddSufSum.set(i, oddSufSum.get(i+1));
            }else{
                oddSufSum.set(i, oddSufSum.get(i+1) + A.get(i));
                evenSufSum.set(i, evenSufSum.get(i+1));
            }
        }

        int count = 0;
        for(int i=0;i<n;i++){
            int evenSum = (i == 0 ? 0 : evenPreSum.get(i-1)) + (i == n-1 ? oddSufSum.get(n-1) : oddSufSum.get(i+1));
            int oddSum = (i == 0 ? 0 : oddPreSum.get(i-1)) + (i == n-1 ? evenSufSum.get(n-1) : evenSufSum.get(i+1));
            if(evenSum == oddSum){
                count++;
            }
        }
        return count;
    }
   
}
