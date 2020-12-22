package basic100;

import java.util.*;

public class Main1078 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = 0;
		int tot = 0;
		do {
			if (j % 2 == 0) {
				tot += j;
			}
			j++;
		} while(j <= i);
		System.out.println(tot);
		sc.close();
	}

}
