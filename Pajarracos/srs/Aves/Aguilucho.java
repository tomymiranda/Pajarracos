package Aves;

public class Aguilucho extends Aves {

	private static int velocidad;
	
	public Aguilucho(){
			Aguilucho.setVelocidad(20);
	}
	
	@Override
	public double getFuerza() {
		if(Aguilucho.getVelocidad() <= 60){
			return 180;
		}else{
			return Aguilucho.getVelocidad() * 3;
		}
		
	}

	@Override
	public void recibirUnDisgusto() {
		Aguilucho.setVelocidad(getVelocidad() * 2);
		
	}

	public static int getVelocidad() {
		return velocidad;
	}

	public static void setVelocidad(int velocidad) {
		Aguilucho.velocidad = velocidad;
	}

	@Override
	public void relajar() {
		// TODO Apéndice de método generado automáticamente
	Aguilucho.setVelocidad(Aguilucho.getVelocidad() - 10);	
	}

	@Override
	public boolean estaConforme(Isla islaDondeEsta) {
		// TODO Apéndice de método generado automáticamente
		return islaDondeEsta.getAlpiste().getCantidad() <= 8 ;
	}

	@Override
	public void alimentarse() {
		Alpiste.setCantidad(Alpiste.getCantidad()-3);
		this.setVelocidad(this.getVelocidad() + 15);
		
	}

}
