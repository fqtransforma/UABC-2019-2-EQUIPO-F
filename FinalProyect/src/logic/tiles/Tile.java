/*
* LITTLE CLEANER 1.0
* APLICACIÓN DE ESCRITORIO EN JAVA: VIDEOJUEGO INTERACTIVO CON TEMÁTICA EDUCATIVA
* AUTORES: CASTAÑON PUGA MANUEL, MONTOYA VALDIVIA OMAR ANTONIO, LÓPEZ MORENO NEREO CESAR
* CORREO ELECTRONICO : {puga, montoya.omar, nereo.lopez}@uabc.edu.mx
* UNIVERSIDAD AUTÓNOMA DE BAJA CALIFORNIA
* http://www.uabc.mx
*/

package logic.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import logic.tiles.floorTiles.*;

public class Tile {
	
	//STATIC STUFF HERE
	
	public static Tile[] tiles = new Tile[256];
	public static Tile rockTile = new RockTile(0);//agregar nuevo Tile
	public static Tile rockGrassTile = new RockGrassTile(1);
	public static Tile grassTile = new GrassTile(2);
	public static Tile stoneTile = new stoneTiles(3);
	public static Tile stoneBorder = new stoneBorder(4);
	public static Tile waterTile = new waterTile(5);
	public static Tile waterBlock = new waterBlock(6);
	public static Tile iceBlock = new iceBlock(7);
	public static Tile flowerGrassTile = new FlowerGrassTile(8);
	public static Tile snowTile = new snowTile(9);
	public static Tile iceBorder = new iceBorder(10);
	public static Tile crackedTile = new crackedTile(11);
	
	//CLASS
	
	public static final int TILEWIDTH = 32, TILEHEIGHT = 32;
	
	protected BufferedImage texture;
	protected final int id;
	
	public Tile(BufferedImage texture, int id){
		this.texture = texture;
		this.id = id;
		
		tiles[id] = this;
	}
	
	public void tick(){
		
	}
	
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
	}
	
	public boolean isSolid(){
		return false;
	}
	
	
	
	public int getId(){
		return id;
	}
	
}
