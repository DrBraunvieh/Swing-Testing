import javax.swing.JFrame;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.net.URL;
import javax.swing.ImageIcon;

public class WindowManager {
	JFrame mainMenu = new JFrame("Hauptmenü");

	public void createWindow() {
		mainMenu.setSize(800, 800);
		mainMenu.setDefaultCloseOperation(2);//TODO: Find out why CLOSE_ON_EXIT doesn't work
		JMenuBar menu = new JMenuBar();
		menu.setBorder(new LineBorder(Color.blue));
		mainMenu.setJMenuBar(menu);
		JPanel armyList = new JPanel();
		JPanel wantedList = new JPanel();
		
		changeIcon("C:\\Users\\Armi\\Desktop\\Aaron\\Grafiken\\wolves_icon_discord.png");
		
		armyList.setBackground(Color.magenta);
		wantedList.setBackground(Color.pink);
		
		JTabbedPane menuPane = new JTabbedPane(JTabbedPane.LEFT, JTabbedPane.SCROLL_TAB_LAYOUT);
		
		menuPane.addTab("Armeeliste", armyList);
		menuPane.addTab("Wunschliste", wantedList);
		
		mainMenu.add(menuPane);
		
		mainMenu.setVisible(true);
	}
	
	public void changeIcon(String path) {
		ImageIcon icon = new ImageIcon(path);
		mainMenu.setIconImage(icon.getImage());
	}
}
