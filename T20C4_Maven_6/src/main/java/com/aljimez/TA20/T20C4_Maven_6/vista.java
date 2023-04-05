package com.aljimez.TA20.T20C4_Maven_6;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class vista extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField resu;


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
		
		JLabel lblNewLabel = new JLabel("Altura (metros)");
		lblNewLabel.setBounds(10, 36, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Peso(kg)");
		lblNewLabel_1.setBounds(206, 36, 66, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Calcular IMC");
		btnNewButton.setBounds(80, 79, 116, 23);
		contentPane.add(btnNewButton);
		
		
		JLabel lblNewLabel_2 = new JLabel("IMC");
		lblNewLabel_2.setBounds(226, 83, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(110, 33, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(289, 33, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		resu = new JTextField();
		resu.setBounds(289, 80, 86, 20);
		contentPane.add(resu);
		resu.setColumns(10);
	
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in = textField.getText();
				String in1 = textField_1.getText();
				int oprnd = Integer.parseInt(in);
				int oprnd1 = Integer.parseInt(in1);
				int res =  oprnd*oprnd / oprnd1;
		 resu.setText(String.valueOf(res));
			//contentPane.add(resu);
			}
		});
		
		
		
	}
	
}
