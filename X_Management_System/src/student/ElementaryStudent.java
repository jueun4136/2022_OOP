package student;

import java.util.Scanner;

public class ElementaryStudent extends Student implements StudentInput{

	String parentAddress;
	String parentPhone;
	
	public ElementaryStudent(StudentKind kind) {
		super(kind);
	}
	public String getParentAddress() {
		return parentAddress;
	}


	public void setParentAddress(String parentAddress) {
		this.parentAddress = parentAddress;
	}


	public String getParentPhone() {
		return parentPhone;
	}


	public void setParentPhone(String parentPhone) {
		this.parentPhone = parentPhone;
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
			System.out.println("Do you have a parents email address? (Y/N)");
			answer = input.next().charAt(0);
			
			if(answer == 'Y' || answer == 'y') {
				System.out.print("parent's e-mail: ");
				String parentEmail = input.nextLine();
				this.setParentAddress(parentEmail);
				break;
				
			}else if(answer == 'N' || answer == 'n'){
				this.setParentAddress("");
				break;
			}else {
				
			}
		}
		input.nextLine();
		System.out.print("parent's phone number: ");
		String parentPoneNumber = input.nextLine();
		this.setParentPhone(parentPoneNumber);
		
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
		
		System.out.println("ElementaryStudent [parentAddress=" + parentAddress + ", parentPhone=" + parentPhone + ", id=" + id
				+ ", name=" + name + ", address=" + address + ", phone=" + phone + ", kind=" + kind + "]");
	}


	@Override
	public String toString() {
		return "ElementaryStudent [parentAddress=" + parentAddress + ", parentPhone=" + parentPhone + ", id=" + id
				+ ", name=" + name + ", address=" + address + ", phone=" + phone + ", kind=" + kind + "]";
	}
	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return super.address;
	}
	
	

}
