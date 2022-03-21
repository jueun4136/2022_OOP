package helloworld;

import java.util.Scanner;

public class CircleDimension_Scanner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("정수를 입력하세요 : ");
				Scanner input = new Scanner(System.in);
				int radius = input.nextInt();
				System.out.println("원의 넓이 : "+ Math.PI *radius*radius);
	}
	
}
