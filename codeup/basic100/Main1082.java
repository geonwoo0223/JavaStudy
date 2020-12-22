package basic100;

import java.util.*;

public class Main1082 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int result;
		for (int i = 1; i < 16; i++) {
			result = i * Integer.parseInt(a,16);
			System.out.printf("%s*%s=%s\n", a,Integer.toHexString(i).toUpperCase(),Integer.toHexString(result).toUpperCase());
		}
		sc.close();
	}

}
