package codeWars;

public class FindCaterer {
	public static int selectCaterer(int budget, int people) {
		if(people<=0 || budget<15*people) {
			return -1;
		}
		int basicBuffetCost=15*people;
		int economyBuffetCost=20*people;
		int premiumBuffetCost=30*people;
		if(people>60) {
			premiumBuffetCost=(int)(0.8*premiumBuffetCost);
		}
		
		if(budget>=premiumBuffetCost) {
			return 3;
		}
		else if(budget>=economyBuffetCost) {
			return 2;
		}
		else{
			return 1;
		}
	}

	public static void main(String[] args) {
		int budget=50;
		int people=4;
		int selected=selectCaterer(budget,people);
		System.out.println(selected);

	}

}
