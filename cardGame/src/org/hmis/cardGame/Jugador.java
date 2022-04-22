package org.hmis.cardGame;

public class Jugador {

	private int cantidad;
	private Card carta;
	
	public Jugador() {
		cantidad = 10;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Card getCarta() {
		return carta;
	}

	public void setCarta(Card carta) {
		this.carta = carta;
	}

	
	
}
