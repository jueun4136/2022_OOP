package student;

import java.io.Serializable;
import java.util.Scanner;

public abstract class Student implements StudentInput, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5055948890952096478L;
	String id;
	String name;
	String address;
	String phone;
	StudentKind kind;

	public Student(StudentKind kind) {
		this.kind = kind;
	}
//

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	public StudentKind getKind() {
		return kind;
	}

	public void setKind(StudentKind kind) {
		this.kind = kind;
	}

	public abstract void printInfo();


}
