package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import entity.Point;

public class TesteEntity {
	
	@Test
	public void TestBaryCenter() {
		Point p = new Point(12,4,28);
		Point x = new Point(6,7,9);
		double b = p.scalarProduct(x);
		assertEquals(b,-40,1);
		
	}

}
