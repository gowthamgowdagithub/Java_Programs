package own;

public class CheckGivenArrayIsPalindrome {
		public static boolean isPalindrome(int num) {
			int originalNum=num;
			int reversed=0;
			while(num>0) {
				int digit=num%10;
				reversed=reversed*10+digit;
				num/=10;
			}
			return originalNum==reversed;
			}
		public static int isPalindromeArray(int arr[]) {
			for(int num:arr) {
				if(!isPalindrome(num)) 
					return 0;
			}
			return 1;
		}
		public static void main(String[] args) {
			int arr[]= {111,222,333,444,555};
			int result=isPalindromeArray(arr);
			if(result==1) {
				System.out.println("the given array is palindrome");
			}
			else {
				System.out.println("The given array is not palindrome");
			}

	}

}
