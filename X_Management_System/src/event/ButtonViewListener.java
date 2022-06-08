package event;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.StudentViewer;
import gui.WindowFrame;
import util.StudentManager;

public class ButtonViewListener implements ActionListener{

	WindowFrame frame;
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}
	@Override	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		StudentViewer viewer = frame.getStudentViewer();
		StudentManager studentManager = getObject("studentmanager.ser");
		viewer.setStudentManager(studentManager);
		frame.setupPanel(viewer);
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
}
