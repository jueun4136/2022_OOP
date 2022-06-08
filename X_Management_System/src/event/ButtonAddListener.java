package event;
import java.awt.event.*;

import javax.swing.JButton;

import gui.StudentAdder;
import gui.StudentViewer;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener{

	WindowFrame frame;
	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
	}
	@Override	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton)e.getSource();
		StudentAdder adder = frame.getStudentaddr();
		frame.setupPanel(adder);
	}

}
