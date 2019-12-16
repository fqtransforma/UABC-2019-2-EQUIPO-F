/*
* LITTLE CLEANER 1.0
* APLICACIÓN DE ESCRITORIO EN JAVA: VIDEOJUEGO INTERACTIVO CON TEMÁTICA EDUCATIVA
* AUTORES: CASTAÑON PUGA MANUEL, MONTOYA VALDIVIA OMAR ANTONIO, LÓPEZ MORENO NEREO CESAR
* CORREO ELECTRONICO : {puga, montoya.omar, nereo.lopez}@uabc.edu.mx
* UNIVERSIDAD AUTÓNOMA DE BAJA CALIFORNIA
* http://www.uabc.mx
*/

package tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import logic.entity.Player;
import logic.graphicsTools.Assets;
import logic.inputDevices.KeyManager;
import logic.launcher.Game;
import logic.launcher.Handler;

class AssetsTest {

	
	
	@Test
	void testPlayerLife() {

		int value = Player.getLife();
		int expected = 1000;

		Assert.assertEquals(expected, value);

	}

	@Test
	void testPlayerImage() {

		Assert.assertNull(Assets.spydi);

	}

	@Test
	void testPoints() {


		Player.setPoints(0);
		
		Assert.assertEquals(Player.getPoints(), 0);

	}
	
	@Test 
	void testPlayerPoints() {
		
		int expected = 345, actual;
		
		Player.setPoints(345);
		actual = Player.getPoints();
		
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	void testKeyManager() {
		
		KeyManager k = new KeyManager();
		
		k.up = true;
		
		Assert.assertEquals(k.up, true);
		
		
	}
	
	@Test
	void testIcon() {
		
		Assert.assertNotNull(Assets.icon);
		
		
	}
	
	@Test 
	void testPlayerSpeed()
	{
		Game g = new Game("test", 100, 100);
		Handler handler = new Handler(g);
		
		Player p = new Player(handler, 1,1,1,1);
		
		
		Assert.assertEquals(p.getSpeed(), 3);
		
	}
	
	
	
}
