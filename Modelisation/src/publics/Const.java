package publics;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;

import entity.Face;
import entity.Point;
import entity.Segment;

public class Const {
	public static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public static ArrayList<Face> faces = new ArrayList<>();
	public static ArrayList<Point> points = new ArrayList<>();
	public static ArrayList<Segment> segments = new ArrayList<>();
}
