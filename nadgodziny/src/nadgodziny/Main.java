package nadgodziny;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Main extends JFrame implements ActionListener {
	
	public static void main (String[] args) {
		GUI gui = new GUI();
		gui.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
