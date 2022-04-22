package org.hmis.cardGame;

import java.util.Scanner;

public class Juego {

	private Deck baraja = new Deck();
	
	public Juego() {
		Jugador jugador = new Jugador();
		Jugador banca = new Jugador();
		Scanner scaner = new Scanner(System.in);
		while(scaner.nextInt() == 0 || jugador.getCantidad() == 0) {
			baraja.shuffle();
			System.out.print("Inserte la apuesta a jugar:");
			int apuesta = scaner.nextInt();
			jugador.setCarta(baraja.dealCard());
		}
	}
	
}
