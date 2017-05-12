package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Logica.CalcularLetra;



public class Tests {
	CalcularLetra cl = new CalcularLetra(null);
	
	
	
	
	@Test
	public void testCalculaLetra() {
	    char res = cl.devolverLetra("71230270");
	    System.out.println(res);
	    char resCorrecto = 'Y';
	    assertEquals(res,resCorrecto);	    
	  }

}
