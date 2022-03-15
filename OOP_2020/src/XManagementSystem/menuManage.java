package XManagementSystem;

import java.util.Scanner;

public class menuManage {
	public static void main(String[] args) {
		System.out.println("1. Add Student");
		System.out.println("2. Delete Student");
		System.out.println("3. Edit Student");
		System.out.println("4. View Student");
		System.out.println("5. Show a menu");
		System.out.println("6. Exit");
		/* System.out.println("Select one number between 1-6"); */
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		while(num != 6) {
			System.out.print("원하는 메뉴 숫자를 입력하세요 : ");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("Studnet ID: ");
				int studentId = input.nextInt();
				
				Scanner inputString = new Scanner(System.in);
				System.out.print("Studnet Name: ");
				String studentName = inputString.nextLine();
				
				System.out.print("Studnet e-mail: ");
				String studentEmail = inputString.nextLine();
				
				System.out.print("Studnet phone number: ");
				String studentPoneNumber = inputString.nextLine();
				
				System.out.println("===========================");
				System.out.println("학번은 "+studentId+"입니다.");
				System.out.println("이름은 "+studentName+"입니다.");
				System.out.println("이메일은 "+studentEmail+"입니다.");
				System.out.println("폰번호는 "+studentPoneNumber+"입니다.");
				System.out.println("===========================");
				break;
				
			case 2:break;
			case 3:break;
			case 4:break;
			case 5:
				System.out.println("1. Add Student");
				System.out.println("2. Delete Student");
				System.out.println("3. Edit Student");
				System.out.println("4. View Student");
				System.out.println("5. Show a menu");
				System.out.println("6. Exit");
				break;

			case 6:
				System.out.println("프로그램 종료");
			}
			
			System.out.println();
		}
	}
	
}
