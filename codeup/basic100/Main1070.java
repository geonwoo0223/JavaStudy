package basic100;

import java.util.*;

public class Main1070 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		switch(i) {
		case 1: case 2: case 12:
			System.out.println("winter");
			break;
		case 3: case 4: case 5:
			System.out.println("spring");
			break;
		case 6: case 7: case 8:
			System.out.println("summer");
			break;
		case 9: case 10: case 11:
			System.out.println("fall");
			break;
		}
		sc.close();
	}

}
