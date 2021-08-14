/**
 * Copyright(C) [2021] [Luvina Software Company]
 *
 * [TicTacToeButton.java] [Aug 4, 2021]  [cocvu]
 */
package tictactoe.model;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * Description: 
 * @author cocvu
 *
 */
public class TicTacToeButton extends JButton{
	
	//Khai báo biến player x
	char player = 'x';
	//Khai báo biến buttons
	JButton buttons = new JButton();

	
	/**
	 * 
	 * Description: Đánh cờ
	 * 
	 * @param button nhận đầu vào là một button
	 */
	public void nhapChuot(JButton button) {
		this.buttons = button;
		
		buttons.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton buttonClicked = (JButton) e.getSource();
				if (buttonClicked.getText() == "-") {
					
					buttonClicked.setText(String.valueOf(player));
					if(player == 'x') {
						player = 'o';
						buttonClicked.setBackground(Color.CYAN);
					} else {
						player = 'x';
						buttonClicked.setBackground(Color.ORANGE);
					} // kết thúc giai đoạn if else
				}
			}
		});
	}
	
	
}
