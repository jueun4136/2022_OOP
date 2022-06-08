package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import util.StudentManager;

public class WindowFrame extends JFrame{
	StudentManager studentManager;
	MenuSelection menuSelection;
	StudentAdder studentaddr;
	StudentViewer studentViewer;
	

	public WindowFrame(StudentManager studentManager) {
		this.studentManager = studentManager;
		menuSelection = new MenuSelection(this, this.studentManager);
		studentaddr = new StudentAdder(this, this.studentManager);
		studentViewer = new StudentViewer(this, this.studentManager);
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setupPanel(menuSelection);
		this.setVisible(true);
	
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}

	public MenuSelection getMenuSelection() {
		return menuSelection;
	}

	public void setMenuSelection(MenuSelection menuSelection) {
		this.menuSelection = menuSelection;
	}

	public StudentAdder getStudentaddr() {
		return studentaddr;
	}

	public void setStudentaddr(StudentAdder studentaddr) {
		this.studentaddr = studentaddr;
	}

	public StudentViewer getStudentViewer() {
		return studentViewer;
	}

	public void setStudentViewer(StudentViewer studentViewer) {
		this.studentViewer = studentViewer;
	}
	
	
	
}
