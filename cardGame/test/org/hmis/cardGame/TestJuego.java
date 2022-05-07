package org.hmis.cardGame;

import static org.junit.Assert.assertTrue;


import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import org.junit.Test;

import static org.junit.Assert.*;




public class TestJuego {

	 @Rule
	  public final TextFromStandardInputStream systemInMock = TextFromStandardInputStream.emptyStandardInputStream();
	 
	 @Rule
		public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Test
	public void apuestaCeroCerrar() {
		Juego juego = new Juego();
		juego.main(null);
		systemInMock.provideLines("0");		
		assertTrue(systemOutRule.getLog().contains("Has salido del juego"));
		
	}

}
