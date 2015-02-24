package frame;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class MBar extends JMenuBar{
	private JMenu menu, submenu;
	private JMenuItem menuItem;
	private JRadioButtonMenuItem rbMenuItem;
	private JCheckBoxMenuItem cbMenuItem;
	
	public MBar(){
		addFiles();
		addHelp();
	}
	
	private void addFiles(){
		//File
		menu = new JMenu("File");
		menu.setMnemonic(KeyEvent.VK_A);
		menu.getAccessibleContext().setAccessibleDescription("File");
		this.add(menu);

		//Open
		menuItem = new JMenuItem("Open", KeyEvent.VK_T);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription("Open a valid document from the Data Base");
		menu.add(menuItem);
		
		//Import
		menuItem = new JMenuItem("Import", KeyEvent.VK_T);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription("Try to import a File from your documents");
		menu.add(menuItem);
		
		menu.addSeparator();
		
		//Delete
		menuItem = new JMenuItem("Delete", KeyEvent.VK_T);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription("Delete a file from the Data Base");
		menu.add(menuItem);
		
		//Export
		menuItem = new JMenuItem("Export", KeyEvent.VK_T);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription("Export a File from data base to documents");
		menu.add(menuItem);
		
		menu.addSeparator();
		
		//Quit
		menuItem = new JMenuItem("Export", KeyEvent.VK_T);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription("Export a File from data base to documents");
		menu.add(menuItem);
	}
	
	private void addHelp(){
		//?
		menu = new JMenu("?");
		menu.setMnemonic(KeyEvent.VK_A);
		menu.getAccessibleContext().setAccessibleDescription("File");
		this.add(menu);
		
		//help
		menuItem = new JMenuItem("Help", KeyEvent.VK_T);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription("help");
		menu.add(menuItem);
		
		//A Propos
		menuItem = new JMenuItem("About", KeyEvent.VK_T);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription("About this project");
		menu.add(menuItem);
	}
}
