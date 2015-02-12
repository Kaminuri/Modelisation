package entity;

import publics.Coordonnees;

public class Point {
	private Coordonnees c;
	public Point(double x, double y, double z){
		c = new Coordonnees(x, y, z);
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
