package own;

public class FindNumOfGreaterAndLesserValue {
	public static int lesserCount(int[]arr,int n,int x) {
		int lesser=0;
		for(int i=0;i<n;i++) {
			if(arr[i]<x) 
			lesser++;
		}
			return lesser;
	}
public static int greaterCount(int[]arr,int n,int x) {
	int greater=0;
	for(int i=0;i<n;i++) {
		if(arr[i]>x) 
	    greater++;
	}
	
	return greater;
}
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,6,7,8,9};
		int n=arr.length;
		int x=5;
     int Greater=greaterCount(arr,n,x);
     int Lesser=lesserCount(arr,n,x);
     //if(Greater!=-1 && Lesser!=-1) {
    	 System.out.print("The number of greater count is:"+Greater);
    	 System.out.print("The number of lesser count is:"+Lesser);
//     }
//     else {
    	// System.out.println("Their is no number in given array");
    // }

	}

}
