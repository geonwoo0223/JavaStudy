package basic100;

import java.util.Scanner;

public class Main1023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String f = sc.next();
		
		String[] ff = f.split("\\.");
		
		String int1 = ff[0];
		String int2 = ff[1];
		
		System.out.println(int1);
		System.out.println(int2);
		sc.close();
	}

}
