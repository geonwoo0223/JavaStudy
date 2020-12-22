package basic100;

import java.util.*;

public class Main1076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		int temp = (int) a;
		int j = 97;
		while (j <= temp) {
			System.out.println((char)j++);	
		}
		sc.close();
		
	}

}
