package codeWars;

public class differenceBetweenYears {

	public static void main(String[] args) {
		String year1="2000/10/01";
		String year2="2023/08/30";
		int yearOne=Integer.parseInt(year1.substring(0, 4));
		int yearTwo=Integer.parseInt(year2.substring(0, 4));
		
		int diff=Math.abs(yearOne-yearTwo);
		System.out.println(diff);

	}
}
