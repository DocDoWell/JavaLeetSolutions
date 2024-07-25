package sortclass;

public class SortClass {
    public void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length-1;

        while(mid <= end){
            switch(nums[mid]){
                case 0:{
                    int temp = nums[start];
                    nums[start] = nums[mid];
                    nums[mid] = temp;
                    start++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }

                case 2:{
                    int temp = nums[mid];
                    nums[mid] = nums[end];
                    nums[end] = temp;
                    end--;
                    break;
                }
            }
        }
        displayArray(nums);
    }

    public void displayArray(int[] nums){
        System.out.print("Array : ");
        for(int i=0; i < nums.length; i++){
            System.out.print(nums[i]);
        }
        System.out.println(" ");
        System.out.println("-----------");
    }
}
