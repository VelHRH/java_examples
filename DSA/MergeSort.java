public class MergeSort {
    public static void main(String args[]) {
        int[] nums = {7, 1, 5, 4, 5, 11};
        mergeSort(nums, 0, nums.length - 1);
        printArray(nums);
    }

    public static void mergeSort(int[] nums, int startIndex, int endIndex) {
        // stop recursion if everything is completely divided
        if (startIndex >= endIndex) {
            return;
        }

        // run dividing for each half of array
        int midIndex = (startIndex + endIndex) / 2;
        mergeSort(nums, startIndex, midIndex);
        mergeSort(nums, midIndex+1, endIndex);

        // merging after everything is divided
        merge(nums, startIndex, midIndex, endIndex);
    }

    private static void merge(int[] nums, int startIndex, int midIndex, int endIndex) {
        int leftSize = midIndex - startIndex + 1;
        int rightSize = endIndex - midIndex;

        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        // filling the halves of current array with sorted values
        for (int i=0; i<leftSize; i++) {
            leftArray[i] = nums[i+startIndex];
        }
        for (int i=0; i<rightSize; i++) {
            rightArray[i] = nums[i+midIndex+1];
        }

        int leftIterator = 0, rightIterator = 0, mainIterator = startIndex;

        // merging two halves, choosing smallest first element one by one
        while (leftIterator < leftSize && rightIterator < rightSize) {
            if (leftArray[leftIterator] < rightArray[rightIterator]){
                nums[mainIterator] = leftArray[leftIterator];
                leftIterator++;
            } else {
                nums[mainIterator] = rightArray[rightIterator];
                rightIterator++;
            }
            mainIterator++;
        }

        // copying rest values to the end
        while (leftIterator < leftSize) {
            nums[mainIterator] = leftArray[leftIterator];
            leftIterator++;
            mainIterator++;
        }
        while (rightIterator < rightSize) {
            nums[mainIterator] = rightArray[rightIterator];
            rightIterator++;
            mainIterator++;
        }
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
