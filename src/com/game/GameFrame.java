package com.game;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameFrame extends JFrame implements MouseListener {
	JPanel restartPanel = new JPanel();
	JPanel playPanel = new JPanel();
	JLabel status = new JLabel("X TURN");
	JButton restartButton = new JButton("Restart");

	JLabel label1 = new JLabel("");
	JLabel label2 = new JLabel("");
	JLabel label3 = new JLabel("");
	JLabel label4 = new JLabel("");
	JLabel label5 = new JLabel("");
	JLabel label6 = new JLabel("");
	JLabel label7 = new JLabel("");
	JLabel label8 = new JLabel("");
	JLabel label9 = new JLabel("");

	ImageIcon icon = new ImageIcon("tic-tac-toe-02.jpg");

	Border border = BorderFactory.createLineBorder(Color.BLACK);
	Border statusBorder = BorderFactory.createLineBorder(Color.MAGENTA);

	/*
	* true = X turn
	* false = O turn
	* */
	boolean switchTurn = true;

	GameFrame() {
		this.setTitle("TicTacToe");
		this.setIconImage(icon.getImage());
		this.setBounds(432, 40, 502, 688);
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		restartPanel.setBounds(0, 0, 500, 150);
		playPanel.setBounds(0, 150, 500, 500);

		restartPanel.setBackground(Color.GRAY);
		restartPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 60));
		restartPanel.add(status);
		restartPanel.add(restartButton);
		restartButton.setFont(new Font("MV Boli", Font.PLAIN, 20));
		restartButton.setFocusable(false);
		restartButton.addMouseListener(this);
		status.setPreferredSize(new Dimension(171, 60));
		status.setHorizontalAlignment(SwingConstants.CENTER);
		status.setFont(new Font("MV Boli", Font.PLAIN, 30));
		status.setForeground(Color.RED);
		status.setBackground(Color.BLACK);
		status.setOpaque(true);
		status.setBorder(statusBorder);

		playPanel.setLayout(new GridLayout(3, 3));
		addLabels();

		this.add(restartPanel);
		this.add(playPanel);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == restartButton) {
			restartGame();
		}
		else {
			StringBuilder result = new StringBuilder(e.getSource().toString());
			switch (result.delete(result.indexOf(",166x166"), result.length() - 1).toString()) {
				case "javax.swing.JLabel[,1,1]" : { //label1
					label1.setForeground((switchTurn) ? Color.RED : Color.BLUE);
					label1.setText((switchTurn) ? "X" : "O");
					label1.removeMouseListener(this);
					switchTurn = (switchTurn) ? false : true;
					changeStatus();
					checkGameStatus();
					break;
				}
				case "javax.swing.JLabel[,167,1]": { //label2
					label2.setForeground((switchTurn) ? Color.RED : Color.BLUE);
					label2.setText((switchTurn) ? "X" : "O");
					label2.removeMouseListener(this);
					switchTurn = (switchTurn) ? false : true;
					changeStatus();
					checkGameStatus();
					break;
				}
				case "javax.swing.JLabel[,333,1]": { //label3
					label3.setForeground((switchTurn) ? Color.RED : Color.BLUE);
					label3.setText((switchTurn) ? "X" : "O");
					label3.removeMouseListener(this);
					switchTurn = (switchTurn) ? false : true;
					changeStatus();
					checkGameStatus();
					break;
				}
				case "javax.swing.JLabel[,1,167]": { //label4
					label4.setForeground((switchTurn) ? Color.RED : Color.BLUE);
					label4.setText((switchTurn) ? "X" : "O");
					label4.removeMouseListener(this);
					switchTurn = (switchTurn) ? false : true;
					changeStatus();
					checkGameStatus();
					break;
				}
				case "javax.swing.JLabel[,167,167]": { // label5
					label5.setForeground((switchTurn) ? Color.RED : Color.BLUE);
					label5.setText((switchTurn) ? "X" : "O");
					label5.removeMouseListener(this);
					switchTurn = (switchTurn) ? false : true;
					changeStatus();
					checkGameStatus();
					break;
				}
				case "javax.swing.JLabel[,333,167]": { //label6
					label6.setForeground((switchTurn) ? Color.RED : Color.BLUE);
					label6.setText((switchTurn) ? "X" : "O");
					label6.removeMouseListener(this);
					switchTurn = (switchTurn) ? false : true;
					changeStatus();
					checkGameStatus();
					break;
				}
				case "javax.swing.JLabel[,1,333]": { //label7
					label7.setForeground((switchTurn) ? Color.RED : Color.BLUE);
					label7.setText((switchTurn) ? "X" : "O");
					label7.removeMouseListener(this);
					switchTurn = (switchTurn) ? false : true;
					changeStatus();
					checkGameStatus();
					break;
				}
				case "javax.swing.JLabel[,167,333]": { //label8
					label8.setForeground((switchTurn) ? Color.RED : Color.BLUE);
					label8.setText((switchTurn) ? "X" : "O");
					label8.removeMouseListener(this);
					switchTurn = (switchTurn) ? false : true;
					changeStatus();
					checkGameStatus();
					break;
				}
				case "javax.swing.JLabel[,333,333]": { //label9
					label9.setForeground((switchTurn) ? Color.RED : Color.BLUE);
					label9.setText((switchTurn) ? "X" : "O");
					label9.removeMouseListener(this);
					switchTurn = (switchTurn) ? false : true;
					changeStatus();
					checkGameStatus();
					break;
				}
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	//Other methods
	public void addLabels() {
		playPanel.add(label1);
		playPanel.add(label2);
		playPanel.add(label3);
		playPanel.add(label4);
		playPanel.add(label5);
		playPanel.add(label6);
		playPanel.add(label7);
		playPanel.add(label8);
		playPanel.add(label9);

		label1.setOpaque(true);
		label2.setOpaque(true);
		label3.setOpaque(true);
		label4.setOpaque(true);
		label5.setOpaque(true);
		label6.setOpaque(true);
		label7.setOpaque(true);
		label8.setOpaque(true);
		label9.setOpaque(true);

		label1.setBackground(Color.WHITE);
		label2.setBackground(Color.WHITE);
		label3.setBackground(Color.WHITE);
		label4.setBackground(Color.WHITE);
		label5.setBackground(Color.WHITE);
		label6.setBackground(Color.WHITE);
		label7.setBackground(Color.WHITE);
		label8.setBackground(Color.WHITE);
		label9.setBackground(Color.WHITE);

		label1.addMouseListener(this);
		label2.addMouseListener(this);
		label3.addMouseListener(this);
		label4.addMouseListener(this);
		label5.addMouseListener(this);
		label6.addMouseListener(this);
		label7.addMouseListener(this);
		label8.addMouseListener(this);
		label9.addMouseListener(this);

		label1.setBorder(border);
		label2.setBorder(border);
		label3.setBorder(border);
		label4.setBorder(border);
		label5.setBorder(border);
		label6.setBorder(border);
		label7.setBorder(border);
		label8.setBorder(border);
		label9.setBorder(border);

		label1.setFont(new Font("MV Boli", Font.PLAIN, 100));
		label2.setFont(new Font("MV Boli", Font.PLAIN, 100));
		label3.setFont(new Font("MV Boli", Font.PLAIN, 100));
		label4.setFont(new Font("MV Boli", Font.PLAIN, 100));
		label5.setFont(new Font("MV Boli", Font.PLAIN, 100));
		label6.setFont(new Font("MV Boli", Font.PLAIN, 100));
		label7.setFont(new Font("MV Boli", Font.PLAIN, 100));
		label8.setFont(new Font("MV Boli", Font.PLAIN, 100));
		label9.setFont(new Font("MV Boli", Font.PLAIN, 100));

		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label5.setHorizontalAlignment(SwingConstants.CENTER);
		label6.setHorizontalAlignment(SwingConstants.CENTER);
		label7.setHorizontalAlignment(SwingConstants.CENTER);
		label8.setHorizontalAlignment(SwingConstants.CENTER);
		label9.setHorizontalAlignment(SwingConstants.CENTER);
	}

	public void restartGame() {
		int option = JOptionPane.showConfirmDialog(null, "Do you really want to restart?",
				"Restart", JOptionPane.YES_NO_OPTION);
		if(option == 0) {
			changeStatus();

			label1.setText("");
			label2.setText("");
			label3.setText("");
			label4.setText("");
			label5.setText("");
			label6.setText("");
			label7.setText("");
			label8.setText("");
			label9.setText("");

			label1.setBackground(Color.WHITE);
			label2.setBackground(Color.WHITE);
			label3.setBackground(Color.WHITE);
			label4.setBackground(Color.WHITE);
			label5.setBackground(Color.WHITE);
			label6.setBackground(Color.WHITE);
			label7.setBackground(Color.WHITE);
			label8.setBackground(Color.WHITE);
			label9.setBackground(Color.WHITE);

			label1.removeMouseListener(this);
			label2.removeMouseListener(this);
			label3.removeMouseListener(this);
			label4.removeMouseListener(this);
			label5.removeMouseListener(this);
			label6.removeMouseListener(this);
			label7.removeMouseListener(this);
			label8.removeMouseListener(this);
			label9.removeMouseListener(this);

			label1.addMouseListener(this);
			label2.addMouseListener(this);
			label3.addMouseListener(this);
			label4.addMouseListener(this);
			label5.addMouseListener(this);
			label6.addMouseListener(this);
			label7.addMouseListener(this);
			label8.addMouseListener(this);
			label9.addMouseListener(this);
		}
	}

//	Method to check game status -> decide who wins or else both tie
	public void checkGameStatus() {
		boolean horizontalCase1 = ((label1.getText().equals(label2.getText()) &&
				label2.getText().equals(label3.getText())) && (!label1.getText().equals("") &&
				!label2.getText().equals("") && !label3.getText().equals("")));
		boolean horizontalCase2 = ((label4.getText().equals(label5.getText()) &&
				label5.getText().equals(label6.getText())) && (!label4.getText().equals("") &&
				!label5.getText().equals("") && !label6.getText().equals("")));
		boolean horizontalCase3 = ((label7.getText().equals(label8.getText()) &&
				label8.getText().equals(label9.getText())) && (!label7.getText().equals("") &&
				!label8.getText().equals("") && !label9.getText().equals("")));
		boolean horizontalCases = (horizontalCase1 || horizontalCase2 || horizontalCase3);

		boolean verticalCase1 = ((label1.getText().equals(label4.getText()) &&
				label4.getText().equals(label7.getText())) && (!label1.getText().equals("") &&
				!label4.getText().equals("") && !label7.getText().equals("")));
		boolean verticalCase2 = ((label2.getText().equals(label5.getText()) &&
				label5.getText().equals(label8.getText())) && (!label2.getText().equals("") &&
				!label5.getText().equals("") && !label8.getText().equals("")));
		boolean verticalCase3 = ((label3.getText().equals(label6.getText()) &&
				label6.getText().equals(label9.getText())) && (!label3.getText().equals("") &&
				!label6.getText().equals("") && !label9.getText().equals("")));
		boolean verticalCases = (verticalCase1 || verticalCase2 || verticalCase3);

		boolean diagonalCase1 = ((label1.getText().equals(label5.getText()) &&
				label5.getText().equals(label9.getText())) && (!label1.getText().equals("") &&
				!label5.getText().equals("") && !label9.getText().equals("")));
		boolean diagonalCase2 = ((label3.getText().equals(label5.getText()) &&
				label5.getText().equals(label7.getText())) && (!label3.getText().equals("") &&
				!label5.getText().equals("") && !label7.getText().equals("")));
		boolean diagonalCases = (diagonalCase1 || diagonalCase2);

		boolean gameWin = (horizontalCases || verticalCases || diagonalCases);
		boolean gameTie = (!gameWin && (!label1.getText().equals("") && !label2.getText().equals("") &&
				!label3.getText().equals("") && !label4.getText().equals("") && !label5.getText().equals("") &&
				!label6.getText().equals("") && !label7.getText().equals("") && !label8.getText().equals("") &&
				!label9.getText().equals("")));

		if(gameWin) {
			stopGame();
			if(horizontalCase1 || verticalCase1 || diagonalCase1) {
				status.setForeground((label1.getText().equals("X")) ? Color.RED : Color.BLUE);
				status.setText(label1.getText() + " WINS !!");
				if(horizontalCase1)
					flickeredLabel(label1, label2, label3);
				else if(verticalCase1)
					flickeredLabel(label1, label4, label7);
				else flickeredLabel(label1, label5, label9);
			}
			else if(verticalCase2) {
				status.setForeground((label2.getText().equals("X")) ? Color.RED : Color.BLUE);
				status.setText(label2.getText() + " WINS !!");
				flickeredLabel(label2, label5, label8);
			}
			else if(verticalCase3 || diagonalCase2) {
				status.setForeground((label3.getText().equals("X")) ? Color.RED : Color.BLUE);
				status.setText(label3.getText() + " WINS !!");
				if(verticalCase3)
					flickeredLabel(label3, label6, label9);
				else flickeredLabel(label3, label5, label7);
			}
			else if(horizontalCase2) {
				status.setForeground((label4.getText().equals("X")) ? Color.RED : Color.BLUE);
				status.setText(label4.getText() + " WINS !!");
				flickeredLabel(label4, label5, label6);
			}
			else if(horizontalCase3) {
				status.setForeground((label7.getText().equals("X")) ? Color.RED : Color.BLUE);
				status.setText(label7.getText() + " WINS !!");
				flickeredLabel(label7, label8, label9);
			}
		}
		else if(gameTie) {
			status.setForeground(Color.YELLOW);
			status.setText("TIE !!");
		}
	}

	public void stopGame() {
		label1.removeMouseListener(this);
		label2.removeMouseListener(this);
		label3.removeMouseListener(this);
		label4.removeMouseListener(this);
		label5.removeMouseListener(this);
		label6.removeMouseListener(this);
		label7.removeMouseListener(this);
		label8.removeMouseListener(this);
		label9.removeMouseListener(this);
	}
	public void changeStatus() {
		status.setForeground((switchTurn) ? Color.RED : Color.BLUE);
		status.setText((switchTurn) ? "X TURN" : "O TURN");
	}

	public void flickeredLabel(JLabel a, JLabel b, JLabel c) {
		a.setBackground(Color.GREEN);
		b.setBackground(Color.GREEN);
		c.setBackground(Color.GREEN);
	}
}