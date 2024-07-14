package mergeSortedArray;

import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j =0;
        int i = m;

        while (j < n) {
            nums1[i] = nums2[j];
            i++;
            j++;
        }

        Arrays.sort(nums1);
    }
}
