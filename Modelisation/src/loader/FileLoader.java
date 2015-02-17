package loader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import publics.Const;
import entity.Face;
import entity.Point;
import entity.Segment;

public class FileLoader {
	private int nbPoint, nbSeg, nbFace;
	private double x, y , z;
	private Point p1, p2;
	private Segment s1,s2,s3;
	
	public FileLoader(){
		clearLists();
		String sta;
		String currnt;
		try(BufferedReader br = new BufferedReader(new FileReader("src/models/cone.gts"))){
			sta = br.readLine();
			initNbs(sta);
			for(int i = 0; i<nbPoint; i++){
				currnt = br.readLine();
				initPoints(currnt);
				Const.points.add(new Point(x, y, z));
			}
			for(int i = 0; i<nbSeg; i++){
				currnt = br.readLine();
				initSegs(currnt);
				Const.segments.add(new Segment(p1, p2));
			}
			for(int i = 0; i<nbFace; i++){
				currnt = br.readLine();
				initFace(currnt);
				Const.faces.add(new Face(s1, s2, s3));
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	//Inits
	private void initFace(String currnt) {
		String words[] = currnt.split(" ");
		s1 = Const.segments.get(Integer.parseInt(words[0])-1);
		s2 = Const.segments.get(Integer.parseInt(words[1])-1);
		s3 = Const.segments.get(Integer.parseInt(words[2])-1);
	}

	private void initSegs(String currnt) {
		String words[] = currnt.split(" ");
		p1 = Const.points.get(Integer.parseInt(words[0])-1);
		p2 = Const.points.get(Integer.parseInt(words[1])-1);
		
	}

	private void initPoints(String currnt) {
		String words[] = currnt.split(" ");
		x = Double.parseDouble(words[0]);
		y = Double.parseDouble(words[1]);
		z = Double.parseDouble(words[2]);
	}

	private void initNbs(String sta) {
		String words[] = sta.split(" ");
		nbPoint = Integer.parseInt(words[0]);
		nbSeg = Integer.parseInt(words[1]);
		nbFace = Integer.parseInt(words[2]);
	}

	private void clearLists() {
		Const.faces.clear();
		Const.points.clear();
		Const.segments.clear();
		
	}
}
