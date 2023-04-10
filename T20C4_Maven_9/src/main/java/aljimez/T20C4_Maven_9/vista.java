package aljimez.T20C4_Maven_9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class vista extends JFrame implements ActionListener {
	private JPanel panel;
	private JButton[] btn = new JButton[16];
	private Color[] colors = new Color[8];
	private int[] indices = new int[16];
	private int selCarta = -1;
	private int selCarta2 = -1;
	private int ttlpareja = 8;

	public vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);

		panel = new JPanel(new GridLayout(4, 4));

//---Colores en un array---//
		colors[0] = Color.RED;
		colors[1] = Color.ORANGE;
		colors[2] = Color.YELLOW;
		colors[3] = Color.GREEN;
		colors[4] = Color.CYAN;
		colors[5] = Color.BLUE;
		colors[6] = Color.MAGENTA;
		colors[7] = Color.PINK;

		for (int i = 0; i < ttlpareja; i++) {
			int rnd = (int) (Math.random() * 8);
			while (indices[rnd] != 0) {
				rnd = (int) (Math.random() * 8);
			}
			indices[rnd] = i + 1;
			indices[rnd + 8] = i + 1;
		}

//--Creacion de los botones----//
		for (int i = 0; i < 16; i++) {
			btn[i] = new JButton();
			btn[i].addActionListener(this);
			panel.add(btn[i]);
		}

		add(panel);
		setVisible(true);
	}

//---Asignacion de colores a los botones generados---//
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < 16; i++) {
			if (e.getSource() == btn[i]) {
				if (selCarta == -1) {
					selCarta = i;
					btn[i].setBackground(colors[indices[i] - 1]);
					btn[i].setEnabled(false);
				} else if (selCarta2 == -1 && i != selCarta) {
					selCarta2 = i;
					btn[i].setBackground(colors[indices[i] - 1]);
					btn[i].setEnabled(false);

					if (indices[selCarta] == indices[selCarta2]) {
						btn[selCarta].setVisible(false);
						btn[selCarta2].setVisible(false);
						} else {
						
						btn[selCarta].setBackground(null);
						btn[selCarta].setEnabled(true);

						btn[selCarta2].setBackground(null);
						btn[selCarta2].setEnabled(true);
					}
					selCarta = -1;
					selCarta2 = -1;
				}
			}
		}
	}

}