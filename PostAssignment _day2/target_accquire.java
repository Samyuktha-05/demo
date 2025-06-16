package day_2;

	import java.util.Arrays;
	public class target_accquire {

	
	    public static int[] findTwoSum(int[] nums, int target) {
	        Arrays.sort(nums);
	        int left = 0, right = nums.length - 1;

	        while (left < right) {
	            int sum = nums[left] + nums[right];
	            if (sum == target) return new int[]{nums[left], nums[right]};
	            if (sum < target) left++;
	            else right--;
	        }
	        return new int[]{};
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 3, 5, 7, 8, 4, 2, 6};
	        int[] result = findTwoSum(nums, 8);
	        
	        if (result.length > 0) System.out.println("Pair: " + result[0] + ", " + result[1]);
	        else System.out.println("No pair found");
	    }
	}



