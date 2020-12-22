package basic100;

import java.util.*;
import java.io.*;

public class Main1084 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		
		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<g;j++)
			{
				for(int k=0;k<b;k++)
				{
					String st = i + " " + j + " " + k;
					bf.write(st + "\n");
				}
			}
		}
		bf.write(Integer.toString(r*g*b));
		bf.close();
		sc.close();
	}

}
