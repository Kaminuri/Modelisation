package BDD;
import java.sql.*;
import java.util.HashMap;

public class Base  {
		String url, nom, mdp;
	
		// Initialisation et enregistrement du driver.
	public Base(){
		try{
		Class.forName("org.sqlite.JDBC");
		}
		catch(Exception e){System.out.println(e);}
		
		url = "jdbc:sqlite:src\\resources\\bdd\\Base.db";
    	nom = null;
    	mdp = null;
	}
	
	public HashMap<String, HashMap<String, String>> select(){
		HashMap<String, HashMap<String, String>> liste = new HashMap<String, HashMap<String, String>>();
		try{
		Connection con = DriverManager.getConnection(url,nom,mdp);
       	Statement stmt = con.createStatement();
       	ResultSet rs = stmt.executeQuery("Select * from Objets");
       	ResultSetMetaData metadata = rs.getMetaData();
       	int nombreColonnes = metadata.getColumnCount();
       	while(rs.next()){
       		HashMap<String, String> valeur = new HashMap<String, String>();
       		for(int i = 0; i < nombreColonnes ; i++){
       			String nameColone = metadata.getColumnName(i+1);
       			valeur.put(nameColone, rs.getString(nameColone));
       		}
       		liste.put(metadata.getColumnName(1), valeur);
       	}
	  	con.close();
	}
	catch(Exception e){System.out.println(e); System.out.println("2");}
	return liste;
	}
	
	public void insert(String nom, String nomfichier, String tags, int points, int segments, int faces){
		try{
    	Connection con = DriverManager.getConnection(url,nom,mdp);
       	Statement stmt = con.createStatement();
       	String query = "Insert into Objets values ('" + nom + "','src\\resources\\models\\" + nomfichier + "','" + tags + "','" + points + "','" + segments + "','" + faces + "')";
    	stmt.executeUpdate(query);
	   	con.close();
		}
		catch(Exception e){System.out.println(e); System.out.println("2");}
	}
	
	public static void main(String [] args){
			Base a = new Base();
			HashMap<String, HashMap<String, String>> b = a.select();
			//for(int i = 0; i < b.size(); i++){
				System.out.println(b.values());
			//}
			
	}

}