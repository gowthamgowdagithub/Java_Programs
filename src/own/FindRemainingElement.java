package own;

import java.util.Arrays;

public class FindRemainingElement {
	public static int findRemainingElement(int[]arr) {
		Arrays.sort(arr);
			 int left = 0;
		        int right = arr.length - 1;
		        boolean removeMax = true;

		        while (left <= right) {
		            if (removeMax) {
		                right--;
		            } else {
		                left++;
		            }

		            removeMax = !removeMax;
		        }

		        return arr[left];
	}
	public static void main(String[] args) {
		int[]arr= {9,2,5,6,4,1,8,7,3};
		int lastRemaining = findRemainingElement(arr);

        System.out.println("The last remaining element is: " + lastRemaining);

	}

}
