package codeWars;

public class findIndexOfSecondOccuranceOfLetter {
public static int findIndex(String name,char letter) {
    int count =0;
    int index=-1;
    
    for(int i=0;i<name.length();i++) {
    	char currentLetter=name.charAt(i);
    	
    	if(currentLetter==letter) {
    		count++;
    		
    		if(count==2) {
    			index=i;
    			break;
    		}
    	}
    }	
	return index;
}
	public static void main(String[] args) {
		String name="gowtham gowda";
		char letter='g';
		int result=findIndex(name,letter);
		System.out.println(result);

	}

}
