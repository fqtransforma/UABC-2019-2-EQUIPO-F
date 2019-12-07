/*
* LITTLE CLEANER 1.0
* APLICACIÓN DE ESCRITORIO EN JAVA: VIDEOJUEGO INTERACTIVO CON TEMÁTICA EDUCATIVA
* AUTORES: CASTAÑON PUGA MANUEL, MONTOYA VALDIVIA OMAR ANTONIO, LÓPEZ MORENO NEREO CESAR
* CORREO ELECTRONICO : {puga, montoya.omar, nereo.lopez}@uabc.edu.mx
* UNIVERSIDAD AUTÓNOMA DE BAJA CALIFORNIA
* http://www.uabc.mx
*/

package ui.worlds;

import java.awt.Graphics;

import logic.entity.EntityManager;
import logic.entity.Player;
import logic.launcher.Handler;
import logic.tiles.Tile;
import logic.utils.Utils;


public class World {
	
	protected int width, height;
	protected int spawnX, spawnY;
	protected int[][] tiles;
	protected Handler handler;
	protected EntityManager entityManager;
	protected Player player;

	
	public World(Handler handler, String path, float x, float y){
		loadWorld(path);
		player = new Player(handler, 32, 32, 32, 32);
		entityManager = new EntityManager(player, handler);
		
	}

	public void tick(){
		entityManager.tick();//Actualizar todos los objetos del arrayList de Entity 
	}
	
	public void render(Graphics g) {
		
		for(int j = 0; j < height; j++) {
			
			for(int i = 0; i < width; i++) {
				
				
				getTile(i, j).render(g, i * Tile.TILEHEIGHT, j * Tile.TILEWIDTH);
				
			}
			
		}
		//entities
		
		entityManager.render(g);//Renderizar todos los objetos del arraylist de Entity 
		
		
		
	}
	
	public void loadWorld(String path) {
		String file = Utils.loadFileAsString(path);
		String tokens[] = file.split("\\s+");
		
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		spawnX = Utils.parseInt(tokens[2]);
		spawnY = Utils.parseInt(tokens[3]);
		
		tiles = new int [width][height];
		
		for(int x = 0; x < width; x++) {
			
			for(int y = 0; y < height; y++) {
				
				tiles[x][y] = Utils.parseInt(tokens[(x + y * width) + 4]);
				
			}
			
		}
		
		
		
	}
	
	
	public Tile getTile(int x, int y) {
		
		if(x < 0 || y < 0 || x>= width || y >= height)
			return Tile.rockTile;
		
		Tile T = Tile.tiles[tiles[x][y]];
		if(T == null)
			return Tile.rockTile;
		
		return T;
		
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public Player getPlayer() {
		return player;
	}
	
	
	
}