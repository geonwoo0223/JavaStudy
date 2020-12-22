package basic100;

import java.util.*;

public class Main1096 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] board = new int[19][19];
		int x,y;
		for (int i = 0; i < n; i ++) {
			x = sc.nextInt();
			y = sc.nextInt();
			board[x-1][y-1] = 1;
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
