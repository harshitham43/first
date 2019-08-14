package trainingday2;

public class ExpArray {
	public static void main(String[]args) {
		// integer array 512 x 128 elements
		int[][] twoD = new int[512][128];
		// character array 8 x 16 x 24
		char[][][] threeD = new char[8][16][24];
		
		// String array 4 rows x 2 columns
		String[][] dogs = {{ "terry", "brown" },
		{ "Kristin", "white" },
		{ "toby", "gray"},
		{ "fido", "black"}
		}; 
		System.out.println(dogs[2][0]);
System.out.println(dogs[2][1]);
	}

}
