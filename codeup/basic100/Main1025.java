package basic100;

import java.util.*;

public class Main1025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
//		int f = (a/10000) * 10000;
//		a -= f;
//		int s = (a/1000) * 1000;
//		a -= s;
//		int t = (a/100) * 100;
//		a -= t;
//		int fr = (a/10) * 10;
//		a -= fr;
//		int l = a;
//		
//		System.out.println(f);
//		System.out.println(s);
//		System.out.println(t);
//		System.out.println(fr);
//		System.out.println(l);
		
		
		for (int i = 10000; i > 0; i/=10 ) {
			int temp = (a/i)*i;
			System.out.printf("[%d]\n", temp);
			a -= temp;
		}
		sc.close();
	}

}
