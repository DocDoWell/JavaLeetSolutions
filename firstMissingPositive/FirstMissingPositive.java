package firstMissingPositive;

import java.util.Arrays;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int smallest = 1;
        Arrays.sort(nums); //O(nlogn)

        for(int i=0; i < nums.length; i++){
            if(nums[i] > 0){
                if(nums[i] == smallest){
                    smallest++;
                }else if(nums[i] > smallest){ //duplicates
                    return smallest;
                }
            }
        }

        return smallest;
    }
}
