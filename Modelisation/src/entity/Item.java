package entity;

import java.util.ArrayList;
import java.util.List;

import publics.Const;

public class Item {
	private List<Face> f;
	
	public Item(){
		f = new ArrayList<Face>();
		f = Const.faces;
	}
	
	
	public void rotation(){
		
	}
	
	public void translation(){
		
	}
	
	public double[] extremites(){
		//tab[0] -> minX ; tab[1] -> maxX  ; tab[2] -> minY ; tab[3] -> maxY
		double[] tab=new double[4];
		tab[0] = Const.points.get(0).getX();
		tab[1] = Const.points.get(0).getX();
		tab[2] = Const.points.get(0).getY();
		tab[3] = Const.points.get(0).getY();
		int i = 0;
		for (Face f2 : f) {
			Point[] t = f2.getPoints();
			for(Point p : t){
				if(tab[0] > p.getX()){
					tab[0] = p.getX();
				}
				if(tab[1] < p.getX()){
					tab[1] = p.getX();
				}
				if(tab[2] > p.getY()){
					tab[2] = p.getY();
				}
				if(tab[3] < p.getY()){
					tab[3] = p.getY();
				}
			}
		}
		return tab;
	}
}
