package chapter3;

public class BreakContinue {
	public static void main(String[] args) {
	
		for(int i=1; i<10; i++) {
			if(i==5) {
				System.out.println();
				continue;
			}
			for(int j=1; j<10; j++) {
				System.out.print(i+"x"+j +"="+(i*j) + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		System.out.println("===== break =====");
		for(int i=1; i<10; i++) {
			if(i==5) {
				System.out.println();
				break;
			}
			for(int j=1; j<10; j++) {
				System.out.print(i+"x"+j +"="+(i*j) + "\t");
			}
			System.out.println();
		}
	}
}
