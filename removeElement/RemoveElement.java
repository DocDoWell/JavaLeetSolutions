package removeElement;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int firstPointer = 0;
        int secondPointer = nums.length-1;
        int output =0;

        while(firstPointer < secondPointer){
            if(nums[firstPointer] == val){
                int temp = nums[secondPointer];
                nums[secondPointer] = nums[firstPointer];
                nums[firstPointer] = temp;
                secondPointer--;
            }else{
                firstPointer++;
            }
        }

        for(int i=0; i < nums.length; i++){
            if(nums[i] == val){
                break;
            }else{
                output++;
            }
        }

        return output;
    }

}
