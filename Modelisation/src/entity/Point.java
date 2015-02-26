package entity;

import publics.Coordonnees;

public class Point {
	private Coordonnees c;
	public Point(double x, double y, double z){
		c = new Coordonnees(x, y, z);
	}
	
	public double scalarProduct(Point p){
		return c.getX()*p.getX()+c.getY()*p.getY()+c.getZ()*p.getZ();
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
