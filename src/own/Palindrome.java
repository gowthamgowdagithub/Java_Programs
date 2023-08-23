package own;

public class Palindrome {

	public static void main(String[] args) {
		int num=121;
		int temp=num;
		int reversed=0;
		while(num!=0) {
			int remainder=num%10;
			reversed=reversed*10+remainder;
			num/=10;
		}
		if(temp==reversed) {
			System.out.println("The given number is a palindrome");
		}
		else {
			System.out.println("The given number is not a palindrome");
		}}}
