package com.aljimez.TA20.T20C4_Maven_3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class vista extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;

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
		
		JLabel lblNewLabel = new JLabel("Boton 1:");
		lblNewLabel.setBounds(79, 11, 115, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Boton 1");
		btnNewButton.setBounds(117, 50, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(al);
		
		
		JButton btnBoton = new JButton("Boton 2");
		btnBoton.setBounds(277, 50, 89, 23);
		contentPane.add(btnBoton);
		
		JLabel lblBoton = new JLabel("Boton 2:");
		lblBoton.setBounds(275, 11, 115, 14);
		contentPane.add(lblBoton);
		btnBoton.addActionListener(ar);
	}

	ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int i = 1;
			lblNewLabel.setText("Boton 1: "+i+++"veces");
			setVisible(false);
			}
	};
	ActionListener ar = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int i = 1;
			lblNewLabel.setText("Boton 2: "+i+++"veces");
			setVisible(false);
			}
	};

}
