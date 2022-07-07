package com.generation.cartaalta.model;

import java.util.ArrayList;
import java.util.List;

public class Carta {

	private valore valCarta;
	private seme semeCarta;
	
	public enum seme{		
		CUORI("cuori"),
		QUADRI("quadri"),
		FIORI("fiori"), 
		PICCHE("picche");

		String seme;

		seme(String seme) {
			this.seme=seme;
		}
	}

	public enum valore{
		UNO(1),
		DUE(2),
		TRE(3),
		QUATTRO(4),
		CINQUE(5),
		SEI(6),
		SETTE(7),
		OTTO(8),
		NOVE(9),
		DIECI(10);

		int val;

		valore(int val){
			this.val=val;
		}
		
	}
	
	public Carta(valore valore, seme seme) {
		
		this.valCarta=valore;
		this.semeCarta=seme;
	}
	
	
	public String toString() {
		return valCarta+" di "+semeCarta;
	}
	
	public static List getListValue() {
		List list = new ArrayList();
		for(valore val : valore.values()) {
			list.add(val);
		}
		return list;
	}
	
	public int getCartaValue() {
		return this.valCarta.val;
	}
	
	public int getCartaSeme() {
		
		return this.semeCarta.ordinal();
	}


	
}
