import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		while (true) {
			System.out.println("화씨 온도를 입력하세요 : ");
			Scanner input = new Scanner(System.in);
//			float F = input.nextFloat();
//			System.out.println(C);
		
			
			int FF = input.nextInt();
			double CC = 5*(FF-32)/9;
			double CC1 = 5*(FF-32)/9.0;
			System.out.println(5*(FF-32)/9);
			System.out.println(CC);
			System.out.println(CC1);
		}
	}
}
