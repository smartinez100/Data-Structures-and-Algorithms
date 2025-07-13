import java.util.Arrays;
public class selectionSort {
    public static void main(String[] args) {
        int nums[] = {5, 6, 4, 2, 7, 8, 2, 1};

        System.out.println("Unsorted array: " + Arrays.toString(nums));
        selectionSort(nums);
        System.out.println("Sorted array: " + Arrays.toString(nums));
    }

    public static int[] selectionSort(int[] nums) {
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;

        for(int i = 0; i < size - 1; i++){
            minIndex = i; 
            for(int j = i; j < size; j++){
                if(nums[minIndex] > nums[j]){
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
            // System.out.println("After iteration " + (i + 1) + ": " + Arrays.toString(nums));
        }
        return nums;
    }
}
