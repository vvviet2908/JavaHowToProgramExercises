// Grzegorz Ko�czak, 06.08.2016
// Exercise number 13.6 page 634
// Exercise from Java:How to program 10th edition

package chapter13;

import javax.swing.JFrame;

public class ConcentricCirclesDrawArcTest{
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Circles");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ConcentricCirclesDrawArc panel = new ConcentricCirclesDrawArc();
		frame.add(panel);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
