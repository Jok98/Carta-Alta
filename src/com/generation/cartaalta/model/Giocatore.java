package com.generation.cartaalta.model;

public class Giocatore  {
	
	
	private int punteggio;
	
	public Giocatore() {

		this.punteggio=0;
	}
	
	public void setPunteggio(int score) {
		
		this.punteggio+=score;
	}
	public int getPunteggio() {
		return this.punteggio;
	}

}
