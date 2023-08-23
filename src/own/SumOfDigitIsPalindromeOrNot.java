package own;

public class SumOfDigitIsPalindromeOrNot {
	public static int sumOfDigit(int num) {
		int sum=0;
		while(num>0){
			int digit=num%10;
			sum+=digit;
			num/=10;
			}
		return sum;
	}
	public static boolean checkPalindrome(int sum) {
		int reversed=0;
		int originalNum=sum;
		while(sum>0) {
			int digit=sum%10;
			reversed=reversed*10+digit;
			sum/=10;
		}
	
		return originalNum==reversed;
	}

	public static void main(String[] args) {
		int num=56;
		int digitSum=sumOfDigit(num);
		boolean isPalindrome=checkPalindrome(digitSum);
		if(isPalindrome) {
			System.out.println("The given number is palindrome");
		}
		else {
			System.out.println("The given number is not palindrome");
		}

	}

}
