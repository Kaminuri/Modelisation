package publics;

public class Coordonnees {
	private double x, y, z;
	private static int zoomX = 100;
	private static int zoomY = -100;
	
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
	
	public boolean equals(Coordonnees c){
		return x ==c.x && y == c.y && z == c.z;
	}
	
	public static void increaseZoomX(){
		zoomX++;
	}
	
	public static void decreaseZoomX(){
		zoomX--;
	}

	public static void increaseZoomY(){
		zoomY++;
	}
	
	public static void decreaseZoomY(){
		zoomY--;
	}
	public static int getZoomX() {
		return zoomX;
	}
	public static int getZoomY() {
		return zoomY;
	}
	
	
	
}
