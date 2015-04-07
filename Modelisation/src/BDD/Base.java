package BDD;
import java.sql.*;
import java.util.HashMap;

public class Base  {
	String url, nom, mdp;
	Connection con;

	// Initialisation et enregistrement du driver.
	public Base(){
		con = null;
		try{
			Class.forName("org.sqlite.JDBC");
		}
		catch(Exception e){System.out.println(e.getMessage());}

		url = "jdbc:sqlite:src/resources/bdd/Base.db";
		nom = null;
		mdp = null;
	}

	public HashMap<String, HashMap<String, String>> select(){
		HashMap<String, HashMap<String, String>> liste = new HashMap<String, HashMap<String, String>>();
		try{
			System.out.println("test");
			con = DriverManager.getConnection(url,nom,mdp);
			System.out.println("test2");
			Statement stmt = con.createStatement();
			System.out.println("test3");
			String query = "Select * from Objets";
			ResultSet rs = stmt.executeQuery(query);
			System.out.println(query);
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
		}
		catch(Exception e){System.out.println(e.getMessage());}
		finally {
			try{con.close();} catch (Exception e){System.out.println(e.getMessage());}
		}
		return liste;
	}

	public void insert(String nom, String nomfichier, String tags, int points, int segments, int faces){
		try{
			con = DriverManager.getConnection(url,nom,mdp);
			Statement stmt = con.createStatement();
			String query = "Insert into Objets values ('" + nom + "','src\\resources\\models\\" + nomfichier + "','" + tags + "','" + points + "','" + segments + "','" + faces + "')";
			stmt.executeUpdate(query);
		}
		catch(Exception e){System.out.println(e.getMessage());}
		finally {
			try{con.close();} catch (Exception e){System.out.println(e.getMessage());}
		}
	}

	public static void main(String [] args){
		Base a = new Base();
		HashMap<String, HashMap<String, String>> b = a.select();
		//for(int i = 0; i < b.size(); i++){
		System.out.println(b.values());
		//}

	}

}