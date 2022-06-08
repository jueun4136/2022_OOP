package student;

import java.util.Scanner;

public class HighSchoolStudent extends Student implements StudentInput{
	

	public HighSchoolStudent(StudentKind kind) {
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
		
		char answer = 'x';
		while(answer != 'y' && answer !='Y' && answer != 'n' && answer !='N') {
			System.out.print("Do you have an email address? (Y/N) ");
			answer = input.next().charAt(0);
				
			if(answer == 'Y' || answer == 'y') {
				System.out.print("Studnet e-mail: ");
				String studentEmail = input.next();
				this.setAddress(studentEmail);
				break;
				
			}else if(answer == 'N' || answer == 'n'){
				this.setAddress("");
				break;
			}else {
				
			}
		}
		input.nextLine();
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
		
		System.out.println("HighSchoolStudent [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone
				+ ", kind=" + kind + "]");
	}
	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return super.address;
	}
	

	
	
}
