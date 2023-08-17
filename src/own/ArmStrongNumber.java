package own;

public class ArmStrongNumber {
	public static boolean ArmStrong(int num) {
		int sum=0;
		int temp=num;
		while(num>0) {
			int remainder=num%10;
			sum=sum+(remainder*remainder*remainder);
			num=num/10;
			if(sum==temp) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int n=153;
		boolean result=ArmStrong(n);
		if(result==true) {
			System.out.println("The given number is an armstrong number");
		}
		else {
			System.out.println("The given number is not an armstrong number");
		}

	}

}
