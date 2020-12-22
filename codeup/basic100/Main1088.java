package basic100;

import java.util.*;

public class Main1088 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n ; i++) {
			if (i%3 != 0) {
				System.out.printf("%d ", i);
			}
		}
		sc.close();
		
	}

}
