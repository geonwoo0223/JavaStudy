package basic100;

import java.util.*;

public class Main1055 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		
		if (a == 1 || b == 1) {
			ans = 1;
		}
		
		System.out.println(ans);
		sc.close();
	}

}
