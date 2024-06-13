package combinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        Arrays.sort(candidates);
        List<Integer> combination = new ArrayList<>();
        List<List<Integer>> output = new ArrayList<>();
        recursiveBacktracking(0,combination,candidates,target, output);
        return output;
    }

    private void recursiveBacktracking(int index, List<Integer> combination, int[] candidates, int target, List<List<Integer>> output){
        if(sumCombination(combination) == target){
            List<Integer> sorted = new ArrayList<>(combination);
            output.add(sorted);
        }
        for (int i = index; i < candidates.length; i++) {
            if (isValid(combination, candidates[i], target)) {
                combination.add(candidates[i]);
                recursiveBacktracking(i, combination, candidates, target, output);
                //BACKTRACKING
                combination.remove(combination.size() - 1);
            }
        }

    }

    private boolean isValid(List<Integer> combination, int candidate, int target){
        return sumCombination(combination) + candidate <= target;
    }

    private int sumCombination(List<Integer> combination){
        int output = 0;
        for(int item : combination){
            output+=item;
        }
        return output;
    }
}