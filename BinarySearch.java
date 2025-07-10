public class binarysearch {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,5,5,5,7,9,10};
        int target = 7;
        int result = binarySearch(nums, target);
        int result2 = recursiveBinarySearch(nums, target, 0, nums.length - 1);

        if(result != -1 && result2 != -1) {
        System.out.println("Target found at indexes: " + result + " and " + result2);
        }else if (result == -1) {
            System.out.println("Target not found in result 1");
        }else{
            System.out.println("Target not found in result 2");
        }
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        

        while (left <= right) {
            int mid = (right + left) / 2;
            if(nums[mid] == target) 
                return mid;
            else if(nums[mid] < target)
                left = mid + 1;
            else 
                right = mid - 1;   
            
        }
        return -1; // Target not found
    }

    public static int recursiveBinarySearch(int[] nums, int target, int left, int right){
        if(left <= right){
            int mid = (right + left) / 2;

            if(nums[mid] == target)
                return mid;  
            else if(nums[mid] < target)
               return recursiveBinarySearch(nums, target, mid + 1, right);
            else 
                return recursiveBinarySearch(nums, target, left, mid - 1);
            
        }
        return -1; 
    }

}
