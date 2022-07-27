import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
		ImageIcon image = new ImageIcon("img/menubkg.jpg");
		frame.setIconImage(image.getImage());
//		frame.getContentPane().setBackground(new Color(0xD1692E));
	}
	
}
