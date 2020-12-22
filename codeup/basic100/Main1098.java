package basic100;

import java.util.*;

public class Main1098 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		int l,d,x,y;
		int[][] board = new int[h][w];
		for (int i = 0; i < n; i++) {
			l = sc.nextInt();
			d = sc.nextInt();
			x = sc.nextInt()-1;
			y = sc.nextInt()-1;
			
			for (int j = 0; j<l; j++) {
				if (d == 0) {
					board[x][y+j] = 1;
				} else {
					board[x+j][y] =1;
				}
			}
		}
		
		for (int i=0; i<h; i++) {
			for (int j=0; j<w; j++) {
				System.out.printf("%d ", board[i][j]);
			}
			System.out.println();
		}
		sc.close();
		
		
	}

}
