package Aves;

import java.util.ArrayList;

public class Isla {

	private ArrayList<Aves> avesEnLaIsla;

	private Alimento maiz;
	private Alimento alpiste;
	
	
	public Isla() {
		
		setMaiz(new Maiz());
		setAlpiste(new Alpiste());
		avesEnLaIsla = new ArrayList<Aves>();
	}

	public void agregarAve(Aves aveNueva) {
		avesEnLaIsla.add(aveNueva);
	}

	public ArrayList<Aves> avesDebiles(){
		ArrayList<Aves> aux = new ArrayList<Aves>();
		for (Aves iter : avesEnLaIsla) {
			if(iter.getFuerza() < 1000){
				aux.add(iter);
			}
		}
		
		return aux;
	}
	
	
	public double fuerzaTotal() {
		double fuerza = 0;
		for (Aves iter : avesEnLaIsla) {
			fuerza += iter.getFuerza();
		}
		return fuerza;
	}

	public boolean esRobusta() {
		boolean hayUnaDebil = true;

		for (Aves iter : avesEnLaIsla) {
			if (iter.getFuerza() < 300) {
				hayUnaDebil = false;
			}
		}

		return hayUnaDebil;
	}

	public void terremoto() {
		for (Aves iter : avesEnLaIsla) {
			iter.recibirUnDisgusto();
		}
	}

	public void tormenta(){
		ArrayList<Aves> aux = this.avesDebiles();
		for(Aves iter1 : aux){
			for(Aves iter2 : avesEnLaIsla){
				if(iter1.equals(iter2)){
					iter2.recibirUnDisgusto();
				}
			}
		}
		
	}

	public ArrayList<Aves> getAvesEnLaIsla() {
		return avesEnLaIsla;
	}
	
	public Aves aveCapitana(){
		Aves aveCapitana = null;
		for(Aves iter : avesEnLaIsla){
			if( 1000 < iter.getFuerza()  && iter.getFuerza() < 3000 ){
				aveCapitana = iter;
			}
		}
		return aveCapitana;
	}

	public void sesionDeRelax(){
		for(Aves iter : avesEnLaIsla){
			iter.relajar();
		}
	}
	
	public boolean hayPaz(){
		boolean estanLasAvesEnPaz= true;
		for(Aves iter : avesEnLaIsla){
			if(iter.estaConforme(this) == false){
				estanLasAvesEnPaz = false;
			}
		}
		return estanLasAvesEnPaz;
	}

	public Alimento getMaiz() {
		return maiz;
	}

	public void setMaiz(Maiz maiz) {
		this.maiz = maiz;
	}

	public Alimento getAlpiste() {
		return alpiste;
	}

	public void setAlpiste(Alpiste alpiste) {
		this.alpiste = alpiste;
	}

	public void alimentacion(){
		for(Aves iter : avesEnLaIsla){
			iter.alimentarse();
		}
	}

}
