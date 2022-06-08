package event;
import java.awt.event.*;

import javax.swing.JButton;

import gui.MenuSelection;
import gui.StudentAdder;
import gui.StudentViewer;
import gui.WindowFrame;

public class StudentAdderCancelListener implements ActionListener{

	WindowFrame frame;
	public StudentAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}
	@Override	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton)e.getSource();
		MenuSelection menuSelect = frame.getMenuSelection();
		frame.setupPanel(menuSelect);
	}

}
