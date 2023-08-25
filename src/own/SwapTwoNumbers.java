package own;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		if(a<=b) {
			int temp=a;
			a=b;
			b=temp;
		}
		System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);
	}

}
