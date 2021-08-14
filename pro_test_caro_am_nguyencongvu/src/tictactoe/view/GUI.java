/**
 * Copyright(C) [2021] [Luvina Software Company]
 *
 * [GUI.java] [Aug 3, 2021]  [cocvu]
 */
package tictactoe.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import tictactoe.logic.CaroCheck;
import tictactoe.model.TicTacToeButton;

/**
 * Description: Khởi tạo đối tượng và vẽ giao diện
 * @author cocvu
 *
 */
public class GUI extends JFrame{
	
	//Đặt biến hằng tiêu đề
	public static final String TITLE = "Caro Game";
	//Đặt biến hằng kích cỡ chiều rộng cửa sổ
	public static final int FRAME_WIDTH = 1000;
	//Đặt biến hằng kích cỡ chiều cao cửa sổ
	public static final int FRAME_HEIGHT = 1000;
	// Khai báo các Jbutton tương ứng với các ô
	JButton[][] buttons = new JButton[20][20];
	
	// Tạo đối tượng Đánh - để vẽ X hoặc O
	TicTacToeButton danh = new TicTacToeButton();
	
	CaroCheck checkXO = new CaroCheck();
	
	/**
	 * 
	 * Description: Khởi tạo đối tượng giao diện
	 */
	public GUI() {
		setLayout(new GridLayout(20, 20));
		initGUI();
		//addEvents();
		addComps();
	}
	
	/**
	 * 
	 * Description: Khởi tạo giao diện
	 *
	 */
	public void initGUI() {
		// Tạo tên tiêu đề
		setTitle(TITLE);
		// Kích thước cửa sổ
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		// Vị trí cửa sổ khi hiện lên giữa màn hình lap
		setLocationRelativeTo(null);
		// Hoạt động xảy ra khi nhấn tắt cửa sổ
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	/**
	 * 
	 * Description: Khởi tạo đối tượng component
	 *
	 */
	public void addComps() {
		for (int i=0; i<20; i++) {
			for (int j = 0; j < 20; j++) {
				buttons[i][j] = new JButton();
				buttons[i][j].setText("-");
				buttons[i][j].setBackground(Color.white);
				

				danh.nhapChuot(buttons[i][j]);
				
				// Thêm đối tượng vào giao diện
				add(buttons[i][j]);
				
				
			}
			
		}
	}
	
}
