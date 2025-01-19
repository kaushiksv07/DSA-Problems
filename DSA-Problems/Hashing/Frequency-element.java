/*
Given an array A that represents the participants of various contests, where each integer 
corresponds to a specific learner, and an array B containing the learners for whom you want 
to check participation frequency, your task is to find the frequency of 
each learner from array B in the array A and return a list containing all these frequencies


A = [1, 2, 1, 1]
B = [1, 2]

[3, 1]
*/

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public ArrayList<Integer> getFrequencyOfElements(ArrayList<Integer> elements, ArrayList<Integer> queries) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        ArrayList<Integer> resultFrequencies = new ArrayList<>();
        
        // Count the frequency of each element in the elements list
        for (int element : elements) {
            if (frequencyMap.containsKey(element)) {
                int currentFrequency = frequencyMap.get(element);
                frequencyMap.put(element, currentFrequency + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }

        // Get frequencies for each query
        for (int query : queries) {
            if (frequencyMap.containsKey(query)) {
                resultFrequencies.add(frequencyMap.get(query));
            } else {
                resultFrequencies.add(0);
            }
        }

        return resultFrequencies;
    }
}
