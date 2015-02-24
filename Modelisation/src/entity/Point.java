package entity;

import publics.Coordonnees;

public class Point {
	private Coordonnees c;
	public Point(double x, double y, double z){
		c = new Coordonnees(x, y, z);
	}
	public int scalarProduct(Point p){
		return this.getY()*p.getZ() - p.getY()*this.getZ() 
		+ this.z*p.getX()- this.x*p.getZ() 
		+ this.getX()*p.getY() - this.getY()*p.getX();
	}
	public void multiply(int m){
		c = new Coordonnees(c.getX()*m, c.getY()*m, c.getZ()*m);
	}
	public double getX(){
		return c.getX();
	}
	
	public double getY(){
		return c.getY();
	}
	
	public double getZ(){
		return c.getZ();
	}
	public String toString(){
		return c + "";
	}
}
