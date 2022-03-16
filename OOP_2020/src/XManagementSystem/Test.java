package XManagementSystem;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		while(true) {
			Scanner input = new Scanner(System.in); 
			System.out.println("얼마를 팔았나요? ");
			Double sell = input.nextDouble();
				
			if (sell > 10000000 ) {
				System.out.println(String.format("%.10f",(sell-10000000)/10));
			}
		}
		
	}
}
