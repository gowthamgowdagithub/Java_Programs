package own;

import java.util.HashMap;

public class GuessOppositeSiseOfCube {
	public static int findFace(int face) {
		HashMap<Integer,Integer>oppFace=new HashMap<>();
		oppFace.put(1, 6);
		oppFace.put(2, 5);
		oppFace.put(3, 4);
		oppFace.put(4, 3);
		oppFace.put(5, 2);
		oppFace.put(6, 1);
		return oppFace.get(face);
	}

	public static void main(String[] args) {
		int face=1;
		int result=findFace(face);
		System.out.println(result);

	}

}
