package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JLabel;
import javax.swing.JTextField;

import student.StudentInput;
import student.StudentKind;
import student.UniversityStudent;
import util.StudentManager;

public class StudentAdderListener implements ActionListener {
	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldEmail;
	JTextField fieldPhone;
	StudentManager studentManager;
	public StudentAdderListener(JTextField fieldID,JTextField fieldName, JTextField fieldEmail, JTextField fieldPhone, StudentManager studentManager) {
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldEmail = fieldEmail;
		this.fieldPhone = fieldPhone;
		this.studentManager = studentManager;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		StudentInput student = new UniversityStudent(StudentKind.University);
		student.setId(fieldID.getText());
		student.setName(fieldID.getName());
		student.setAddress(fieldEmail.getText());
		student.setPhone(fieldPhone.getText());
		studentManager.addStudnet(student);

		putObject(studentManager, "studentmanager.ser");
		student.printInfo();
		
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
