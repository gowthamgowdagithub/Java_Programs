package own;

import java.util.Arrays;

public class SwapNumbers {
	public static void main(String[] args) {
		int []arr= {1,2,6,4,5,3,7,8};
		int n=arr.length;
		int k=2;
		for(int i=0;i<n;i++) {
	  	if(arr[i]==k) {
					int temp=arr[k];
					arr[k]=arr[n-3];
					arr[n-3]=temp;
		System.out.print(Arrays.toString(arr)+" ");
			}
		}
	}

}
