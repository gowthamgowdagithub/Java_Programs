package own;

public class ConvertZeroWithAnyNumber {

	public static void main(String[] args) {
		int num=1001;
		String s=Integer.toString(num);
		StringBuilder newS=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='0') {
				newS.append('5');
			}
			else {
				newS.append(s.charAt(i));
			}
		}
		int result=Integer.parseInt(newS.toString());
		System.out.println(result);

	}

}
