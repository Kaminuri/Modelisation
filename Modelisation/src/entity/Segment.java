package entity;

public class Segment {
	
	private Point p1, p2;
	
	public Segment(Point p1, Point p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	public Point getP1(){
		return p1;
	}
	public Point getP2(){
		return p2;
	}
}
