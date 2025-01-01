/*
Best Time to Buy and Sell Stocks I

Say you have an array, A, for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell one share 
of the stock), design an algorithm to find the maximum profit.

Return the maximum possible profit.

Eg:
A = [1, 4, 5, 2, 4]
o/p: 4

*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List < Integer > A) {
        if (A.size() == 0) {
            return 0;
        }
        int maxPro = 0;
        int brought = A.get(0);
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) > brought) {
                maxPro = Math.max(maxPro, A.get(i) - brought);
            } else if (brought > A.get(i)) {
                brought = A.get(i);
            }
        }
        return maxPro;
    }
}