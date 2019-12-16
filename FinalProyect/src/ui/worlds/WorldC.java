/*
* LITTLE CLEANER 1.0
* APLICACIÓN DE ESCRITORIO EN JAVA: VIDEOJUEGO INTERACTIVO CON TEMÁTICA EDUCATIVA
* AUTORES: CASTAÑON PUGA MANUEL, MONTOYA VALDIVIA OMAR ANTONIO, LÓPEZ MORENO NEREO CESAR
* CORREO ELECTRONICO : {puga, montoya.omar, nereo.lopez}@uabc.edu.mx
* UNIVERSIDAD AUTÓNOMA DE BAJA CALIFORNIA
* http://www.uabc.mx
*/

package ui.worlds;

import logic.entity.cans.BlackBin;
import logic.entity.cans.GreenBin;
import logic.entity.cans.blueBin;
import logic.entity.cans.brownBin;
import logic.entity.cans.yellowBin;
import logic.entity.dynamicEntities.PinchDown;
import logic.entity.dynamicEntities.PinchRightLeft;
import logic.entity.dynamicEntities.RockPinch;
import logic.graphicsTools.Assets;
import logic.launcher.Handler;
import logic.residues.Aluminium;
import logic.residues.Can;
import logic.residues.Detergent;
import logic.residues.Door;
import logic.residues.FoodBag;
import logic.residues.Glass;
import logic.residues.LargeBottle;
import logic.residues.NextDoor3to4;
import logic.residues.Paper;
import logic.residues.PaperBoard;
import logic.residues.PizzaBox;
import logic.residues.banana;
import logic.residues.bottle;

public class WorldC {

	public static World subWorld_A, subWorld_B, subWorld_C, subWorld_D;

	public static void init(Handler handler) {

		subWorld_A = new World(handler, ".\\src\\data\\Textures\\world3a.txt", 4, 4);
		subWorld_B = new World(handler, ".\\src\\data\\Textures\\world3b.txt", 10, 10);
		subWorld_C = new World(handler, ".\\src\\data\\Textures\\world3c.txt", 30, 30);
		subWorld_D = new World(handler, ".\\src\\data\\Textures\\world3d.txt", 400, 400);

		initSubWorldA(handler);

	}

	public static void initSubWorldA(Handler handler) {

		//***PRIMER MAPA***//
		
		// Botes de basura
		subWorld_A.entityManager.addEntity(new blueBin(handler, 32, 430, 32, 48));
		subWorld_A.entityManager.addEntity(new brownBin(handler, 64, 430, 32, 48));
		subWorld_A.entityManager.addEntity(new yellowBin(handler, 96, 430, 32, 48));
		subWorld_A.entityManager.addEntity(new GreenBin(handler, 160, 430, 32, 48));
		subWorld_A.entityManager.addEntity(new BlackBin(handler, 192, 430, 32, 48));

		// Decoracion
		subWorld_A.entityManager.addEntity(new Door(handler, 896, -16, 64, 64, 13));

		// Residuos
		subWorld_A.entityManager.addEntity(new banana(handler, 100, 100, 16, 32));
		subWorld_A.entityManager.addEntity(new bottle(handler, 100, 150, 16, 32));
		subWorld_A.entityManager.addEntity(new PaperBoard(handler, 200, 150, 16, 32));
		subWorld_A.entityManager.addEntity(new Glass(handler, 300, 300, 16, 32));
		subWorld_A.entityManager.addEntity(new Aluminium(handler, 300, 400, 16, 32));
		subWorld_A.entityManager.addEntity(new Paper(handler, 400, 500, 32, 16));
		subWorld_A.entityManager.addEntity(new Can(handler, 600, 300, 32, 32));
		subWorld_A.entityManager.addEntity(new PizzaBox(handler, 800, 450, 32, 32));
		subWorld_A.entityManager.addEntity(new Detergent(handler, 900, 500, 32, 32));
		subWorld_A.entityManager.addEntity(new FoodBag(handler, 900, 250, 32, 32));
		subWorld_A.entityManager.addEntity(new LargeBottle(handler, 700, 500, 16, 32));
		
		

		// Obstaculos
		subWorld_A.entityManager.addEntity(new RockPinch(handler, 300, 300, 32, 32, 0.07f, 100));
		subWorld_A.entityManager.addEntity(new RockPinch(handler, 500, 500, 32, 32, -0.07f, 100));
		subWorld_A.entityManager.addEntity(new RockPinch(handler, 600, 400, 32, 32, 0.07f, 100));
		subWorld_A.entityManager.addEntity(new PinchDown(handler, 300, 300, 32, 32, 0, 600, 5));
		subWorld_A.entityManager.addEntity(new PinchRightLeft(handler, 300, 300, 32, 32, 0, 1024, 5));
		subWorld_A.entityManager.addEntity(new PinchRightLeft(handler, 100, 100, 32, 32, 0, 1024, 5));
		subWorld_A.entityManager.addEntity(new RockPinch(handler, 800, 300, 32, 32, -0.07f, 100));
		
		//***SEGUNDO MAPA***//
		
		// Botes de basura
		subWorld_B.entityManager.addEntity(new blueBin(handler, 350, 150, 32, 48));
		subWorld_B.entityManager.addEntity(new brownBin(handler, 950, 220, 32, 48));
		subWorld_B.entityManager.addEntity(new yellowBin(handler, 100, 400, 32, 48));
		
		subWorld_B.entityManager.addEntity(new GreenBin(handler, 300, 500, 32, 48));
		subWorld_B.entityManager.addEntity(new BlackBin(handler, 620, 260, 32, 48));

		// Decoracion
		//subWorld_B.entityManager.addEntity(new Door(handler, 990, 90, 32, 128));

		// Residuos
		subWorld_B.entityManager.addEntity(new banana(handler, 50, 450, 16, 32));
		subWorld_B.entityManager.addEntity(new bottle(handler, 450, 40, 16, 32));
		subWorld_B.entityManager.addEntity(new PaperBoard(handler, 60, 250, 16, 32));
		subWorld_B.entityManager.addEntity(new Glass(handler, 150, 400, 16, 32));
		subWorld_B.entityManager.addEntity(new Aluminium(handler, 600, 200, 16, 32));
		subWorld_B.entityManager.addEntity(new Paper(handler, 400, 300, 32, 16));
		subWorld_B.entityManager.addEntity(new Can(handler, 280, 420, 32, 32));
		subWorld_B.entityManager.addEntity(new PizzaBox(handler, 700, 150, 32, 32));
		subWorld_B.entityManager.addEntity(new Detergent(handler, 950, 100, 32, 32));
		subWorld_B.entityManager.addEntity(new FoodBag(handler, 500, 350, 32, 32));
		subWorld_B.entityManager.addEntity(new LargeBottle(handler, 950, 400, 16, 32));
		
		

		// Obstaculos
		subWorld_B.entityManager.addEntity(new RockPinch(handler, 900, 350, 32, 32, 0.07f, 100));
		subWorld_B.entityManager.addEntity(new RockPinch(handler, 450, 120, 32, 32, -0.07f, 100));
		subWorld_B.entityManager.addEntity(new RockPinch(handler, 300, 350, 32, 32, 0.07f, 100));
		subWorld_B.entityManager.addEntity(new PinchDown(handler, 500, 150, 32, 32, 0, 600, 8));
		subWorld_B.entityManager.addEntity(new PinchRightLeft(handler, 200, 350, 32, 32, 0, 1024, 5));
		subWorld_B.entityManager.addEntity(new PinchRightLeft(handler, 600, 900, 32, 32, 0, 1024, 5));
		subWorld_B.entityManager.addEntity(new RockPinch(handler, 500, 400, 32, 32, -0.07f, 100));
		
		subWorld_B.entityManager.addEntity(new Door(handler, 990, 85, 32, 128, 13));
		//***TERCER MAPA***//
		
		// Botes de basura
		subWorld_C.entityManager.addEntity(new blueBin(handler, 255, 75, 32, 48));
		subWorld_C.entityManager.addEntity(new brownBin(handler, 415, 75, 32, 48));
		subWorld_C.entityManager.addEntity(new yellowBin(handler, 545, 75, 32, 48));
		
		subWorld_C.entityManager.addEntity(new GreenBin(handler, 735, 235, 32, 48));
		subWorld_C.entityManager.addEntity(new BlackBin(handler, 160, 275, 32, 48));

		// Decoracion
		subWorld_C.entityManager.addEntity(new Door(handler, 735, 550, 128, 64, 13));

		// Residuos
		subWorld_C.entityManager.addEntity(new banana(handler, 35, 120, 16, 32));
		subWorld_C.entityManager.addEntity(new bottle(handler, 450, 120, 16, 32));
		subWorld_C.entityManager.addEntity(new PaperBoard(handler, 350, 120, 16, 32));
		subWorld_C.entityManager.addEntity(new Glass(handler, 270, 200, 16, 32));
		subWorld_C.entityManager.addEntity(new Aluminium(handler, 600, 420, 16, 32));
		subWorld_C.entityManager.addEntity(new Paper(handler, 200, 300, 32, 16));
		subWorld_C.entityManager.addEntity(new Can(handler, 300, 430, 32, 32));
		subWorld_C.entityManager.addEntity(new PizzaBox(handler, 700, 150, 32, 32));
		subWorld_C.entityManager.addEntity(new Detergent(handler, 900, 120, 32, 32));
		subWorld_C.entityManager.addEntity(new FoodBag(handler, 750, 490, 32, 32));
		subWorld_C.entityManager.addEntity(new LargeBottle(handler, 900, 350, 16, 32));
		
		

		// Obstaculos
		subWorld_C.entityManager.addEntity(new RockPinch(handler, 50, 350, 32, 32, 0.07f, 100));
		subWorld_C.entityManager.addEntity(new RockPinch(handler, 300, 100, 32, 32, -0.07f, 100));
		subWorld_C.entityManager.addEntity(new RockPinch(handler, 450, 200, 32, 32, 0.07f, 100));
		subWorld_C.entityManager.addEntity(new PinchDown(handler, 850, 150, 32, 32, 0, 600, 8));
		subWorld_C.entityManager.addEntity(new PinchRightLeft(handler, 200, 250, 32, 32, 0, 1024, 5));
		subWorld_C.entityManager.addEntity(new PinchRightLeft(handler, 500, 400, 32, 32, 0, 1024, 5));
		subWorld_C.entityManager.addEntity(new RockPinch(handler, 600, 900, 32, 32, -0.07f, 100));
		
		//***CUARTO MAPA***//
		
		// Botes de basura
		subWorld_D.entityManager.addEntity(new blueBin(handler, 950, 30, 32, 48));
		subWorld_D.entityManager.addEntity(new brownBin(handler, 765, 100, 32, 48));
		subWorld_D.entityManager.addEntity(new yellowBin(handler, 650, 500, 32, 48));
		
		subWorld_D.entityManager.addEntity(new GreenBin(handler, 380, 200, 32, 48));
		subWorld_D.entityManager.addEntity(new BlackBin(handler, 150, 100, 32, 48));

		// Decoracion
		subWorld_D.entityManager.addEntity(new NextDoor3to4(handler, 0, 0, 0, 0, 14));

		// Residuos
		subWorld_D.entityManager.addEntity(new banana(handler, 100, 40, 16, 32));
		subWorld_D.entityManager.addEntity(new bottle(handler, 850, 370, 16, 32));
		subWorld_D.entityManager.addEntity(new PaperBoard(handler, 900, 250, 16, 32));
		subWorld_D.entityManager.addEntity(new Glass(handler, 200, 250, 16, 32));
		subWorld_D.entityManager.addEntity(new Aluminium(handler, 600, 50, 16, 32));
		subWorld_D.entityManager.addEntity(new Paper(handler, 280, 120, 32, 16));
		subWorld_D.entityManager.addEntity(new Can(handler, 400, 300, 32, 32));
		subWorld_D.entityManager.addEntity(new PizzaBox(handler, 850, 170, 32, 32));
		subWorld_D.entityManager.addEntity(new Detergent(handler, 700, 450, 32, 32));
		subWorld_D.entityManager.addEntity(new FoodBag(handler, 70, 400, 32, 32));
		subWorld_D.entityManager.addEntity(new LargeBottle(handler, 500, 350, 16, 32));
		
		

		// Obstaculos
		subWorld_D.entityManager.addEntity(new RockPinch(handler, 50, 350, 32, 32, 0.07f, 100));
		subWorld_D.entityManager.addEntity(new RockPinch(handler, 300, 100, 32, 32, -0.07f, 100));
		subWorld_D.entityManager.addEntity(new RockPinch(handler, 450, 200, 32, 32, 0.07f, 100));
		subWorld_D.entityManager.addEntity(new PinchDown(handler, 850, 150, 32, 32, 0, 600, 8));
		subWorld_D.entityManager.addEntity(new PinchRightLeft(handler, 200, 350, 32, 32, 0, 1024, 5));
		subWorld_D.entityManager.addEntity(new PinchRightLeft(handler, 500, 400, 32, 32, 0, 1024, 5));
		subWorld_D.entityManager.addEntity(new RockPinch(handler, 600, 900, 32, 32, -0.07f, 100));
		subWorld_D.entityManager.addEntity(new RockPinch(handler, 750, 100, 32, 32, -0.07f, 100));

	}

	public static void tick(Handler handler) {

		if (handler.getWorld().equals(subWorld_A)) {

			if (handler.getWorld().getPlayer().getY() < 0) {
				subWorld_B.player.setY(550);
				subWorld_B.player.setX(handler.getWorld().getPlayer().getX());
				handler.setWorld(subWorld_B);

			}

			if (handler.getWorld().getPlayer().getX() < 0)
				handler.getWorld().getPlayer().setX(0);

			if (handler.getWorld().getPlayer().getY() > 600 - Assets.spydiDown[0].getHeight())
				handler.getWorld().getPlayer().setY(600 - Assets.spydiDown[0].getHeight());

			if (handler.getWorld().getPlayer().getX() > 1024) {
				subWorld_D.player.setY(handler.getWorld().getPlayer().getY());
				subWorld_D.player.setX(20);
				handler.setWorld(subWorld_D);

			}

		}

		if (handler.getWorld().equals(subWorld_B)) {
			if (subWorld_B.player.getY() > 600) {

				subWorld_A.player.setY(10);
				subWorld_A.player.setX(handler.getWorld().player.getX());
				handler.setWorld(subWorld_A);
			}

			if (subWorld_B.player.getY() < 0) {
				subWorld_B.player.setY(0);
			}

			if (subWorld_B.player.getX() < 0) {
				subWorld_B.player.setX(0);
			}

			if (subWorld_B.player.getX() > 1024 - Assets.spydiDown[0].getWidth()) {

				subWorld_C.player.setY(subWorld_B.player.getY());
				subWorld_C.player.setX(10);
				handler.setWorld(subWorld_C);
			}
		}

		if (handler.getWorld().equals(subWorld_C)) {

			if (subWorld_C.player.getX() > 1024 - Assets.spydiDown[0].getWidth())
				subWorld_C.player.setX(1024 - Assets.spydiDown[0].getWidth());

			if (subWorld_C.player.getY() < 0)
				subWorld_C.player.setY(0);

			if (subWorld_C.player.getY() > 600) {

				subWorld_D.player.setY(10);
				subWorld_D.player.setX(handler.getWorld().getPlayer().getX());

				handler.setWorld(subWorld_D);

			}

			if (subWorld_C.player.getX() < 0) {

				subWorld_B.player.setX(1024 - 30);
				subWorld_B.player.setY(handler.getWorld().getPlayer().getY());
				handler.setWorld(subWorld_B);

			}

		}

		if (handler.getWorld().equals(subWorld_D)) {

			if (subWorld_D.player.getX() > 1024 - Assets.spydiDown[0].getWidth())
				subWorld_D.player.setX(1024 - Assets.spydiDown[0].getWidth());

			if (subWorld_D.player.getY() < 0) {
				subWorld_C.player.setX(handler.getWorld().getPlayer().getX());
				subWorld_C.player.setY(550);
				handler.setWorld(subWorld_C);

			}

			if (subWorld_D.player.getY() > 600 - Assets.spydiDown[0].getHeight()) {
				subWorld_D.player.setY(600 - Assets.spydiDown[0].getHeight());
			}

			if (subWorld_D.player.getX() < 0) {

				subWorld_A.player.setX(1024 - 20);
				subWorld_A.player.setY(handler.getWorld().getPlayer().getY());
				handler.setWorld(subWorld_A);

			}

		}

	}

}

