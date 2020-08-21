package Aves;

public class PalomaTorcaza extends Palomas {

	private static int huevos;
	
	public PalomaTorcaza(){
		PalomaTorcaza.setHuevos(3);
	}
	
	public double getFuerza(){
		return super.getFuerza() + (PalomaTorcaza.getHuevos() * 100);
	}

	public static int getHuevos() {
		return huevos;
	}

	public static void setHuevos(int huevos) {
		PalomaTorcaza.huevos = huevos;
	}

	public void recibirUnDisgusto(){
		super.recibirUnDisgusto();
		PalomaTorcaza.setHuevos(PalomaTorcaza.getHuevos() + 1);
	}
}
