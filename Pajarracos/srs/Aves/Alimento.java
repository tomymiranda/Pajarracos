package Aves;

public abstract class Alimento {

	private static int cantidad;
	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Alimento.cantidad = cantidad;
	}
}
