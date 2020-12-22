package basic100;

import java.util.*;

public class Main1099 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] maze = new int[10][10];
		int temp;
		for (int i = 0; i<10; i++) {
			for (int j = 0; j<10; j++) {
				temp = sc.nextInt();
				maze[i][j] = temp;
			}
		}
		int x=1;
		int y=1;
		while (maze[x][y] != 2) {
			if (maze[x][y] == 0) {
				maze[x][y] = 9;
			}
			if (maze[x][y+1] == 0) {
				y += 1;
			} else if (maze[x][y+1] == 2) {
				y += 1;
				break;
			} else {
				x += 1;
			}
			if (x ==8 && y == 8) {
				break;
			}
		}
		
		maze[x][y] = 9;
		for (int i=0; i < 10; i++) {
			for (int j=0; j < 10; j++) {
				System.out.printf("%d ", maze[i][j]);
			}
			System.out.println();
			
		}
		
		
		sc.close();
	}

}
