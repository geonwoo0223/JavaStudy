package basic100;

import java.util.*;

public class Main1095 {

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
		int _min = 987654321;
		for (int i = 0; i < n; i++) {
			if (order[i] < _min) {
				_min = order[i];
			}
		}
		System.out.println(_min);
		sc.close();
	}

}
