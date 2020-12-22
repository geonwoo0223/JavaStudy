package basic100;

import java.util.*;

public class Main1026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		String[] time = a.split(":");
		System.out.println(Integer.parseInt(time[1]));
		sc.close();
	}

}
