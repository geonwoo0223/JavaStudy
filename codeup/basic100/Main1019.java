package basic100;

import java.util.Scanner;

public class Main1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		String[] time = a.split("\\.");
		System.out.printf("%04d.%02d.%02d", Integer.parseInt(time[0]),Integer.parseInt(time[1]),Integer.parseInt(time[2]));
		sc.close();
	}

}
