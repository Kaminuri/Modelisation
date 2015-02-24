package entity;

import publics.Coordonnees;

public class Point {
	private Coordonnees c;
	public Point(double x, double y, double z){
		c = new Coordonnees(x, y, z);
	}
	public double scalarProduct(Point p){
		return this.getY()*p.getZ() - p.getY()*this.getZ() 
		+ this.getZ()*p.getX()- this.getX()*p.getZ() 
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
	
	public boolean equals(Point p){
		return c.equals(p.getC());
	}
	private Coordonnees getC() {
		
		return c;
	}
}
