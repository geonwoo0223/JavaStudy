package basic100;

import java.util.Scanner;

public class Main1020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		String[] pass = a.split("-");
		System.out.printf("%06d%07d", Integer.parseInt(pass[0]),Integer.parseInt(pass[1]));
		sc.close();
	}

}
