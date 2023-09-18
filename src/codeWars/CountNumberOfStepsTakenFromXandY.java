package codeWars;

public class CountNumberOfStepsTakenFromXandY {
	public static int countSteps(int x, int y) {
		int diff=y-x;
		if(diff<=3) {
			return diff;
		}
		return (int) (Math.sqrt(diff-0.5)*2);
			
	}

	public static void main(String[] args) {
		int x=45;
		int y=51;
		int result=countSteps(x,y);
		System.out.println("The steps taken to reach from x to y is:"+result);

	}

}
