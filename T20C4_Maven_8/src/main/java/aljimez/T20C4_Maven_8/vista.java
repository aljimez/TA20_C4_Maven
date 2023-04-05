package aljimez.T20C4_Maven_8;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class vista extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField del;

	
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
		
		JLabel lblNewLabel = new JLabel("Cantidad a convertir");
		lblNewLabel.setBounds(46, 11, 120, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(186, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setBounds(62, 101, 104, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(186, 98, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Ptas a euros");
		btnNewButton.setBounds(56, 37, 110, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cambiar");
		btnNewButton_1.setBounds(298, 37, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton del = new JButton("Borrar");
		del.setBounds(196, 37, 89, 23);
		contentPane.add(del);
			
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in = textField.getText();
				int oprnd = Integer.parseInt(in);
				int res =  oprnd / 166386;
				textField_1.setText(String.valueOf(res));
			}
		});
		
	
	del.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textField.setText("");
		}
	});
	
}	
		
}
