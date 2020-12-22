package basic100;

import java.util.*;

public class Main1093 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] order = new int[n];
		int[] call = new int[24];
		int temp;
		for (int i = 0; i < n; i++) {
			temp = sc.nextInt();
			order[i] = temp;
		}
		
		for (int i : order) {
			call[i] += 1;
		};
		
		for (int i = 1; i < 24; i ++) {
			System.out.printf("%d ", call[i]);
		}
		sc.close();
	}

}
