package entity;

import publics.Coordonnees;

public class Point {
	private Coordonnees c;
	public Point(double x, double y, double z){
		c = new Coordonnees(x, y, z);
	}
	public String toString(){
		return c + "";
	}
}
