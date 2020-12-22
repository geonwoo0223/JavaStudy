package basic100;

import java.util.Scanner;

public class Main1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a;
		a = sc.nextLine();
		
		String[] time = a.split(":");
		
		System.out.printf("%d:%d", Integer.parseInt(time[0]), Integer.parseInt(time[1]));
		sc.close();

	}

}
