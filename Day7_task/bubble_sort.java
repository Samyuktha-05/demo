package day_7;

import java.util.Arrays;

public class bubble_sort {
	public static void findBubble(int[] sample)
	{
	System.out.println(Arrays.toString(sample));
	for (int i=1;i<sample.length;i++)
	{
	for(int j=0;j<sample.length-i;j++)
	{
		if(sample[j]>sample[j+1])
		{
			int temp=sample[j];
			sample[j]=sample[j+1];
			sample[j+1]=temp;
		}
	}
	}
	System.out.println("Sorted Array:"+Arrays.toString(sample));
}
	public static void main(String[] args) {
	int[] sample= {22,7,33,9,2,44,55};
	findBubble(sample);
	}

}
