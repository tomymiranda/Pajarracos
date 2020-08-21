package Aves;

public class PalomaMontera extends Palomas{

	private static int topeDeFuerza;

	public PalomaMontera(){
		PalomaMontera.setTopeDeFuerza(2000);
	}
	
	public static int getTopeDeFuerza() {
		return topeDeFuerza;
	}

	public static void setTopeDeFuerza(int topeDeFuerza) {
		PalomaMontera.topeDeFuerza = topeDeFuerza;
	}

	public double getFuerza(){
		if(super.getFuerza() <= PalomaMontera.getTopeDeFuerza()){
			return super.getFuerza();
		}
		return PalomaMontera.getTopeDeFuerza() ;
	}

}
