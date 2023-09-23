package codeWars;
public class SpiralingBox {
public static int[][] createBox(int width, int length){
	int[][]arr=new int[width][length];
	for(int i=0;i<width;i++) {
		for(int j=0;j<length;j++) {
			int dist=Math.min(i, Math.min(j, Math.min(width-1-i, length-1-j)));
			arr[i][j]=dist+1;
		}
	}
	return arr;
}
	public static void main(String[] args) {
	int width=5;
	int length=8;
	int[][]result=createBox(width,length);
	for(int i=0;i<width;i++) {
		for(int j=0;j<length;j++) {
			System.out.print(result[i][j]+" ");
		}
		System.out.println();
	}
	}

}
