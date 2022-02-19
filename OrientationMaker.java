import java.util.*;
public class OrientationMaker {
	public static void main(String[] args) {
		ArrayList<int[][]> list = new ArrayList<int[][]>();
		
		int[][] array = {{0,0,1,0,1,0,1,0,0}, {1,0,1,1,1,0,1,0,0}, {1,0,1,0,1,0,0,0,1}, {0,0,0,0,0,0,1,0,0}, {1,1,0,1,0,1,1,0,1}, {0,1,0,1,0,0,1,0,0}, {0,0,0,1,1,0,1,0,1}, {0,1,0,0,0,0,0,0,0}, {1,1,1,0,1,0,1,1,0}};
		/*printArray(array);
		array = rotateCW(array);
		printArray(array);*/
		
		String [] s = generateRandomRotations(array).split("");
		int total = 0;
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
			int[][] temp = array.clone();
			for (int j = 0; j < Integer.parseInt(s[i]); j++) {
				temp = rotateCW(temp);
			}
			list.add(temp);
			//printArray(temp);
		}
		System.out.println();
		
		//print linked 9 graphs
		/*
		for (int a = 0; a < 9; a++) {
			for (int b = 0; b < 9; b++) {
				for (int c = 0; c < 9; c++) {
					System.out.print(list.get(a)[b][c] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		*/
		
	}
	
	public static int[][] rotateCW(int[][] array) {
		final int M = array.length;
	    final int N = array[0].length;
	    int[][] ret = new int[N][M];
	    for (int r = 0; r < M; r++) {
	        for (int c = 0; c < N; c++) {
	            ret[c][M-1-r] = array[r][c];
	        }
	    }
	    return ret;
	}
	
	public static String generateRandomRotations(int[][] array) {
		String s = "";
		for (int i = 0; i < 9; i++) {
			s += "" + (int) Math.floor(Math.random()*4);
		}
		return s;
	}
	
	public static void printArray(int[][] array){
		for (int r = 0; r < array.length; r++) {
			for (int c = 0; c < array[r].length; c++) {
				System.out.print(array[r][c] + " ");
			}
			System.out.println("\n");
		}
		System.out.println();
	}
}
