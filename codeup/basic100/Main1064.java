package basic100;

import java.util.*;

public class Main1064 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int ans = (((a>b) ? b:a) < c) ? ((a>b) ? b:a):c;
		System.out.println(ans);
		sc.close();
	}

}
