package Aves;

public class Palomas extends Aves {

	private static int ira;
	
	public Palomas(){
		Palomas.setIra(200);
	}
	
	@Override
	public double getFuerza() {
		
		return Palomas.getIra() * 2;
	}

	@Override
	public void recibirUnDisgusto() {
		Palomas.setIra(Palomas.getIra() + 300);
		
	}

	public static int getIra() {
		return ira;
	}

	public static void setIra(int ira) {
		Palomas.ira = ira;
	}

	@Override
	public void relajar() {
		// TODO Apéndice de método generado automáticamente
		Palomas.setIra(Palomas.getIra() - 50);
	}

	@Override
	public boolean estaConforme(Isla islaDondeEsta) {
		// TODO Apéndice de método generado automáticamente
		return islaDondeEsta.avesDebiles().size() <= 1;
	}

	@Override
	public void alimentarse() {
		// TODO Apéndice de método generado automáticamente
		
	}

	
	public void equilibrarse(){
		if(this.getFuerza() <= 700){
			this.recibirUnDisgusto();
		}else{
			this.relajar();
		}
		
	}
}
