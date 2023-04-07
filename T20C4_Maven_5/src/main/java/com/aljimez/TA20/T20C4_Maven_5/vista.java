package com.aljimez.TA20.T20C4_Maven_5;

import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseEvent;

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

		textArea = new JTextArea();
		textArea.setBounds(10, 58, 414, 192);
		textArea.setEditable(true);
		contentPane.add(textArea);
		textArea.addMouseListener(ar);

		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.setBounds(181, 11, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(al);


	}

	ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textArea.setText("Texto reiniciado");
			setVisible(false);
		}
	};

	MouseListener ar = new MouseListener() {
		public void mouseClicked(MouseEvent e) {
			textArea.append("Se ha hecho click izquierdo en la pantalla\n");

		}

		public void mouseEntered(MouseEvent e) {
			textArea.append("El puntero del raton sale del área\n");

		}

		public void mouseExited(MouseEvent e) {
			textArea.append("Un boton del raton ha sido presionado\n");

		}

		public void mousePressed(MouseEvent e) {
			textArea.append("Un boton del raton ha sido presionado\n");
		}

		public void mouseReleased(MouseEvent e) {
			textArea.append("Un boton del raton ha sido soltado\n");
		}
	};

};
