package own;

public class FindNthTermOfArithmeticSeries {

	public static void main(String[] args) {
		int A1=1;
		int A2=2;
		int diff=A2-A1;
		int N=5;
		int A_N=A1+(N-1)*diff;
		System.out.println(A_N);
	}

}
