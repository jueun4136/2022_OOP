

import java.util.Scanner;

public class Echo {
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("input : ");
		String line = input.nextLine();
		System.out.println(line);
	}
}
