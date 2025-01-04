/*
Begger-Outside-Temple Problem

There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot.
When the devotees come to the temple, they donate some amount of coins to these beggars. 
Each devotee gives a fixed amount of coin(according to their faith and ability) to some K beggars sitting next to each other.

Given the amount P donated by each devotee to the beggars ranging from L to R index,
where 1 <= L <= R <= A, find out the final amount of money in each beggar's pot at 
the end of the day, provided they don't fill their pots by any other means.
For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, given by the 2D array B

A = 5
B = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]

o/p: 10 55 45 25 25

Explanation 1:-
First devotee donated 10 coins to beggars ranging from 1 to 2. Final amount in each beggars pot after first devotee: [10, 10, 0, 0, 0]
Second devotee donated 20 coins to beggars ranging from 2 to 3. Final amount in each beggars pot after second devotee: [10, 30, 20, 0, 0]
Third devotee donated 25 coins to beggars ranging from 2 to 5. Final amount in each beggars pot after third devotee: [10, 55, 45, 25, 25]

*/

public class Solution {
    public ArrayList < Integer > solve(int A, ArrayList < ArrayList < Integer >> B) {
        ArrayList < Integer > sol = new ArrayList < > ();
        //sol array loading with 0 value
        for (int i = 0; i < A; i++) {
            sol.add(0);
        }

        for (int i = 0; i < B.size(); i++) {
            int sIdx = B.get(i).get(0) - 1;
            int eIdx = B.get(i).get(1) - 1;
            int val = B.get(i).get(2);

            sol.set(sIdx, sol.get(sIdx) + val);

            if (eIdx + 1 < A) {
                sol.set(eIdx + 1, sol.get(eIdx + 1) - val);
            }
        }

        for (int i = 1; i < A; i++) {
            sol.set(i, sol.get(i - 1) + sol.get(i));
        }

        return sol;

    }
}