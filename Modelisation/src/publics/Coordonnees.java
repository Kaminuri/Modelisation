package publics;

public class Coordonnees {
	private double x, y, z;
	private static int zoomX = 100;
	private static int zoomY = -100;
	private static int transX,transY,transZ;

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
		zoomX= zoomX + 2;
	}

	public static void decreaseZoomX(){
		zoomX= zoomX - 2;
	}

	public static void increaseZoomY(){
		zoomY = zoomY + 2;
	}

	public static void decreaseZoomY(){
		zoomY = zoomY - 2;
	}
	public static int getZoomX() {
		return zoomX;
	}
	public static int getZoomY() {
		return zoomY;
	}
	
	public static int increaseTransX(){
		return transX++;
	}
	public static int increaseTransY(){
		return transY++;
	}
	public static int decreaseTransX(){
		return transX--;
	}
	public static int decreaseTransY(){
		return transY--;
	}
	public static int getTransX(){
		return transX;
	}

	public static int getTransY(){
		return transY;
	}
	public static int getTransZ() {
		return transZ;
	}

}
