package org.hmis.cardGame;

import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
			
			Deck baraja = new Deck();
			
			Jugador jugador = new Jugador();
			Jugador banca = new Jugador();
			@SuppressWarnings("resource")
			Scanner scaner = new Scanner(System.in);
		
			System.out.println("Bienvenido a Carta más alta.");
			int apuesta;
			while(true) {
				if (jugador.getCantidad() == 0) {
					System.out.println("Has perdido. Saliendo del juego");
					break;
				}else {
				do {
				System.out.print("Inserte la apuesta a jugar:");
				
				apuesta = scaner.nextInt();
				if(baraja.cardsLeft() <= 0) {
					System.out.println("Todas las cartas utilizadas, barajando....");
					baraja.shuffle();
				}else if(apuesta < 0) {
					System.out.println("La apuesta no puede ser menor que 0");
				}else if(apuesta > jugador.getCantidad()) {
					System.out.println("La apuesta no puede ser mayor que su cantidad");
				}
				
				
				}while (apuesta > jugador.getCantidad() || apuesta < 0);
				
				if(apuesta == 0) {
					System.out.println("Has salido del juego");				
					break;
				}else {
				
				baraja.shuffle();
				jugador.setCarta(baraja.dealCard());
				System.out.println("Jugador, usted ha sacado " + jugador.getCarta().toString());
				banca.setCarta(baraja.dealCard());
				System.out.println("La banca ha sacado " + banca.getCarta().toString());
				if(jugador.getCarta().getValue() > banca.getCarta().getValue()) {
					jugador.setCantidad(jugador.getCantidad()+apuesta);
					System.out.println("Felicidades, ha ganado. Su cantidad total es " + jugador.getCantidad());				
				}else if (jugador.getCarta().getValue() < banca.getCarta().getValue()){
					jugador.setCantidad(jugador.getCantidad()-apuesta);
					System.out.println("Lo sentimos, ha perdido. Su cantidad total es " + jugador.getCantidad());	
					
				}
				}
				}
				
			}
		}


		
	}
	
	
	
