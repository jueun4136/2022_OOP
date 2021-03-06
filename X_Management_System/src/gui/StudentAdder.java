package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import event.StudentAdderCancelListener;
import event.StudentAdderListener;
import util.StudentManager;

public class StudentAdder extends JPanel {
	WindowFrame frame;
	
	public StudentAdder(WindowFrame frame, StudentManager studentManager) {
		this.frame = frame;
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID : ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID) ;
		 
		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelID.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		
		JLabel labelEmail = new JLabel("Email : ", JLabel.TRAILING);
		JTextField fieldEmail = new JTextField(10);
		labelID.setLabelFor(fieldEmail);
		panel.add(labelEmail);
		panel.add(fieldEmail); 
		
		
		JLabel labelPhone = new JLabel("Phone : ", JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10);
		labelID.setLabelFor(fieldPhone);
		panel.add(labelPhone);
		panel.add(fieldPhone); 
		JButton saveButton =  new JButton("save");
		saveButton.addActionListener(new StudentAdderListener(fieldID, fieldName, fieldEmail, fieldPhone, studentManager));
		
		JButton cancelButton =  new JButton("cancel");
		cancelButton.addActionListener(new StudentAdderCancelListener(frame));
		panel.add(saveButton);
		panel.add(cancelButton);
		
		this.add(panel);
	
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
	
		
	}
}
