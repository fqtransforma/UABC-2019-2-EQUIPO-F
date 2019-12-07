/*
* LITTLE CLEANER 1.0
* APLICACIÓN DE ESCRITORIO EN JAVA: VIDEOJUEGO INTERACTIVO CON TEMÁTICA EDUCATIVA
* AUTORES: CASTAÑON PUGA MANUEL, MONTOYA VALDIVIA OMAR ANTONIO, LÓPEZ MORENO NEREO CESAR
* CORREO ELECTRONICO : {puga, montoya.omar, nereo.lopez}@uabc.edu.mx
* UNIVERSIDAD AUTÓNOMA DE BAJA CALIFORNIA
* http://www.uabc.mx
*/

package ui.worlds;

import logic.entity.cans.*;
import logic.entity.dynamicEntities.*;
import logic.graphicsTools.Assets;
import logic.launcher.Handler;
import logic.residues.*;

public class WorldA {
	
	
	public static World subWorld_A, subWorld_B, subWorld_C, subWorld_D;

	public static void init(Handler handler) {
		
		subWorld_A = new World(handler, ".\\src\\data\\Textures\\world1a.txt", 0, 0);
		subWorld_B = new World(handler, ".\\src\\data\\Textures\\world1b.txt", 10, 10);
		subWorld_C = new World(handler, ".\\src\\data\\Textures\\world1c.txt", 30, 30);
		subWorld_D = new World(handler, ".\\src\\data\\Textures\\world1d.txt", 400, 400);

		initSubWorldA(handler);
		initsubWorldB(handler);
		initsubWorldC(handler);//inicializar mundos
		initsubWorldD(handler);//inicializar mundos
		
		
		
		
	}
	public static void initsubWorldD(Handler handler) {
		
		//botes de basura
		subWorld_D.entityManager.addEntity(new blueBin(handler, 32, 300, 32, 48));
		subWorld_D.entityManager.addEntity(new brownBin(handler, 200, 64, 32, 48));
		subWorld_D.entityManager.addEntity(new yellowBin(handler, 384, 530, 32, 48));
		subWorld_D.entityManager.addEntity(new GreenBin(handler, 950, 250, 32, 48));
		subWorld_D.entityManager.addEntity(new BlackBin(handler, 900, 64, 32, 48));
		

		
		//Residuos
		subWorld_D.entityManager.addEntity(new Apple(handler, 32, 438, 32, 32));
		subWorld_D.entityManager.addEntity(new bottle(handler, 600, 180, 16, 32));
		subWorld_D.entityManager.addEntity(new banana(handler, 239, 254, 32, 32));
		subWorld_D.entityManager.addEntity(new Carrot(handler, 900,250, 32, 32));
		subWorld_D.entityManager.addEntity(new Detergent(handler, 567, 444, 32, 32));
		subWorld_D.entityManager.addEntity(new Glass(handler, 400, 50, 16, 32));
		subWorld_D.entityManager.addEntity(new PizzaBox(handler, 900, 360, 32, 32));
		
		//obstaculos
		subWorld_D.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, -0.01f, 20));
		subWorld_D.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, -0.01f, 80));
		subWorld_D.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, -0.01f, 160));
		subWorld_D.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, -0.01f, 240));
		subWorld_D.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, -0.01f, 320));
		subWorld_D.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, -0.01f, 80, 1.57f));
		subWorld_D.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, -0.01f, 160, 1.57f));
		subWorld_D.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, -0.01f, 240, 1.57f));
		subWorld_D.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, -0.01f, 320, 1.57f));	
		subWorld_D.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, -0.01f, 80, 3.14f));
		subWorld_D.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, -0.01f, 160, 3.14f));
		subWorld_D.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, -0.01f, 240, 3.14f));
		subWorld_D.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, -0.01f, 320, 3.14f));
		subWorld_D.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, -0.01f, 80, 4.71f));
		subWorld_D.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, -0.01f, 160, 4.71f));
		subWorld_D.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, -0.01f, 240, 4.71f));
		subWorld_D.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, -0.01f, 320, 4.71f));
		
		//cambiador
		
		subWorld_D.entityManager.addEntity(new NextDoor1to2(handler, 0, 0, 0, 0, 23));
		
		
	}
	
	public static void initsubWorldC(Handler handler) {
		
		//botes de basura
		subWorld_C.entityManager.addEntity(new blueBin(handler, 32, 128, 32, 48));
		subWorld_C.entityManager.addEntity(new brownBin(handler, 200, 64, 32, 48));
		subWorld_C.entityManager.addEntity(new yellowBin(handler, 384, 530, 32, 48));
		
		subWorld_C.entityManager.addEntity(new GreenBin(handler, 800, 100, 32, 48));
		subWorld_C.entityManager.addEntity(new BlackBin(handler, 900, 64, 32, 48));
		
		//residuos
		subWorld_C.entityManager.addEntity(new Apple(handler, 64, 300, 32, 32));
		subWorld_C.entityManager.addEntity(new Aluminium(handler, 200, 150, 16, 32));
		subWorld_C.entityManager.addEntity(new FoodBag(handler, 200, 300, 32, 32));
		subWorld_C.entityManager.addEntity(new banana(handler, 400, 300, 32, 32));	
		subWorld_C.entityManager.addEntity(new LargeBottle(handler, 620, 400, 16, 32));
		subWorld_C.entityManager.addEntity(new Paper(handler, 620, 450, 32, 32));
		subWorld_C.entityManager.addEntity(new Glass(handler, 900, 450, 16, 32));
		
		//Obstaculos
		
		subWorld_C.entityManager.addEntity(new PinchRightLeft(handler, 900, 64, 32, 32, 0, 1024, 2));
		subWorld_C.entityManager.addEntity(new PinchRightLeft(handler, 800, 128, 32, 32, 0, 1024, 2));
		subWorld_C.entityManager.addEntity(new PinchRightLeft(handler, 700, 200, 32, 32, 0, 1024, 2));
		subWorld_C.entityManager.addEntity(new PinchRightLeft(handler, 600, 300, 32, 32, 0, 1024, 2));
		subWorld_C.entityManager.addEntity(new PinchRightLeft(handler, 500, 400, 32, 32, 0, 1024, 2));
		subWorld_C.entityManager.addEntity(new PinchRightLeft(handler, 400, 500, 32, 32, 0, 1024, 2));
		subWorld_C.entityManager.addEntity(new PinchRightLeft(handler, 300, 550, 32, 32, 0, 1024, 2));
		
		//puerta
		subWorld_C.entityManager.addEntity(new Door(handler, 900, 560, 64, 64, 13));
		
		
		
	}
	
	public static void initsubWorldB(Handler handler) {
		//Botes de basura
		

		
		subWorld_B.entityManager.addEntity(new blueBin(handler, 320, 530, 32, 48));
		subWorld_B.entityManager.addEntity(new brownBin(handler, 352, 530, 32, 48));
		subWorld_B.entityManager.addEntity(new yellowBin(handler, 384, 530, 32, 48));

		subWorld_B.entityManager.addEntity(new GreenBin(handler, 448, 530, 32, 48));
		subWorld_B.entityManager.addEntity(new BlackBin(handler, 480, 530, 32, 48));
		
		//Decoracion
		subWorld_B.entityManager.addEntity(new Door(handler, 990, 32, 32, 128, 23));
		
		
		
		//residuos
		subWorld_B.entityManager.addEntity(new Apple(handler, 600, 540, 32, 32));
		subWorld_B.entityManager.addEntity(new bottle(handler, 600, 224, 16, 32));
		subWorld_B.entityManager.addEntity(new banana(handler, 192, 128, 16, 32));
		subWorld_B.entityManager.addEntity(new Paper(handler, 192, 320, 32, 32));
		subWorld_B.entityManager.addEntity(new PaperBoard(handler, 320, 320, 32, 32));
		subWorld_B.entityManager.addEntity(new Carrot(handler, 320, 32, 32, 32));
		subWorld_B.entityManager.addEntity(new Glass(handler, 256, 224, 16, 32));
		subWorld_B.entityManager.addEntity(new PizzaBox(handler, 832, 288, 32, 32));
		
		
		//Obstaculos
		subWorld_B.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, 0.01f, 20));
		subWorld_B.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, 0.01f, 80));
		subWorld_B.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, 0.01f, 160));
		subWorld_B.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, 0.01f, 240));
		subWorld_B.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, 0.01f, 320));
		subWorld_B.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, 0.01f, 80, 1.57f));
		subWorld_B.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, 0.01f, 160, 1.57f));
		subWorld_B.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, 0.01f, 240, 1.57f));
		subWorld_B.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, 0.01f, 320, 1.57f));	
		subWorld_B.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, 0.01f, 80, 3.14f));
		subWorld_B.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, 0.01f, 160, 3.14f));
		subWorld_B.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, 0.01f, 240, 3.14f));
		subWorld_B.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, 0.01f, 320, 3.14f));
		subWorld_B.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, 0.01f, 80, 4.71f));
		subWorld_B.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, 0.01f, 160, 4.71f));
		subWorld_B.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, 0.01f, 240, 4.71f));
		subWorld_B.entityManager.addEntity(new RockPinch(handler, 500, 224, 32, 32, 0.01f, 320, 4.71f));
		
		
	}
	
	public static void initSubWorldA(Handler handler) {

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
		subWorld_A.entityManager.addEntity(new Apple(handler, 200, 232, 32, 32));
		subWorld_A.entityManager.addEntity(new Carrot(handler, 900, 100, 32, 32));
		

		// Obstaculos
		subWorld_A.entityManager.addEntity(new RockPinch(handler, 300, 300, 32, 32, 0.02f, 100));
		subWorld_A.entityManager.addEntity(new RockPinch(handler, 500, 200, 32, 32, -0.02f, 100));
		subWorld_A.entityManager.addEntity(new RockPinch(handler, 600, 400, 32, 32, 0.02f, 100));
		subWorld_A.entityManager.addEntity(new PinchDown(handler, 300, 300, 32, 32, 0, 600, 2));
		subWorld_A.entityManager.addEntity(new PinchRightLeft(handler, 300, 300, 32, 32, 0, 1024, 2));
		subWorld_A.entityManager.addEntity(new PinchRightLeft(handler, 100, 100, 32, 32, 0, 1024, 2));
		subWorld_A.entityManager.addEntity(new RockPinch(handler, 900, 200, 32, 32, -0.02f, 100));

	}
	

	public static void tick(Handler handler) {
		
		//System.out.println(handler.getWorld().getEntityManager().getEntities().size());
		
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
