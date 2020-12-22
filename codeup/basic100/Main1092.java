package basic100;

import java.util.*;

public class Main1092 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int big = a*b*c;
		int i = 1;
		while ( i <= big) {
			if (i%a == 0 && i%b == 0 && i%c == 0) {
				System.out.println(i);
				break;
			}
			i++;
		}
		sc.close();
	}

}
