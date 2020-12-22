package basic100;

import java.util.*;

public class Main1097 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		int[][] board = new int[19][19];
		int x,y;
		int temp;
		
		for (int i = 0; i<19; i++ ) {
			for (int j = 0; j< 19; j++) {
				temp = sc.nextInt();
				board[i][j] = temp;
			}
		}
		n = sc.nextInt();
		int[] xcoord = new int[n];
		int[] ycoord = new int[n];
//		int[][] coord = new int[n][2];
		for (int i = 0; i < n; i ++) {
			x = sc.nextInt();
			y = sc.nextInt();
			xcoord[i] = x;
			ycoord[i] = y;
//			coord[i][0] = x;
//			coord[i][1] = y;
		}
		for (int i = 0; i < n; i++) {
			x = xcoord[i]-1;
			y = ycoord[i]-1;
			for (int j = 0; j< 19; j ++) {
				if (board[x][j] == 0) {
					board[x][j] = 1;
				} else {
					board[x][j] = 0;
				}
				if (board[j][y] == 0) {
					board[j][y] = 1;
				} else {
					board[j][y] = 0;
				}
			}
		}
	
		
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j< 19; j++) {
				System.out.printf("%d ", board[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}

}
