package org.array;

public class MultiDimensional {
	
	private void sample() {
		
		int c[] = new int [4];
		c[0] = 26;
		c[1] = 32;
		c[2] = 35;
		c[3] = 54;
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println(c[3]);
		
		System.out.println("===single dimension===");
		
		int d[][] = {
				
				
				{11, 22, 33, 44},//d[0][0], d[0][1],d[0][2],d[0][3]
				{55, 66, 77, 88},//d[1][0], d[1][1],d[2][2],d[0][3]
				{13, 23, 34, 55,} //d[2][0], d[2][1],d[2][2],d[2][3]
		 
	};
	
		for (int i = 0; i<3; i++) {
				for (int j=0; j<3;j++) {
						System.out.print(" " + d[i][j]);// for getting row and column wise report use print instead of println
				}
				System.out.println();// this one is  between to values
				


		}
		System.out.println("===Multi Dimension===");	
	}

public static void main(String[] args) {
	MultiDimensional m = new MultiDimensional();
	m.sample();
	
}
}
