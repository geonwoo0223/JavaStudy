package basic100;

import java.util.*;

public class Main1027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		String[] date = a.split("\\.");
		int year = Integer.parseInt(date[0]);
		int month = Integer.parseInt(date[1]);
		int day = Integer.parseInt(date[2]);
		
		System.out.printf("%02d-%02d-%-4d", day,month,year);
		sc.close();
	}

}
