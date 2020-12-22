package basic100;

import java.util.*;

public class Main1063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ans = (a>b) ? a:b;
		System.out.println(ans);
		sc.close();
	}

}
