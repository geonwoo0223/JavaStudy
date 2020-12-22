package basic100;

import java.util.*;

public class Main1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int s = sc.nextInt();

		long bit = (long) h*b*c*s;
		double _byte = bit/ 8;
		double kiloByte = _byte/1024;
		double megaByte = kiloByte/1024;
		System.out.printf("%.1f MB", megaByte);
		sc.close();
	}

}
