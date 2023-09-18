package codeWars;
public class validParentheses {
	public static boolean checkValidParentheses(String s) {
		int count =0;
		for(int ch:s.toCharArray()) {
			if(ch=='(' || ch=='[' || ch=='{') {
				count++;
			}
			else if(ch==')' || ch==']' || ch=='}'){
				count--;
			}
			if(count<0) {
				return false;
			}
		}
		return count==0;
	}

	public static void main(String[] args) {
		String s="([{)";
		boolean result=checkValidParentheses(s);
		System.out.println(result);

	}

}
