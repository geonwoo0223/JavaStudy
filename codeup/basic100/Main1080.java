package basic100;

import java.util.*;

public class Main1080 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int start = 1;
		int tot = 0;
		do {
			tot += start;
			start++;
		} while (tot < i);
		System.out.println(start-1);
		
		
		sc.close();
	}

}
