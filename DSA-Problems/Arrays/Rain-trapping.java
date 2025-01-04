/*
Rain Water Trapped
Imagine a histogram where the bars' heights are given by the array A. 
Each bar is of uniform width, which is 1 unit. When it rains, water will accumulate in the valleys between the bars.

Your task is to calculate the total amount of water that can be trapped in these valleys.

The Array A = [5, 4, 1, 4, 3, 2, 7] is visualized as below. The total amount of rain water trapped in A is 11.

                        #
                        #
  #   -   -   -   -   - #
  #   #   -   #   -   - #
  #   #   -   #   #   - #
  #   #   #   #   #   - #
  #   #   #   #   #   # #
-------------------------
  5   4   1   4   3   2 7
      1 + 3 + 1 + 2 + 4  = 11

Lmax arr 
                                                           [5,4,1,4,3,2,7]
Step 1 : Left Max                                          [5,5,5,5,5,5,7]
Step 2 : Right Max                                         [7,7,7,7,7,7,7]
Step 3 : Min of left and right max and min Len of arr      [0,1,4,1,2,3,0] 
Step 4 : Sum from 0 -N of step 3                           11


*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int trap(final List<Integer> A) {
        int n = A.size();
        int trapped = 0;
        ArrayList<Integer> lm = new ArrayList<>();
        ArrayList<Integer> rm = new ArrayList<>();
        //below code to find left maximum array
        lm.add(A.get(0));
        for(int i=1;i<n;i++){
            int maxVal = Math.max(lm.get(i-1), A.get(i));
            lm.add(maxVal);
        }
        //below code to find right maximum ArrayList
        rm = findRightMaximunArray(A, n);

        //code to find rain water trapped

        for(int i=1;i<n-1;i++){
            int trappedWater = Math.min(lm.get(i), rm.get(i)) - A.get(i);
            trapped = trappedWater + trapped;
        }

        return trapped;

    }
    public ArrayList<Integer> findRightMaximunArray(List<Integer> A, int n){
         ArrayList<Integer> rm = new ArrayList<>();
         for(int i=0;i<n;i++){
            rm.add(0);
        }
        rm.set(n-1, A.get(n-1));
        for(int i=n-2;i>=0;i--){
            int maxVal = Math.max(rm.get(i+1), A.get(i));
            rm.set(i, maxVal);
        }
        return rm;
    }
}
