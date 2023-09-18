package codeWars;
public class evilAutoCorrectPrank {
public static String autoCorrectPrank(String s) {
	String correctedString=s.replaceAll("(?i)\\b(u|you+)\\b", "your sister");
	return correctedString;
	
}
	public static void main(String[] args) {
		String s1="I miss you";
		String s2="I am with u";
		String s3="I am a youtuber";
		
		String correctS1=autoCorrectPrank(s1);
		String correctS2=autoCorrectPrank(s2);
		String correctS3=autoCorrectPrank(s3);
		
		System.out.println(correctS1);
		System.out.println(correctS2);
		System.out.println(correctS3);

	}

}
