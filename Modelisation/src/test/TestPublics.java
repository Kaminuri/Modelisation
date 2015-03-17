package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import publics.Coordonnees;

public class TestPublics {
	
	Coordonnees c = new Coordonnees(5,5,5);
	
	@Test
	public void testAjouterX() {
		Coordonnees x = new Coordonnees(7,7,7);
		c.ajouter(x);
		Coordonnees v = new Coordonnees(12,12,12);
		assertEquals(v.getX(),c.getX(),1);
	}
	
	@Test
	public void testAjouterY() {
		Coordonnees x = new Coordonnees(7,7,7);
		c.ajouter(x);
		Coordonnees v = new Coordonnees(12,12,12);
		assertEquals(v.getY(),c.getY(),1);
	}
	
	@Test
	public void testAjouterZ() {
		Coordonnees x = new Coordonnees(7,7,7);
		c.ajouter(x);
		Coordonnees v = new Coordonnees(12,12,12);
		assertEquals(v.getZ(),c.getZ(),1);
	}
	
	@Test
	public void testEqualsP() {
		Coordonnees x = new Coordonnees(5,5,5);
		boolean b = c.equals(x);
		assertEquals(b,true);
	}
	
	@Test
	public void testEqualsN() {
		Coordonnees x = new Coordonnees(8,8,8);
		boolean b = c.equals(x);
		assertEquals(b,false);
	}
	
}
