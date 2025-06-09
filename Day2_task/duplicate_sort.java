package day_2;
	import java.util.Arrays;
	public class duplicate_sort {
	    public static int removeDuplicates(int[] nums) {
	        if (nums.length == 0) return 0;
	        int i = 1; 
	        for (int j = 1; j < nums.length; j++) {
	            if (nums[j] != nums[j - 1]) { 
	                nums[i] = nums[j];
	                i++;
	            }
	        }
	        return i; 
	    }
	    public static void main(String[] args) {
	        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
	        int newLength = removeDuplicates(nums);
	        System.out.println("New length: " + newLength);
	        System.out.println("Array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
	}


}
