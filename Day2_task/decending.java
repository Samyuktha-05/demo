package day_2;
	import java.util.Arrays;
	import java.util.Collections;

	public class decending {
	    public static void main(String[] args) {
	        Integer[] originalArray = {5, 3, 8, 1, 9};
	        Integer[] sortedArray = originalArray.clone();
	        Arrays.sort(sortedArray, Collections.reverseOrder());
	        System.out.println("Sorted array in descending order:");
	        for (int num : sortedArray) {
	            System.out.print(num + " ");
	        }
	    }
	}



