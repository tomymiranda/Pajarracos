package Aves;

public class Nido {

	private static int grosor;
	private static int resistenciaMaterial;
	public static int getGrosor() {
		return grosor;
	}
	
	public Nido(){
		Nido.setGrosor(5);
		Nido.setResistenciaMaterial(3);
	}
	
	public static void setGrosor(int grosor) {
		Nido.grosor = grosor;
	}
	public static int getResistenciaMaterial() {
		return resistenciaMaterial;
	}
	public static void setResistenciaMaterial(int resistenciaMaterial) {
		Nido.resistenciaMaterial = resistenciaMaterial;
	}
	
	public int potencia(){
		return Nido. getResistenciaMaterial() * Nido.getResistenciaMaterial();
	}
	
}
