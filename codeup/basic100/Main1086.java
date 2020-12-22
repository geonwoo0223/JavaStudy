package basic100;

import java.util.*;

public class Main1086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt();
		int h = sc.nextInt();
		int b = sc.nextInt();

		long bit = (long) w*h*b;
		double _byte = bit/ 8;
		double kiloByte = _byte/1024;
		double megaByte = kiloByte/1024;
		System.out.printf("%.2f MB", megaByte);
		sc.close();
	}

}
