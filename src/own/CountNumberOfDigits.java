package own;
public class CountNumberOfDigits {
	public static void main(String[] args) {
		int num=24;
		String s=Integer.toString(num);
		int count=0;
		for(int i=0;i<s.length();i++) {
			int digit=Character.getNumericValue(s.charAt(i));
			if(digit!=0 && num%digit==0) {
				count++;			
				}
		}
		System.out.println("Number of digits that evenly divides Num is: "+count);
	}

}

