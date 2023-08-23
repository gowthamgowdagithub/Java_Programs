package own;

import java.util.ArrayList;

public class MultiplicationTableUsingArrayList {
	public static ArrayList<Integer> getTable(int num){
		ArrayList<Integer>table=new ArrayList<>();
		for(int i=1;i<=10;i++) {
			table.add(num*i);
		}
		return table;
	}

	public static void main(String[] args) {
		int num=5;
   ArrayList<Integer> result=getTable(num);
System.out.println(result);
	}

}
