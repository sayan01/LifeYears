import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class GUI extends JFrame{
	final int frameW = 480;
	final int frameH = 480;
	GUI(int years){
		super("LifeYears");
		setSize(frameW+8,frameH+64);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(null);
		
		ImageIcon green = new ImageIcon("green.png");
		JButton[] yearBox = new JButton[100];
		int buttonW = frameW/10;
		int buttonH = frameH/10;
		int buttonOffset = 32;
		for(int i = 0; i < 100;i++){
			JButton temp = new JButton(green);
			temp.setSize(buttonW,buttonH);
			temp.setLocation((i/10)*buttonW,(i%10)*buttonH + buttonOffset);
			if(i>=years)
				temp.setEnabled(false);
			add(temp);
			yearBox[i] = temp;
		}

		JLabel lbl = new JLabel("No. of Years: "+years);
		lbl.setBounds(0,0,480,32);
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbl);
		
		setVisible(true);
	}
}
