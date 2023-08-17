package own;
public class SumOfArrays {
public static int Sum(int []arr) {
	int sum=0;
	for(int i=0;i<=arr.length;i++) {
		sum+=i;
}
	return sum;
}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
	    System.out.println(Sum(arr));
		}
	}


