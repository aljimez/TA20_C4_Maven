package com.aljimez.TA20.T20C4_Maven_2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JButton;

public class vista extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnBoton;

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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(55, 50, 91, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Boton 1");
		btnNewButton.setBounds(196, 46, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(al);
		
		
		JButton btnBoton = new JButton("Boton 2");
		btnBoton.setBounds(320, 46, 89, 23);
		contentPane.add(btnBoton);
		btnBoton.addActionListener(ar);
	}

	ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			lblNewLabel.setText("Has pulsado Boton 1");
			setVisible(false);
			}
	};
	ActionListener ar = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			lblNewLabel.setText("Has pulsado Boton 2");
			setVisible(false);
			}
	};
	
	}


