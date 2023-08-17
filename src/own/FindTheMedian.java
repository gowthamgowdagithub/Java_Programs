package own;

import java.util.Arrays;

public class FindTheMedian {

	public static void main(String[] args) {
		int arr[]= {100,95,120,45,75};
		Arrays.sort(arr);
		int left=arr[0];
		int right=arr.length-1;
		int mid=(left+right)/2;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==mid) 
				System.out.println("Median of given number is:"+ arr[i]);
			}
		}

	}

}
