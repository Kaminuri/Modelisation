package entity;

public class Face {
	private Segment s1, s2, s3;
	private Point p1, p2, p3;
	public Face(Segment s1, Segment s2, Segment s3){
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		p1 = s1.getP1();
		p2 = s1.getP2();
		p3 = s2.getP2();
	}

	public Point barycenter(){
		float x = 0, y =0, z = 0;
		return new Point(x, y, z);
	}

	public Point[] getPoints(){
		Point[] tab = new Point[3];
		tab[0] = s1.getP1();
		tab[1] = s1.getP2();
		if(tab[0].equals(s2.getP1()) || tab[1].equals(s2.getP1())){
			tab[2] = s2.getP1();
		}
		else if(tab[0].equals(s2.getP2()) || tab[1].equals(s2.getP2())){
			tab[2] = s2.getP2();
		}
		return tab;
	}

}
