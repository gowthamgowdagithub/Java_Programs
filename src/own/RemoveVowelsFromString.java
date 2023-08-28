package own;

public class RemoveVowelsFromString {

	public static void main(String[] args) {
		String str="gowtham gowda katteri puttaraju";
		String vowels="aeiouAEIOU";
		StringBuffer s=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(vowels.indexOf(c)==-1) {
			s.append(c);
			}
			else {
				s.toString();
			}
		}
		System.out.print(s);

	}

}
