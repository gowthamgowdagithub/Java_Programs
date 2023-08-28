package own;

public class ConcatTheStringAndReverseIt {

	public static void main(String[] args) {
		String str1="gowtham";
		String str2="gowda";
		String concatString=str1+str2;
		System.out.println(concatString);
		for(int i=concatString.length()-1;i>=0;i--) {
			System.out.print(concatString.charAt(i));
		}

	}

}
