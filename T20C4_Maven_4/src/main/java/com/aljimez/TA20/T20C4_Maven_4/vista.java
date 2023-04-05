package com.aljimez.TA20.T20C4_Maven_4;

import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class vista extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	
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
		
		JLabel lblNewLabel = new JLabel("Eventos");
		lblNewLabel.setBounds(27, 49, 46, 14);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(83, 11, 343, 153);
		contentPane.add(textArea);
	}
		
				//https://docs.oracle.com/javase/8/javafx/api/javafx/stage/WindowEvent.html
		
		
		public void windowOpened(WindowEvent e) {
			
			textArea.append("Ventana abierta");
		}
		
		public void windowIconified(WindowEvent e) {
			
			textArea.append("Ventana Minimizada");
		}
		public void windowDeiconified(WindowEvent e) {
					
					textArea.append("Ventana restaurada");
				}
		public void windowDeactivated(WindowEvent e) {
			
			textArea.append("Ventana desactivada");
		}
		public void windowClosing(WindowEvent e) {
			
			textArea.append("Ventana cerrandose");
		}
		public void windowClosed(WindowEvent e) {
			
			textArea.append("Ventana cerrada");
		}
		public void windowActivated(WindowEvent e) {
					
					textArea.append("Ventana abierta");
		}
	
	
	
}
