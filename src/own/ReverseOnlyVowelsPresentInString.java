package own;

public class ReverseOnlyVowelsPresentInString {
	public static String reverseVowel(String s) {
		char[]c=s.toCharArray();
		int left=0;
		int right=c.length-1;
		while(left<right) {
			while(left<right && !isVowel(c[left])) {
				left++;
			}
			while(left<right && !isVowel(c[right])) {
				right--;
			}
			if(left<right) {
				char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
			}
		}
		
		return new String(c);
	}
	public static boolean isVowel(char c) {
		return "aeiouAEIOU".indexOf(c)!=-1;	
		}

	public static void main(String[] args) {
		String s="practice";
		String result=reverseVowel(s);
		System.out.println(result);

	}

}
