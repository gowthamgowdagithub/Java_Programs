package own;

public class PrintPattern {

	public static void main(String[] args) {
		int num=3;
		for(int i=num;i>=1;i--) {
			for(int j=num;j>=1;j--) {
				for(int k=1;k<=i;k++) {
				System.out.print(j+" ");
			}}
			System.out.print("$");
			System.out.println();
		}
	}

}
