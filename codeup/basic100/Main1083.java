package basic100;

import java.util.*;

public class Main1083 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (i % 10 == 3 || i%10 == 6 || i%10 ==9) {
				System.out.printf("X ");
			} else {
				System.out.printf("%d ", i);
			}
		}
		sc.close();
		
	}

}
