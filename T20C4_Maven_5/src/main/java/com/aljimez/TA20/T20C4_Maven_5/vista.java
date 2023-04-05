package com.aljimez.TA20.T20C4_Maven_5;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class vista extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;

	/**
	 * Create the frame.
	 */
	public vista() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 58, 414, 192);
		textArea.setEditable(false);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.setBounds(181, 11, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(al);

		
		//https://docs.oracle.com/javase/8/javafx/api/javafx/scene/input/MouseEvent.html
		
		
		/**
		 * ANY
		 * DRAG_DETECTED
		 * MOUSE_CLICKED
		 * MOUSE_DRAGGER
		 * MOUSE_ENTERED
		 * MOUSE_ENTERED_TARGET
		 * MOUSE_EXITED
		 * MOUSE_EXITED_TARGET
		 * MOUSE_MOVED
		 * MOUSE_PRESSED
		 * MOUSE_RELEASED
		 * */
	}
	ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textArea.setText("");
			setVisible(false);
			}
	};
	
public void mouseClicked(MouseEvent e) {
	
	textArea.append("Se ha hecho click izquierdo en la pantalla");
}

public void mouseEntered(MouseEvent e ) {
	
	textArea.append("El puntero del raton entra en la zona textarea");

}
public void mouseExited(MouseEvent e ) {
	
	textArea.append("El puntero del raton sale del área");

}
public void mousePressed(MouseEvent e ) {
	
	textArea.append("Un boton del raton ha sido presionado");

}
public void mouseReleased(MouseEvent e ) {
	
	textArea.append("Se suelta un boton del raton");

}
	
}
