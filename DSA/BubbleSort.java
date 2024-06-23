import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String args[]) {
        int[] nums = {7, 2, 5, 4, 5};
        printArray(bubbleSort(nums));
    }

    public static int[] bubbleSort(int[] nums) {
        while (true) {
            boolean swapped = false;
            for (int i=0; i<nums.length-1; i++){
                if (nums[i] > nums[i+1]) {
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                return nums;
            }
        }
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
