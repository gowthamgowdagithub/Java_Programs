package codeWars;

import java.util.ArrayList;
import java.util.List;

public class setReducer {
	public static int findFinalNumber(int [] numbers) {
		while(numbers.length>1) {
			List<Integer>newNumbers=new ArrayList<>();
			for(int i=0;i<numbers.length;i++) {
				int count=1;
				while(i+1<numbers.length && numbers[i]==numbers[i+1]) {
					count++;
					i++;
				}
				newNumbers.add(count);
			}
			numbers=new int[newNumbers.size()];
			for(int i=0;i<newNumbers.size();i++) {
				numbers[i]=newNumbers.get(i);
			}
		}
		return numbers[0];
	}

	public static void main(String[] args) {
		int[]numbers= {2,2,2};
		int result=findFinalNumber(numbers);
		System.out.println(result);

	}

}
