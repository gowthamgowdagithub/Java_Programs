package own;
public class FindLongestString {
	public static void main(String[] args) {
		String[] names= {"tejas","harshith","priya","gowtham","prajwal","nakul"};
		String longest="";
		for(String name:names) {
			if(name.length()>longest.length()) {
				longest=name;
			}
		}
      System.out.println(longest);
	}

}
