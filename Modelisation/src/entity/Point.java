package entity;

import java.util.Comparator;

import publics.Coordonnees;

public class Point implements Comparable<Point>,Comparator<Point>{
	private Coordonnees c;
	public Point(double x, double y, double z){
		c = new Coordonnees(x, y, z);
	}
	public Point(){
	
	}
	public double scalarProduct(Point p){
		return c.getX()*p.getX()+c.getY()*p.getY()+c.getZ()*p.getZ();
	}

	public void multiply(int m){
		c = new Coordonnees(c.getX()*m, c.getY()*m, c.getZ()*m);
	}
	
	public void setX(double x){
		c.setX(x);
	}
	public void setY(double y){
		c.setY(y);
	}
	public void setZ(double z){
		c.setZ(z);
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

	@Override
	public int compareTo(Point p) {
		if(p.getZ()<this.getZ()){
			return 1;
		}
		else if(p.getZ()>this.getZ()){
			return -1;
		}
		else if(p.getY() < this.getY()){
			return 1;
		}
		else if(p.getY() > this.getY()){
			return -1;
		}
		return 0;
	}
	@Override
	public int compare(Point p1, Point p2) {
		if(p1.getZ()<p2.getZ()){
			return 1;
		}
		else if(p1.getZ()>p2.getZ()){
			return -1;
		}
		else if(p1.getY() < p2.getY()){
			return 1;
		}
		else if(p1.getY() > p2.getY()){
			return -1;
		}
		return 0;
	}
}
