package Aves;

public class Albatros extends Aves {

	private static int peso;
	private static int masaMuscular;
	
	public Albatros(){
		Albatros.setMasaMuscular(600);
		Albatros.setPeso(4000);
	}
	
	@Override
	public double getFuerza() {
		if(Albatros.getPeso() < 6000 ){
			return Albatros.getMasaMuscular();
		}else{
			return Albatros.getPeso() / 2;
		}
		
	}

	@Override
	public void recibirUnDisgusto() {
		Albatros.setPeso(Albatros.getPeso() + 800);
		
	}

	public static int getPeso() {
		return peso;
	}

	public static void setPeso(int peso) {
		Albatros.peso = peso;
	}

	public static int getMasaMuscular() {
		return masaMuscular;
	}

	public static void setMasaMuscular(int masaMuscular) {
		Albatros.masaMuscular = masaMuscular;
	}

	public void irAlGimnasio(){
		Albatros.setPeso(Albatros.getPeso() + 500);
		Albatros.setMasaMuscular(getMasaMuscular() + 500);
	}

	@Override
	public void relajar() {
		// TODO Apéndice de método generado automáticamente
		Albatros.setPeso(Albatros.getPeso() - 300);
	}

	@Override
	public boolean estaConforme(Isla islaDondeEsta) {
		// TODO Apéndice de método generado automáticamente
		return islaDondeEsta.getAvesEnLaIsla().size() - islaDondeEsta.avesDebiles().size() <= 2 ;
	}

	@Override
	public void alimentarse() {
		Maiz.setCantidad(Maiz.getCantidad()-4);
		this.setPeso(this.getPeso() + 700);
		this.setMasaMuscular(this.getMasaMuscular() + 700);
		
	}
}
