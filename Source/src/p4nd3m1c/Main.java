package p4nd3m1c;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Example output");
		try (Scanner s = new Scanner(System.in))
		{
			int x = s.nextInt();
			System.out.println("Here is your input in hexadecimal: " + Integer.toString(x, 16));	
		}
	}
}
