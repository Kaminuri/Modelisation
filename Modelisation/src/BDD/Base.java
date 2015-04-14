package BDD;
import java.sql.*;
import java.util.HashMap;

public class Base  {
	String url, nom, mdp;
	Connection con;

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
			con = DriverManager.getConnection(url,nom,mdp);
			Statement stmt = con.createStatement();
			String query = "Select * from Objets";
			ResultSet rs = stmt.executeQuery(query);
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
	
	public HashMap<String, HashMap<String, String>> select2(String[] tags){
		HashMap<String, HashMap<String, String>> liste = new HashMap<String, HashMap<String, String>>();
		try{
			con = DriverManager.getConnection(url,nom,mdp);
			Statement stmt = con.createStatement();
			int taille = tags.length;
			String query = "Select * from Objets where (";
			System.out.println(query);
			for(int i = 0; i < taille; i++){
				for(int j = 1; j < 4+1; j++){
					query += "Tag" + j +" = '" + tags[i] +"'";
					if(j ==  4){
						query += ")";
					}
					else{
						query += " OR ";
					}
					System.out.println(query);
				}
				if( i < taille - 1){
					query += " AND (";
				}
				System.out.println(query);
			}
			System.out.println(query);
			ResultSet rs = stmt.executeQuery(query);
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
		String[] s = new String[2];
		s[0] = "test";
		s[1] = "test2";
		HashMap<String, HashMap<String, String>> b = a.select2(s);

		System.out.println(b.values());


	}

}