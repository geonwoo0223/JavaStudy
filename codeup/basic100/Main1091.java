package basic100;

import java.util.*;

public class Main1091 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long m = sc.nextLong();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int cnt = 1;
		
		for (int i = 0; i < n; i++) {
			if (cnt == n) {
				System.out.println(a);
				break;
			}
			a = a*m+d;
			cnt += 1;
		}
		sc.close();
		
	}

}
