package entity;

public class Face {
	 private Segment s1, s2, s3;
	 public Face(Segment s1, Segment s2, Segment s3){
		 this.s1 = s1;
		 this.s2 = s2;
		 this.s3 = s3;
	 }
	 public Point barycenter(){
	 	float x = 0, y =0, z = 0;
	 	return new Point(x, y, z);
	 }
	 public Point[] getXs(){
		 Point[] rep = new Point[3];
		 rep[0] = s1.getP1();
		 rep[1] = s1.getP2();
		 rep[2] = s2.getP2();
		 return rep;
	 }
}
