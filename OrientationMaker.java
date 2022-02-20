import java.util.*;

public class OrientationMaker {
	
	private int[][] array; 
	private String[] s;
	ArrayList<int[][]> list;
	
	public OrientationMaker() {
		
		// default array that gets scrambled infinitely
		int[][] array = {
				{0,0,1,0,1,0,1,1,0},
				{1,0,0,0,1,0,0,1,0},
				{1,1,0,1,1,1,1,1,1},
				{0,0,0,1,0,0,1,0,0},
				{1,1,0,1,1,0,1,1,1},
				{0,0,0,0,1,0,0,0,0},
				{1,0,1,0,0,0,1,1,1},
				{0,0,1,0,1,1,1,0,1},
				{0,1,1,0,1,0,1,0,0}};

		this.array = array;
		s = generateRandomRotations(this.array).split("");
		list = new ArrayList<int[][]>();
		for (int i = 0; i < s.length; i++) {
			int[][] temp = this.array.clone();
			for (int j = 0; j < Integer.parseInt(this.s[i]); j++) {
				temp = rotateCW(temp);
			}
			this.list.add(temp);
		}
	}
	
	//returns the 27x27 2D array 
	public int[][] get2D(){
		int[][] nums = convert(this.list);
		return nums;
	}
	
	//converts ArrayList of int[9][9] into int[27][27] (brute forcey I know)
	public static int[][] convert(ArrayList<int[][]> list){
int[][] nums = new int[27][27];
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		int r = 0;
		int c1 = 0;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a = 0;
		c1 = 0;
		r++;
		b++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a = 0;
		c1 = 0;
		r++;
		b++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a = 0;
		c1 = 0;
		r++;
		b++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a = 0;
		c1 = 0;
		r++;
		b++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a = 0;
		c1 = 0;
		r++;
		b++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a = 0;
		c1 = 0;
		r++;
		b++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a = 0;
		c1 = 0;
		r++;
		b++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a = 0;
		c1 = 0;
		r++;
		b++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		b = 0;
		c1 = 0;
		r++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a = 3;
		c1 = 0;
		r++;
		b++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a = 3;
		c1 = 0;
		r++;
		b++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a = 3;
		c1 = 0;
		r++;
		b++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a = 3;
		c1 = 0;
		r++;
		b++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a = 3;
		c1 = 0;
		r++;
		b++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a = 3;
		c1 = 0;
		r++;
		b++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a = 3;
		c1 = 0;
		r++;
		b++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a = 3;
		c1 = 0;
		r++;
		b++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		b = 0;
		c1 = 0;
		r++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a = 6;
		c1 = 0;
		r++;
		b++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a = 6;
		c1 = 0;
		r++;
		b++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a = 6;
		c1 = 0;
		r++;
		b++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a = 6;
		c1 = 0;
		r++;
		b++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a = 6;
		c1 = 0;
		r++;
		b++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a = 6;
		c1 = 0;
		r++;
		b++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a = 6;
		c1 = 0;
		r++;
		b++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a = 6;
		c1 = 0;
		r++;
		b++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		
		c = 0;
		a++;
		
		nums[r][c1] = list.get(a)[b][c];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		nums[r][c1++] = list.get(a)[b][c++];
		return nums;
	}
	
	//rotates the individual 9x9 2D arrays 90 degrees clockwise
	public static int[][] rotateCW(int[][] array) {
		final int m = array.length;
	    final int n = array[0].length;
	    int[][] nums = new int[n][m];
	    for (int r = 0; r < m; r++) {
	        for (int c = 0; c < n; c++) {
	            nums[c][m-1-r] = array[r][c];
	        }
	    }
	    return nums;
	}
	
	//generates a random number of rotations for each of the 9 2D arrays
	public static String generateRandomRotations(int[][] array) {
		String s = "";
		for (int i = 0; i < 9; i++) {
			s += "" + (int) Math.floor(Math.random()*4);
		}
		return s;
	}
}
