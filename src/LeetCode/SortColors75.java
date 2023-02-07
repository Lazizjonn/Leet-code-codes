package LeetCode;

import java.util.Arrays;

/*public class SortColors75 {
    public void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }
    // 1,2,3,4,56,34,23,12

    private void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int partitionIndex = partition(array, start, end);

            quickSort(array, start, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, end);
        }
    }
    private int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int partitionIndex = start;

        for (int i = start; i < end; i++) {
            if (array[i] < pivot) {
                swap(array,i, partitionIndex);
                partitionIndex++;
                System.out.println(Arrays.toString(array));
            }
        }
        swap(array,partitionIndex, end);
        return partitionIndex;
    }
    private void swap(int [] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}*/
