package permutate;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> permutation = new ArrayList<>();
        recursiveBacktracking(output,permutation, nums);
        return output;
    }

    private void recursiveBacktracking(List<List<Integer>> output,
                                       List<Integer> permutation,
                                       int[] nums){
        if(permutation.size() == nums.length){
            output.add(new ArrayList<>(permutation));
        }

        for (int i = 0; i < nums.length; i++) {
            if(!permutation.contains(nums[i])){
                permutation.add(nums[i]);
                recursiveBacktracking(output,permutation,nums);
                permutation.remove(permutation.size()-1);
            }
        }
    }
}
