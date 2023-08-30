package codeWars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findDifferenceBetweenYears {
public static int ExtractYears(String dataString) {
	Pattern pattern=Pattern.compile("\\d{4}");
	Matcher matcher=pattern.matcher(dataString);
	if(matcher.find()) {
		return Integer.parseInt(matcher.group());
	}
	throw new IllegalArgumentException("Invalid date formate"+dataString);
}
public static int findDiff(String year1, String year2) {
	int yearOne=ExtractYears(year1);
	int yearTwo=ExtractYears(year2);
	int result=Math.abs(yearTwo-yearOne);
	return result;
}

	public static void main(String[] args) {
		String dataString1="2000/01/10";
		String dataString2="2023/08/30";
		
		int diff=findDiff(dataString1,dataString2);
		System.out.println(diff);

	}

}
