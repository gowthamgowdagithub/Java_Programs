package own;

public class FindIndex {
public static int findStartIndex(int []arr,int k) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==k) {
			return i;
		}
	}
	return -1;
}
public static int findEndIndex(int []arr,int k) {
	for(int i=arr.length-1;i>=0;i--) {
		if(arr[i]==k) {
			return i;
		}
	}
	return -1;
}
	public static void main(String[] args) {
		int[]arr= {1,2,5,3,2};
		int key=2;
int startIndex=findStartIndex(arr,key);
int endIndex=findEndIndex(arr,key);

if(startIndex==-1 && endIndex==-1) {
	System.out.println("Key is not found");
}
else {
	System.out.println("key found at:"+startIndex);
	System.out.println("key found at:"+endIndex);
}
	}

}
