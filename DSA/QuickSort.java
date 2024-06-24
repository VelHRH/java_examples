public class QuickSort {
    public static void main(String args[]) {
        int[] nums = {7, 1, 5, 4, 5};
        quickSort(nums, 0, nums.length-1);
        printArray(nums);
    }

    static void quickSort(int[] nums, int startIndex, int endIndex) {
        // stop recursion if no more unsorted parts
        if (startIndex >= endIndex) {
            return;
        }

        // find right position of current last
        int pivotIndex = partition(nums, startIndex, endIndex);

        // recursively do the same with two parts before and after pivot
        quickSort(nums, startIndex, pivotIndex-1);
        quickSort(nums, pivotIndex+1, endIndex);
    }

    // puts current last element on right position and returns this position
    private static int partition(int[] nums, int startIndex, int endIndex) {
        int pivot = nums[endIndex];

        // index of last element that is smaller then pivot
        int currSmaller = startIndex-1;
        for (int i = startIndex; i<endIndex; i++) {
            if (nums[i] < pivot) {
                currSmaller++;

                // swap smaller then pivot with bigger then pivot
                int temp = nums[i];
                nums[i] = nums[currSmaller];
                nums[currSmaller] = temp;
            }
        }
        int rightPosition = currSmaller + 1;
        int temp = nums[rightPosition];
        nums[rightPosition] = pivot;
        nums[endIndex] = temp;
        return rightPosition;
    }

    static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
