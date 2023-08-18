package own;
public class CheckForBinary {
public static boolean isBinary(String str) {
	char[] c=str.toCharArray();
	for(int i=0;i<c.length;i++) {
		if(c[i]!='0' && c[i]!='1') {
			return false;
		}
	}
	return true;
}
	public static void main(String[] args) {
		String str="75";
		boolean result=isBinary(str);
		System.out.println(result);	
		}	
	}


