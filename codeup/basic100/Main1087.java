package basic100;

import java.util.*;

public class Main1087 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tot = 0;
		int i = 1;
		do {
			tot += i;
			++i;
		} while (tot < n);
		System.out.println(tot);
		sc.close();
	}

}
