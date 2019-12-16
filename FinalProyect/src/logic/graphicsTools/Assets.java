/*
* LITTLE CLEANER 1.0
* APLICACIÓN DE ESCRITORIO EN JAVA: VIDEOJUEGO INTERACTIVO CON TEMÁTICA EDUCATIVA
* AUTORES: CASTAÑON PUGA MANUEL, MONTOYA VALDIVIA OMAR ANTONIO, LÓPEZ MORENO NEREO CESAR
* CORREO ELECTRONICO : {puga, montoya.omar, nereo.lopez}@uabc.edu.mx
* UNIVERSIDAD AUTÓNOMA DE BAJA CALIFORNIA
* http://www.uabc.mx
*/

package logic.graphicsTools;

import java.awt.image.BufferedImage;

import logic.utils.Sound;

//ESTA CLASE ESTAN TODOS LOS RECURSOS GRAFICOS CARGADOS

public class Assets {
	
	public static Sound themeSong, menuSong, doorOpen, itemPickup, dropItem, collectItem, world2Theme;
	
	public static SpriteSheet questTiles, floorTiles, bins, residues, spydi , buttons, organicFood;
	public static BufferedImage spydiUp[], spydiDown[], spydiLeft[], spydiRight[];
	public static Animation spydi_up, spydi_down, spydi_left, spydi_right;
	
	public static BufferedImage door;
	
	//icon
	public final static BufferedImage icon = ImageLoader.loadImage("./src/data/textures/Wicon.png");
	//Botones
	public static BufferedImage buttonStart, buttonStartOff, buttonScore, buttonScoreOff, buttonExit, buttonExitOff;
	
	//decoracion
	public static BufferedImage leaderBoardsBG, menuBG, gameOverBG, tittleBG;
	
	//Imaganes de los botes
	public static BufferedImage brownBin, blueBin, yellowBin, orangeBin, greenBin, blackBin;
	
	//para Residuos
	public static BufferedImage rock, banana, bottle, paperBoard, glass, aluminium, paper, can, pizzaBox, detergent, foodBag,
	largeBottle, apple, carrot;
	
	//Obstaculos
	public static BufferedImage rockPinch;
	
	//Tiles
	public static BufferedImage rockGrass, grass, grassFlower, stone, stoneBorder, waterTile, waterBlock, iceBlock, snowTile, crackedIceTile, iceBorder;

	
	public static void init(){
		
		themeSong = new Sound("./src/data/songs/themeMusic.wav", true);
		menuSong = new Sound("./src/data/songs/MenuSong.wav", true);
		doorOpen = new Sound("./src/data/songs/doorOpen.wav", false);
		itemPickup = new Sound("./src/data/songs/item_pickup.wav", false);
		collectItem = new Sound("./src/data/songs/itemGrab.wav", false);
		dropItem = new Sound("./src/data/songs/itemDroped.wav", false);
		world2Theme = new Sound("./src/data/songs/test.ogg", true);
	
		spydi = new SpriteSheet(ImageLoader.loadImage("./src/data/Textures/sprMidi.png"));
		buttons = new SpriteSheet(ImageLoader.loadImage("./src/data/Textures/buttons/pebble_buttons.png"));
		organicFood = new SpriteSheet(ImageLoader.loadImage("./src/data/Textures/OrganicFood.png"));
		

		questTiles = new SpriteSheet(ImageLoader.loadImage("./src/data/Textures/QuesTiles.png"));
		floorTiles = new SpriteSheet(ImageLoader.loadImage("./src/data/Textures/floortileset.png"));
		bins = new SpriteSheet(ImageLoader.loadImage("./src/data/Textures/bin's.png"));
		residues = new SpriteSheet(ImageLoader.loadImage("./src/data/Textures/recycle_items.png"));
		
		
		door = ImageLoader.loadImage("./src/data/Textures/door.png");
		rockPinch = questTiles.getSprite(0, 14 * 32, 32, 32);
		banana = ImageLoader.loadImage("./src/data/Textures/residues/banana.png");
		bottle = residues.getSprite(0, 15, 19, 48);
		menuBG = ImageLoader.loadImage("./src/data/Textures/MenuBackGround.png");
		gameOverBG = ImageLoader.loadImage("./src/data/Textures/gameOver.png");
		tittleBG = ImageLoader.loadImage("./src/data/Textures/Tittle.png");
		
		
		blueBin = bins.getSprite(94, 116, 288, 484);
		yellowBin = bins.getSprite(908, 112, 306, 496);
		brownBin = bins.getSprite(90, 720, 297, 492);
		orangeBin = bins.getSprite(905, 722, 305, 492);
		greenBin = bins.getSprite(500, 722, 294, 491);
		blackBin = bins.getSprite(500, 113, 300, 491);
		paperBoard = residues.getSprite(98, 14, 51, 48);
		glass = residues.getSprite(243, 12, 17, 50);
		aluminium = residues.getSprite(353, 28, 18, 34);
		paper = residues.getSprite(151, 34, 53, 28);
		can = residues.getSprite(330, 22, 21, 40);
		pizzaBox = residues.getSprite(403, 32, 60, 30);
		detergent = residues.getSprite(60, 18, 36, 44);
		foodBag = residues.getSprite(206, 16, 35, 46);
		largeBottle = residues.getSprite(287, 13, 16, 49);
		apple = organicFood.getSprite(0, 0, 27, 31);
		carrot = organicFood.getSprite(120, 3, 37, 37);
		
		
		buttonStart = buttons.getSprite(157 * 1, 112 * 0, 157, 112);
		buttonStartOff = buttons.getSprite(157 * 0, 112 * 0, 157, 112);
		buttonScore = buttons.getSprite(157 * 1, 112 * 2, 157, 112);
		buttonScoreOff = buttons.getSprite(157 * 0, 112 * 2, 157, 112);
		buttonExit = buttons.getSprite(157 * 1, 112 * 3, 157, 112);
		buttonExitOff = buttons.getSprite(157 * 0, 112 * 3, 157, 112);
		
		
		//FloorTiles
		rockGrass = floorTiles.getSprite(32 * 4, 32 * 1, 32, 32);
		grass = floorTiles.getSprite(32 * 0, 32 * 7, 32, 32);
		grassFlower = floorTiles.getSprite(32 * 0, 32 * 2, 32, 32);
		stone = floorTiles.getSprite(32 * 5, 32 * 0, 32, 32);
		stoneBorder = floorTiles.getSprite(32 * 7, 32 * 4, 32, 32);
		waterTile = floorTiles.getSprite(32 * 4, 32 * 5, 32, 32);
		waterBlock = floorTiles.getSprite(32 * 3, 32 * 5, 32, 32);
		iceBlock = floorTiles.getSprite(32 * 1, 32 * 1, 32, 32);	
		snowTile = floorTiles.getSprite(32 * 5, 32 * 6, 32, 32);		
		crackedIceTile = floorTiles.getSprite(32 * 6, 32 * 6, 32, 32);	
		iceBorder = floorTiles.getSprite(32 * 7, 32 * 5, 32, 32);		
		
		rock = questTiles.getSprite(0, 0, 32, 32);
		
		//Musica
		
		
		spydiUp =  new BufferedImage[4];
		spydiDown = new BufferedImage[4];
		spydiLeft = new BufferedImage[4];
		spydiRight = new BufferedImage[4];
		
		
		//Player down
		spydiDown[0] = spydi.getSprite(22 * 0, 22 * 0, 22, 22);
		spydiDown[1] = spydi.getSprite(22 * 1, 22 * 0, 22, 22);
		spydiDown[2] = spydi.getSprite(22 * 2, 22 * 0, 22, 22);
		spydiDown[3] = spydi.getSprite(22 * 3, 22 * 0, 22, 22);
		
		//player up
		spydiUp[0] = spydi.getSprite(22 * 0, 22 * 4, 22, 22);
		spydiUp[1] = spydi.getSprite(22 * 1, 22 * 4, 22, 22);
		spydiUp[2] = spydi.getSprite(22 * 2, 22 * 4, 22, 22);
		spydiUp[3] = spydi.getSprite(22 * 3, 22 * 4, 22, 22);
		
		//player left
		spydiLeft[0] = spydi.getSprite(22 * 0, 22 * 6, 22, 22);
		spydiLeft[1] = spydi.getSprite(22 * 1, 22 * 6, 22, 22);
		spydiLeft[2] = spydi.getSprite(22 * 2, 22 * 6, 22, 22);
		spydiLeft[3] = spydi.getSprite(22 * 3, 22 * 6, 22, 22);
		
		
		//Player right
		spydiRight[0] = spydi.getSprite(22 * 0, 22 * 2, 22, 22);
		spydiRight[1] = spydi.getSprite(22 * 1, 22 * 2, 22, 22);
		spydiRight[2] = spydi.getSprite(22 * 2, 22 * 2, 22, 22);
		spydiRight[3] = spydi.getSprite(22 * 3, 22 * 2, 22, 22);
		
		
		spydi_up = new Animation(100, spydiUp);
		spydi_down = new Animation(100, spydiDown);
		spydi_left = new Animation(100, spydiLeft);
		spydi_right = new Animation(100, spydiRight);
		
		
	}
	
}
