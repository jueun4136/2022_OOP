package util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import student.ElementaryStudent;
import student.HighSchoolStudent;
import student.Student;
import student.StudentInput;
import student.StudentKind;
import student.UniversityStudent;

public class StudentManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 952008391552280970L;
	
	transient Scanner input;
	ArrayList<StudentInput> studentList = new ArrayList<StudentInput>();
	StudentInput studentInput;
	public StudentManager(Scanner input){
		this.input = input;
	}
	public void addStudnet(String Id, String name, String email, String phone) {
		studentInput = new UniversityStudent(StudentKind.University);	
		studentInput.getUserInput(input);
		studentList.add(studentInput);
	}
	
	public void addStudnet(StudentInput studentInput) {
		studentList.add(studentInput);
	}
	public void addStudnet() {
		int kind = 0;
		StudentInput studentInput = null;
		while(kind != 1 && kind != 2) {
			System.out.println("1 for University");
			System.out.println("2 for High School");
			System.out.println("3 for Elementary School");
			System.out.print("Select num for Student Kind Between 1 ~ 3: ");
			kind = input.nextInt();

			if(kind == 1) {
				studentInput = new UniversityStudent(StudentKind.University);	
				studentInput.getUserInput(input);
				break;
			}else if (kind == 2) {
				studentInput = new HighSchoolStudent(StudentKind.HighSchool);
				studentInput.getUserInput(input);
				break;
			}else if (kind == 3) {
				studentInput = new ElementaryStudent(StudentKind.ElementarySchool);
				studentInput.getUserInput(input);
				break;
			}else {
				System.out.println("Select num for Student Kind Between 1 and 2:");
			}
		}
		studentList.add(studentInput);

	}
	public void deleteStudnet() {
		System.out.println("삭제하고 싶은 학생 ID를 입력하세요 : ");
		input.nextLine();
		String studnetId = input.nextLine();
		for(int i = 0; i < studentList.size(); i++) {
			studentInput = studentList.get(i);
			if (studnetId.equals(studentInput.getId())) {
				studentList.remove(i);
				System.out.println("ID가 "+studnetId+"인 학생을 삭제 했습니다.");
				break;
			}else if (i+1 == studentList.size()) {
				System.out.println("ID가 "+studnetId+"인 학생이 없습니다.");
	
			}
		}
		this.viewStudnet();
		
	}
	public void editStudnet() {
		System.out.print("수정하고 싶은 학생 ID를 입력하세요 : ");
		input.nextLine();
		String studnetId = input.nextLine();
		for(int i = 0; i < studentList.size(); i++) {
			StudentInput studentInput = studentList.get(i);
			if (studnetId.equals(studentInput.getId())) {
				studentInput.printInfo();
				
				System.out.print("Studnet Name: ");
				String studentName = input.nextLine();
				studentInput.setName(studentName);
				
				System.out.print("Studnet e-mail: ");
				String studentEmail = input.nextLine();
				studentInput.setAddress(studentEmail);
				
				System.out.print("Studnet phone number: ");
				String studentPoneNumber = input.nextLine();
				studentInput.setPhone(studentPoneNumber);
				
				System.out.println("수정이 완료되었습니다." );
				break;
			}else if (i+1 == studentList.size()) {
				System.out.println("ID가 "+studnetId+"인 학생이 없습니다.");
			}
		}
		this.viewStudnet();
	}
	
	
	public void viewStudnet() {
		System.out.println("viewStudnet");
		for(StudentInput studnetInput : studentList) {
			studnetInput.printInfo();
		}
	}
	
	public int size() {
		return studentList.size();
	}
	public StudentInput get(int index) {
		return (Student)studentList.get(index);
	}
	
	public void printMenu() {
		System.out.println("1. Add Student");
		System.out.println("2. Delete Student");
		System.out.println("3. Edit Student");
		System.out.println("4. View Student");
		System.out.println("5. Show a menu");
		System.out.println("6. Exit");
	}
	
}
