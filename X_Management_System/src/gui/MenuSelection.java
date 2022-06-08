package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import event.ButtonAddListener;
import event.ButtonViewListener;
import util.StudentManager;

import java.awt.*;

public class MenuSelection extends JPanel {
	WindowFrame frame;
	StudentManager studentManager;
	public MenuSelection(WindowFrame frame, StudentManager studentManager) {
		this.frame = frame;
		this.studentManager = studentManager;
		this.setLayout(new BorderLayout());
		this.setSize(700,700);		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		JButton b1 = new JButton("add Student");
		JButton b2 = new JButton("view Student");
		JButton b3 = new JButton("edit Student");
		JButton b4 = new JButton("delete Student");
		JButton b5 = new JButton("exit program");
		
		b1.addActionListener(new ButtonAddListener(frame));
		b2.addActionListener(new ButtonViewListener(frame));
		
		panel1.add(label);
		panel2.add(b1);
		panel2.add(b2);
		panel2.add(b3);
		panel2.add(b4);
		panel2.add(b5);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		
	
		this.setVisible(true);
	}

}
