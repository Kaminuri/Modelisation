package frame.tools;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import BDD.Base;

public class FileInsert extends JFrame{
	protected File f;
	protected Base bdd;
	private FileInsert lll;
	public FileInsert(final File f){
		bdd = new Base();
		lll = this;
		this.f = f;
		JPanel contain = new JPanel();
		//Label
		JPanel labelContainer = new JPanel();
		labelContainer.setLayout(new BoxLayout(labelContainer, BoxLayout.Y_AXIS));
		final JTextField name = new JTextField(f.getName());
		JLabel tag = new JLabel("Tags");
		JLabel desc = new JLabel("Description");
		labelContainer.add(name);
		labelContainer.add(tag);
		labelContainer.add(desc);
		
		//textSetter
		JPanel textContainer = new JPanel();
		textContainer.setLayout(new BoxLayout(textContainer, BoxLayout.Y_AXIS));
		JButton buttonToChangeFile = new JButton(f.getName());
		buttonToChangeFile.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JFileChooser j = new JFileChooser();
				j.showOpenDialog(null);
				if(j.getSelectedFile() != null){
					//Utilisable pour l'instant par tout le monde
					File ImportFileTmp = j.getSelectedFile();
					lll = new FileInsert(ImportFileTmp);
				}
				
			}
		});
		final JTextField non = new JTextField();
		final JTextField tg = new JTextField(" ");
		textContainer.add(buttonToChangeFile);
		textContainer.add(non);
		textContainer.add(tg);
		
		//les buttons
		JPanel buttonContainer = new JPanel();
		buttonContainer.setLayout(new BoxLayout(buttonContainer, BoxLayout.Y_AXIS));
		JButton next = new JButton("Next");
		next.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String tags = non.getText();
				String nam = name.getText();
				String des =  tg.getText();
				String[] tab = tags.split(",");
				ArrayList<String> tab2 = new ArrayList<String>() ;
				if(!bdd.estDeja(nam)){
					File dest = new File("src\\resources\\models\\" + nam + ".gts");
					copyFile(f, dest);
					if(!tg.equals(" ")){
						tab2.add(nam);						
						if(tab.length >= 3){
							for(int i = 1; i < tab.length; i++){
							tab2.add(tab[i-1]);
							}
						}
						else if(tab.length < 3){
							int i = 1;
							for(; i < tab.length + 1; i++){
								tab2.add(tab[i-1]);
							}
							for(; i < 4; i++){
								tab2.add("null");
							}
						}
					}
					else{
						tab2.add(nam);
						for(int i = 1; i < 3; i ++){
							tab2.add("null");
						}
					}
					bdd.insert(nam, nam + ".gts", tab2.get(0), tab2.get(1), tab2.get(2), tab2.get(3), 0, 0, 0);
					
				}
					
				else {
					JOptionPane.showMessageDialog(new JFrame(), "Le nom existe deja");
				}
								
			}
		}); 
		JButton cancel = new JButton("Cancel");
		cancel.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				
			}
		});
		
		buttonContainer.add(next);
		buttonContainer.add(cancel);
		
		contain.add(labelContainer);
		contain.add(textContainer);
		contain.add(buttonContainer);
		getContentPane().add(contain);
		//this.setResizable(true);
		this.pack();
	    this.setLocationRelativeTo(null);
	    this.setVisible(true);
	}
	
	public static boolean copyFile(File source, File dest){
		try{
			// Declaration et ouverture des flux
			java.io.FileInputStream sourceFile = new java.io.FileInputStream(source);
	 
			try{
				java.io.FileOutputStream destinationFile = null;
	 
				try{
					destinationFile = new FileOutputStream(dest);
	 
					// Lecture par segment de 0.5Mo 
					byte buffer[] = new byte[512 * 1024];
					int nbLecture;
	 
					while ((nbLecture = sourceFile.read(buffer)) != -1){
						destinationFile.write(buffer, 0, nbLecture);
					}
				} finally {
					destinationFile.close();
				}
			} finally {
				sourceFile.close();
			}
		} catch (IOException e){
			e.printStackTrace();
			return false; // Erreur
		}
	 
		return true; // Résultat OK  
	}
}
