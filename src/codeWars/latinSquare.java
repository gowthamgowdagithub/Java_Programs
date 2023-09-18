package codeWars;

public class latinSquare {
public static int[][] checkLatinSquare(int n){
	if(n<=0) {
		return new int[0][0];
	}
	int[][]latinSquare=new int[n][n];
	for(int i=0;i<n;i++) {
		latinSquare[0][i]=i+1;
	}
	for(int row=1;row<n;row++) {
		for(int col=0;col<n;col++) {
			latinSquare[row][col]=(latinSquare[row-1][col]%n)+1;
		}
	}
	return latinSquare;
}
public static void printLatinSquare(int[][] latinSquare) {
	for(int[]row:latinSquare) {
	for(int num:row) {
		System.out.print(num+" ");
	}
	System.out.println();
	}
}
	public static void main(String[] args) {
		int n=9;
		int [][]checkLatinSquare=checkLatinSquare(n);
		printLatinSquare(checkLatinSquare);

	}

}
