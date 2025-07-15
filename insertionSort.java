import java.util.Arrays;
public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 2, 7, 8};

        System.out.println("Unsorted array: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static int[] insertionSort(int arr[]) {
        // Traverse through 1 to arr.length
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i-1;
            // Move elements of arr[0..i-1], that are greater than key, 
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Place the key at its correct position
            arr[j + 1] = key;
        }
        return arr;
    }    
     
}
