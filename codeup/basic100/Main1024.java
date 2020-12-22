package basic100;

import java.util.*;

public class Main1024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		
		String[] t = x.split("");
		
		for (String c : t) {
			System.out.printf("\'%s\'\n", c);
		}
		sc.close();
	}

}
