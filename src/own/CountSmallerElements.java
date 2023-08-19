package own;

public class CountSmallerElements {
public static int countSmaller(int arr[],int n,int x) {
	int count=0;
	for(int i=0;i<n;i++) {
		if(arr[i]<=x) {
			count++;
		}
	}
	return count;
}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,8,10};
		int n=arr.length;
		int x=9;
		int result=countSmaller(arr,n,x);
		System.out.println("The smaller numbers are:"+result);
	}
}
