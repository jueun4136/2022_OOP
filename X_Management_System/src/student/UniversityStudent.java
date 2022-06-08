package student;

import java.util.Scanner;

public class UniversityStudent extends Student implements StudentInput{
	
	public UniversityStudent(StudentKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		
		System.out.print("Studnet ID: ");
		input.nextLine();
		String studentId = input.nextLine();
		this.setId(studentId);

		System.out.print("Studnet Name: ");
		String studentName = input.nextLine();
		this.setName(studentName);
		System.out.print("Studnet e-mail: ");
		String studentEmail = input.nextLine();
		this.setAddress(studentEmail);
		System.out.print("Studnet phone number: ");
		String studentPoneNumber = input.nextLine();
		this.setPhone(studentPoneNumber);

	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind){
		case University:
			skind = "Univ";
			break;
		case HighSchool:
			skind = "High";
			break;
		case MiddleSchool:
			skind = "Middle";
			break;
		case ElementarySchool:
			skind = "Elementary";
			break;
		default:
			
		}
		
		
		
		System.out.println("UniversityStudent [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone
				+ ", kind=" + kind + "]");
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return super.address;
	}



}
