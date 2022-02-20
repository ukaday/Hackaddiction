import java.util.*;
public class OrientationMaker {
	private int[][] array; 
	private String[] s;
	ArrayList<int[][]> list;
	
	public OrientationMaker() {
		//int[][] array = {{0,0,1,0,1,0,1,0,0}, {1,0,1,1,1,0,1,0,0}, {1,0,1,0,1,0,0,0,1}, {0,0,0,0,0,0,1,0,0}, {1,1,0,1,0,1,1,0,1}, {0,1,0,1,0,0,1,0,0}, {0,0,0,1,1,0,1,0,1}, {0,1,0,0,0,0,0,0,0}, {1,1,1,0,1,0,1,1,0}};
		int[][] array = {{0,0,1,0,1,0,1,1,0}, {1,0,0,0,1,0,0,1,0}, {1,1,0,1,1,1,1,1,1}, {0,0,0,1,0,0,1,0,0}, {1,1,0,1,1,0,1,1,1}, {0,0,0,0,1,0,0,0,0}, {1,0,1,0,0,0,1,1,1}, {0,0,1,0,1,1,1,0,1}, {0,1,1,0,1,0,1,0,0}};

		this.array = array;
		s = generateRandomRotations(this.array).split("");
		list = new ArrayList<int[][]>();
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
			int[][] temp = this.array.clone();
			for (int j = 0; j < Integer.parseInt(this.s[i]); j++) {
				temp = rotateCW(temp);
			}
			this.list.add(temp);
		}
		System.out.println();
		print2D(get2D());
		System.out.println();
	}
	
	public int[][] get2D(){
		int[][] nums = convert(this.list);
		return nums;
	}
	
	public static void print2D(int[][] nums) {
		for (int i = 0; i < 27; i++) {
			for (int j = 0; j < 27; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}
	
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
