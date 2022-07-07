package com.generation.cartaalta.model;

import java.util.ArrayList;
import java.util.Random;


public class Partita {
	private static ArrayList<Carta> mazzoTotale = new ArrayList<Carta>();
	private static Mazzo mazzo = new Mazzo();
	private static Random r=new Random();
	private static Carta carta;
	

	private static int mazzoLength ;
	
	public static void main(String[]args) throws InterruptedException  {
		
		mazzoTotale = mazzo.generateDeck();
		mazzoLength=mazzoTotale.size();
		Giocatore player1 = new Giocatore();
		Giocatore player2 = new Giocatore();
		
		
		for(int i = 0;i<mazzoLength/2;i++) {
		Carta carta1 = getCarta();
		mazzoTotale.remove(carta1);
		System.out.println("giocatore 1 ha la carta :"+carta1);
		
		Carta carta2 = getCarta();
		mazzoTotale.remove(carta2);
		System.out.println("giocatore 2 ha la carta :"+carta2);
		
		
		if(carta1.getCartaValue()==carta2.getCartaValue()) {
			
			if(carta1.getCartaSeme()>carta2.getCartaSeme()) {
				player1.setPunteggio(1);
				System.out.println("vince il turno "+i+" il giocatore 1");
				
			}else {
				System.out.println("vince il turno "+i+" il giocatore 2");
				player2.setPunteggio(1);
				
			}
			
		}else if(carta1.getCartaValue()>carta2.getCartaValue()) {
			
			System.out.println("vince il turno "+i+" il giocatore 1");
			player1.setPunteggio(1);
		}else {
			System.out.println("vince il turno "+i+" il giocatore 2");
			player2.setPunteggio(1);
			
		}
		
		System.out.println();
			
		}
		int player1Score = player1.getPunteggio();
		int player2Score = player2.getPunteggio();
		
		if(player1Score>player2.getPunteggio()) {
			System.out.println("vince la partita il giocatore 1 con "+player1Score+" punti");
		}else if(player1.getPunteggio()<player2.getPunteggio()) {
			System.out.println("vince la partita il giocatore 2 con "+player2+" punti");
		}else {
			System.out.println("La partita termina in parità con "+player1Score+" punti");
		}
		

		
	}
	
	public static Carta getCarta() throws InterruptedException {
		
		int randomCarta=r.nextInt(mazzoTotale.size());	
		carta= mazzoTotale.get(randomCarta);
		return carta;
		
	}

	
}
