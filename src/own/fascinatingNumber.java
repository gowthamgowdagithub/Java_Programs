package own;

public class fascinatingNumber {
	public static boolean concatNumbers(int num) {
			int n1=num*3;
			int n2=num*2;
		String concatString=String.valueOf(num)+String.valueOf(n1)+String.valueOf(n2);
	if(concatString.length()!=9) {
		return false;
	}
	for(int i=1;i<=9;i++) {
		if(!concatString.contains(String.valueOf(i))) {
			return false;
		}
	}
		return true;
	}
	public static void main(String[] args) {
		int num=192;
		boolean isFascinating = concatNumbers(num);
		if(isFascinating) {
			System.out.println("The given number is a fascinating number");
		}
		else {
			System.out.println("The given number is not a fascinating number");
		}

	}

}
