/**
 * Copyright(C) [2021] [Luvina Software Company]
 *
 * [CaroCheck.java] [Aug 5, 2021]  [cocvu]
 */
package tictactoe.logic;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * Description: Check các trường hợp thắng thua, ô hợp lệ để 
 * 				đánh nước cờ hay không
 * @author cocvu
 *
 */
public class CaroCheck {

	JButton[][] buttons = new JButton[20][20];
	
	
	public void checkWin() {
		for(int i = 0; i < 20; i++) {
			for(int j = 0; j < 20; j++) {
				if(buttons[i][j].getText().equals(buttons[i][j+1].getText())) {
					JOptionPane pane = new JOptionPane();
					int thongBaoWin = pane.showConfirmDialog(pane, "Game kết thúc!");
				}
			}
		}
	}
	
}
