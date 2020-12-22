package basic100;

import java.util.*;

public class Main1094 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] order = new int[n];
		int temp;
		for (int i = 0; i < n; i++) {
			temp = sc.nextInt();
			order[i] = temp;
		}
		
		for (int i = n-1; i >=0; i--) {
			System.out.printf("%d ", order[i]);
		}
		sc.close();
	}

}
