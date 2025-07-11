import java.util.Arrays;
public class bubbleSort {
    public static void main(String[] args) {
        int nums[] = {8, 9, 7, 6, 5, 4, 3, 2, 1, 0};

        System.out.println("Unsorted array: " + Arrays.toString(nums));

        bubbleSort(nums);

        System.out.println("Sorted array: " + Arrays.toString(nums));
    }

    public static int[] bubbleSort(int[] nums){
        int temp = 0;
        int size = nums.length;

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size - i - 1; j++){
                if(nums[j] > nums[j + 1]){
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    
                }   
            }
            System.out.println();
                for(int num : nums){
                    System.out.print(num + " ");
                }
        }

        return nums;   
    }
}
