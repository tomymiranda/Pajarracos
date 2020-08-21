package Aves;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class AvesTests {

	@Test
	public void laFuerzaDelAguiluchoDebeSer580LaDelAlbatros1100YPaloma700(){
		AguiluchoColorado aguiluchoColo = new AguiluchoColorado();
		Albatros albatro = new Albatros();
		PalomaTorcaza paloma = new PalomaTorcaza();
		Isla cancun = new Isla();
		albatro.irAlGimnasio();
		
		
		cancun.agregarAve(aguiluchoColo);
		cancun.agregarAve(albatro);
		cancun.agregarAve(paloma);
		
		
		double fuerzaAguiluchoColo = aguiluchoColo.getFuerza();
		double fuerzaAlbatro = albatro.getFuerza();
		double fuerzaPaloma = paloma.getFuerza();
		
		Assert.assertEquals(580, fuerzaAguiluchoColo,0.001);
		Assert.assertEquals(1100,fuerzaAlbatro,0.001);
		Assert.assertEquals(700,fuerzaPaloma,0.001);
	
	}

	@Test
	public void elPesoDeAlbatroEs4500(){
		AguiluchoColorado aguiluchoColo = new AguiluchoColorado();
		Albatros albatro = new Albatros();
		PalomaTorcaza paloma = new PalomaTorcaza();
		Isla cancun = new Isla();
		albatro.irAlGimnasio();
		
		
		cancun.agregarAve(aguiluchoColo);
		cancun.agregarAve(albatro);
		cancun.agregarAve(paloma);
	
	
		int pesoDelAlbatro = albatro.getPeso();
		Assert.assertEquals(4500,pesoDelAlbatro,0.001);
	
	}
	
	@Test
	public void laFuerzaTotalDeLaIslaEs2380(){
		AguiluchoColorado aguiluchoColo = new AguiluchoColorado();
		Albatros albatro = new Albatros();
		PalomaTorcaza paloma = new PalomaTorcaza();
		Isla cancun = new Isla();
		albatro.irAlGimnasio();
		
		
		cancun.agregarAve(aguiluchoColo);
		cancun.agregarAve(albatro);
		cancun.agregarAve(paloma);
	
	
		double fuerzaDeLaIsla = cancun.fuerzaTotal();
		Assert.assertEquals(2380,fuerzaDeLaIsla,0.001);
	}
	
	@Test
	public void lasAvesDebilesSonAguiluchoYPaloma(){
		AguiluchoColorado aguiluchoColo = new AguiluchoColorado();
		Albatros albatro = new Albatros();
		PalomaTorcaza paloma = new PalomaTorcaza();
		Isla cancun = new Isla();
		albatro.irAlGimnasio();
		
		
		cancun.agregarAve(aguiluchoColo);
		cancun.agregarAve(albatro);
		cancun.agregarAve(paloma);
		
		ArrayList<Aves> avesDebiles = new ArrayList<Aves>();
		avesDebiles.add(aguiluchoColo);
		avesDebiles.add(paloma);
		
		Assert.assertTrue(avesDebiles.equals(cancun.avesDebiles()));
	}
	
	@Test
	public void laVelocidadDelAguiluchoDebeAumentarA40ElPesoDelAlbatroEs5300YLaIraDeLaPalomaEs500(){
		AguiluchoColorado aguiluchoColo = new AguiluchoColorado();
		Albatros albatro = new Albatros();
		PalomaTorcaza paloma = new PalomaTorcaza();
		Isla cancun = new Isla();
		albatro.irAlGimnasio();
		
		
		cancun.agregarAve(aguiluchoColo);
		cancun.agregarAve(albatro);
		cancun.agregarAve(paloma);
		cancun.terremoto();
	
		AguiluchoColorado aguiluchoColoMejorado = (AguiluchoColorado) cancun.getAvesEnLaIsla().get(0);
		Albatros AlbatroMejorado = (Albatros) cancun.getAvesEnLaIsla().get(1);
		PalomaTorcaza palomaMejorada = (PalomaTorcaza) cancun.getAvesEnLaIsla().get(2);
		
		int nuevaVelocidad = aguiluchoColoMejorado.getVelocidad();
		int nuevoPeso = AlbatroMejorado.getPeso();
		int nuevaIra = palomaMejorada.getIra();
		
		Assert.assertEquals(40, nuevaVelocidad,0.001);
		Assert.assertEquals(5300, nuevoPeso,0.001);
		Assert.assertEquals(500, nuevaIra,0.001);
	}

	@Test
	public void laUnicaAveDebilEsAguilucho(){
		AguiluchoColorado aguiluchoColo = new AguiluchoColorado();
		Albatros albatro = new Albatros();
		PalomaTorcaza paloma = new PalomaTorcaza();
		Isla cancun = new Isla();
		albatro.irAlGimnasio();
		
		
		cancun.agregarAve(aguiluchoColo);
		cancun.agregarAve(albatro);
		cancun.agregarAve(paloma);
		cancun.terremoto();
		
		ArrayList<Aves> avesDebiles = new ArrayList<Aves>();
		AguiluchoColorado aguiluchoColoMejorado = (AguiluchoColorado) cancun.getAvesEnLaIsla().get(0);
		avesDebiles.add(aguiluchoColoMejorado);
	
		Assert.assertTrue(avesDebiles.equals(cancun.avesDebiles()));
	}
	
	@Test
	public void cambiosEnElAguiLuchoDespuesDeUnaTormentaYAlbartoYPalomaSiguenIgual(){
		AguiluchoColorado aguiluchoColo = new AguiluchoColorado();
		Albatros albatro = new Albatros();
		PalomaTorcaza paloma = new PalomaTorcaza();
		Isla cancun = new Isla();
		albatro.irAlGimnasio();
		
		
		cancun.agregarAve(aguiluchoColo);
		cancun.agregarAve(albatro);
		cancun.agregarAve(paloma);
		cancun.terremoto();
		cancun.tormenta();
		
		
		
		AguiluchoColorado aguiluchoPostTormenta = (AguiluchoColorado) cancun.getAvesEnLaIsla().get(0);
		int velocidadPostTormenta = aguiluchoPostTormenta.getVelocidad();
		double fuerzaPostTormenta = aguiluchoPostTormenta.getFuerza();
	
		
		Albatros AlbatroPostTormenta = (Albatros) cancun.getAvesEnLaIsla().get(1);
		PalomaTorcaza palomaPostTormenta = (PalomaTorcaza) cancun.getAvesEnLaIsla().get(2);
		
		int nuevoPeso = AlbatroPostTormenta.getPeso();
		int nuevaIra = palomaPostTormenta.getIra();
		
		Assert.assertEquals(80,velocidadPostTormenta,0.001);
		Assert.assertEquals(640, fuerzaPostTormenta,0.001);
		Assert.assertEquals(5300, nuevoPeso,0.001);
		Assert.assertEquals(500, nuevaIra,0.001);
	
	}

}
