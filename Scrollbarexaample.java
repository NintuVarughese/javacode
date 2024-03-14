

import javax.Swing.*;

Scrollbarexaample()  {
	JFrame f=new JFrame("scrollbarexample");
	JScrollBar s=new JScrollBar();
	s.setBounds(100, 100, 30, 300);
	f.add(s);
	f.setSize(400, 400);
	f.setLayout(null);
	f.setVisible(true);
}

public static void main(String args[]) {
 new Scrollbarexaample();
}