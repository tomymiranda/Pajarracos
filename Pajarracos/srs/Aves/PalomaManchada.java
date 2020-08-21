package Aves;

import java.util.ArrayList;

public class PalomaManchada extends Palomas{

	private static ArrayList<Nido> conjuntoDeNidos;

	public PalomaManchada(){
		conjuntoDeNidos = new ArrayList<Nido>();
	}
	
	public ArrayList<Nido> getConjuntoDeNidos() {
		return conjuntoDeNidos;
	}

	public void setConjuntoDeNidos(ArrayList<Nido> conjuntoDeNidos) {
		this.conjuntoDeNidos = conjuntoDeNidos;
	}

	public void recibirUnDisgusto(){
		super.recibirUnDisgusto();
		conjuntoDeNidos.add(new Nido());
	}
	
	public void relajar(){
		super.relajar();
		if(this.getConjuntoDeNidos().size() > 2){
			for (Nido iter :conjuntoDeNidos){
				iter.setGrosor(iter.getGrosor() + 1);
			}
		}
	}
	
	public static int getIra(){
		int potenciaDeNidos = 0;
		for(Nido iter : conjuntoDeNidos ){
			potenciaDeNidos =+ iter.potencia();
		}
		
		return getIra() + potenciaDeNidos;
	}
	
}
