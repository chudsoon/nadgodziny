package nadgodziny;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;



public class GUI extends Main {
	
	public GUI() {
		frame();
		menuBar();
		
	}
	
	private void frame() {
		
		setTitle("Nadgodziny");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private void menuBar() {
		
		//menu bar
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu menuFile = new JMenu("Plik");
		menuBar.add(menuFile);
		JMenu menuOverHours = new JMenu("Nadgodziny");
		menuBar.add(menuOverHours);
		JMenu menuOptions = new JMenu("Opcje");
		menuBar.add(menuOptions);
		JMenu menuHelp = new JMenu("Pomoc");
		menuBar.add(menuHelp);
		
		//menu file
		JMenuItem mOpen = new JMenuItem("Otwórz");
		menuFile.add(mOpen);
		JMenuItem mSave = new JMenuItem("Zapisz");
		menuFile.add(mSave);
		JMenuItem mClose = new JMenuItem("Zakoñcz");
		menuFile.add(mClose);
		
		//menu overHours
		JMenuItem mOverHours = new JMenuItem("Moje nadgodziny");
		menuOverHours.add(mOverHours);
		JMenuItem mAdd = new JMenuItem("Dodaj");
		menuOverHours.add(mAdd);
		JMenuItem mTake = new JMenuItem("Odbierz");
		menuOverHours.add(mTake);
		
		
	}
	
	

}
