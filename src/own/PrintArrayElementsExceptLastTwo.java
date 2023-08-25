package own;

import java.util.Arrays;

public class PrintArrayElementsExceptLastTwo {

	public static void main(String[] args) {
		int[]arr= {3,5,4,8,1,2,6,7};
		Arrays.sort(arr);
		for(int i=0;i<arr.length-2;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
