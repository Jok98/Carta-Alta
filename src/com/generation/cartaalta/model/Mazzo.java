package com.generation.cartaalta.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.generation.cartaalta.model.Carta.seme;
import com.generation.cartaalta.model.Carta.valore;

public class Mazzo {

	private ArrayList<Carta> mazzoTotale = new ArrayList<Carta>();
	private ArrayList<seme> semi = new ArrayList<seme>(List.of(seme.CUORI, seme.QUADRI, seme.FIORI, seme.PICCHE));
	private List listaValori = Carta.getListValue();
	private ArrayList<valore> mazzoCuori = new ArrayList<valore>(listaValori);
	private ArrayList<valore> mazzoQuadri = new ArrayList<valore>(listaValori);
	private ArrayList<valore> mazzoFiori = new ArrayList<valore>(listaValori);
	private ArrayList<valore> mazzoPicche = new ArrayList<valore>(listaValori);
	private Random r=new Random();
	private Carta carta;
	
	public ArrayList<Carta> generateDeck() {
		
		for(int i =0; i<40;i++) {
		
		valore valCarta ;
		seme semeCarta;
      	
      	int randomSeme=r.nextInt(semi.size());
      	semeCarta=semi.get(randomSeme);
      	//System.out.println("seme carta "+semeCarta);
      	
      	
      	
      	switch(semeCarta) {
      	
      	case CUORI:
      		if(mazzoCuori.size()==0) { 
      			semi.remove(randomSeme);
      			i--;
      			}else {
      				int randomVal= r.nextInt(mazzoCuori.size());
      				valCarta = mazzoCuori.get(randomVal);
      				carta=new Carta(valCarta, seme.CUORI);
      				mazzoTotale.add(carta);
      				mazzoCuori.remove(randomVal);
      			}
      		break;
      		
      	case QUADRI:
      		if(mazzoQuadri.size()==0) { 
      			semi.remove(randomSeme);
      			i--;
      			}else {
      				int randomVal= r.nextInt(mazzoQuadri.size());
      				valCarta = mazzoQuadri.get(randomVal);
      				carta=new Carta(valCarta, seme.QUADRI);
      				mazzoTotale.add(carta);
      				mazzoQuadri.remove(randomVal);
      			}
      		break;
      		
      	case FIORI:
      		if(mazzoFiori.size()==0) { 
      			semi.remove(randomSeme);
      			i--;
      			}else {
      				int randomVal= r.nextInt(mazzoFiori.size());
      				valCarta = mazzoFiori.get(randomVal);
      				carta=new Carta(valCarta, seme.FIORI);
      				mazzoTotale.add(carta);
      				mazzoFiori.remove(randomVal);
      			}
      		break;
      		
      	case PICCHE:
      		if(mazzoPicche.size()==0) { 
      			semi.remove(randomSeme);
      			i--;
      			}else {
      				int randomVal= r.nextInt(mazzoPicche.size());
      				valCarta = mazzoPicche.get(randomVal);
      				carta=new Carta(valCarta, seme.PICCHE);
      				mazzoTotale.add(carta);
      				mazzoPicche.remove(randomVal);
      			}
      		break;
  	
      	}
      	
		
		}
//		System.out.println("mazzo picche = "+mazzoCuori);
//		System.out.println("mazzo quadri = "+mazzoQuadri);
//		System.out.println("mazzo fiori = "+mazzoFiori);
//		System.out.println("mazzo picche = "+mazzoPicche);
//		
//		System.out.println("  numero carte mazzo totale : \r"+mazzoTotale.size());
//		System.out.println("  ordine carte nel mazzo : \r"+mazzoTotale);
		
		return mazzoTotale;
	}
	

}
