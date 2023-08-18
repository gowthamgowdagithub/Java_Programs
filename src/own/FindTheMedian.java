package own;
import java.util.Arrays;
public class FindTheMedian {
	public static void main(String[] args) {
		int arr[]= {90,100,78,89,67};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int n=arr.length;
		if(n%2==1) {
			System.out.println(arr[n/2]);
		}
		else {
			int middle1=arr[n/2-1];
			int middle2=arr[n/2];
			double median=(middle1+middle2)/2;
			System.out.println(median);
		}}}


