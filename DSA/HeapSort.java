public class HeapSort {
    public static void main(String args[]) {
        int[] nums = {7, 1, 5, 4, 2, 5};
        printArray(heapSort(nums));
    }

    static int[] heapSort(int[] nums) {
        int size = nums.length;

        // Initial build-max-heap
        for (int i = size/2-1; i > 0; i--) {
            heapify(nums, size, i);
        }

        // searching for the max node every iteration
        for (int i = size-1; i > 0; i--) {
            // removing max node to the end
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;
            // heapifying for new root node to build-max-heap again
            heapify(nums, i, 0);
        }
        return nums;
    }

    static void heapify(int[] nums, int size, int rootIndex) {
        // root node and its two children
        int largestIndex = rootIndex;
        int leftIndex = largestIndex * 2 + 1;
        int rightIndex = largestIndex * 2 + 2;

        // defining max of three
        if (leftIndex < size && nums[largestIndex] < nums[leftIndex]) {
            largestIndex = leftIndex;
        }
        if (rightIndex < size && nums[largestIndex] < nums[rightIndex]) {
            largestIndex = rightIndex;
        }

        // defining if root changed, if yes - heapifying the swapped node
        if (largestIndex != rootIndex) {
            int temp = nums[largestIndex];
            nums[largestIndex] = nums[rootIndex];
            nums[rootIndex] = temp;
            heapify(nums, size, largestIndex);
        }
    }

    static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
