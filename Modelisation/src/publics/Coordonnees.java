package publics;


public class Coordonnees {
	private double x, y, z;

	public Coordonnees(double x1,double y1,double z2){
		x = x1;
		y = y1;
		z = z2;
	}
	public void ajouter(Coordonnees c){
		x += c.x;
		y += c.y;
		z += c.z;
	}
	public String toString(){
		return "["+x+" , "+y+", "+z+"]";
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	public double getZ() {
		return z;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void setZ(double z) {
		this.z = z;
	}
	

	public boolean equals(Coordonnees c){
		return x ==c.x && y == c.y && z == c.z;
	}


	
	

}
