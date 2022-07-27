import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		
		ImageIcon image = new ImageIcon("img/menubkg.jpg");
		
		JLabel label = new JLabel();
		label.setText("Vikings");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0xD1692E));
		label.setFont(new Font("Monospaced", Font.BOLD, 30));
		//String fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		//for (int i = 0; i < fonts.length; i++) {
			//System.out.println(fonts[i]);
		//}
		
		JFrame frame = new JFrame();
		frame.setTitle("Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setIconImage(image.getImage());
		//frame.getContentPane().setBackground(new Color(0xD1692E));
		frame.add(label);

	}

}
