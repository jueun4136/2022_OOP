package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		StudentManager studentManager = getObject("studentmanager.ser");
		System.out.println("eeeeeeee" + studentManager);
		if (studentManager == null) {
			studentManager = new StudentManager(input);
		}else {
			studentManager.input = input;
		}
		WindowFrame frame = new WindowFrame(studentManager);
		selectMenu(input, studentManager);
		putObject(studentManager, "studentmanager.ser");

	}

	public static void selectMenu(Scanner input, StudentManager studentManager) {
		System.out.println(input +"aaaaa "+ studentManager);
		int num = -1;
		showMenu();
		while (num != 6) {
			System.out.print("원하는 메뉴 숫자를 입력하세요 : ");
			num = input.nextInt();
			switch (num) {
			case 1:
				studentManager.addStudnet();
				logger.log("add a student");
				break;
			case 2:
				studentManager.deleteStudnet();
				logger.log("delete a student");
				break;
			case 3:
				studentManager.editStudnet();
				logger.log("edit a student");
				break;
			case 4:
				studentManager.viewStudnet();
				logger.log("view a student");
				break;
			case 5:
				studentManager.printMenu();
				logger.log("print a student");
				break;
			case 6:
				logger.log("program exit");
				System.out.println("프로그램 종료");
			}
			System.out.println();
		}
	}

	public static void showMenu() {
		System.out.println("1. Add Student");
		System.out.println("2. Delete Student");
		System.out.println("3. Edit Students");
		System.out.println("4. View Students");
		System.out.println("5. Show a menu");
		System.out.println("6. Exit");
		System.out.println("Select one number between 1-6");
	}

	public static StudentManager getObject(String filename) {
		StudentManager studentManager = null;

		FileInputStream file;
		try {
			file = new FileInputStream(filename);
			ObjectInputStream obj = new ObjectInputStream(file);
			studentManager = (StudentManager) obj.readObject();

			obj.close();
			file.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			return studentManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return studentManager;

	}

	public static void putObject(StudentManager studentManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream obj = new ObjectOutputStream(file);

			obj.writeObject(studentManager);

			obj.close();
			file.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
