/*
* LITTLE CLEANER 1.0
* APLICACIÓN DE ESCRITORIO EN JAVA: VIDEOJUEGO INTERACTIVO CON TEMÁTICA EDUCATIVA
* AUTORES: CASTAÑON PUGA MANUEL, MONTOYA VALDIVIA OMAR ANTONIO, LÓPEZ MORENO NEREO CESAR
* CORREO ELECTRONICO : {puga, montoya.omar, nereo.lopez}@uabc.edu.mx
* UNIVERSIDAD AUTÓNOMA DE BAJA CALIFORNIA
* http://www.uabc.mx
*/

package logic.entity;

import java.awt.Graphics;
import java.util.ArrayList;

import logic.launcher.Handler;

public class EntityManager {
	
	private Player player;
	private Handler handler;
	private ArrayList <Entity> entities;
	
	
	public EntityManager(Player player, Handler handler) {
		this.player = player;
		this.handler = handler;
		entities = new ArrayList<Entity>();
		
	}
	
	
	public void tick() {
		
		for(int i = 0; i < entities.size(); i++) {
			Entity e = entities.get(i);
			e.tick();
		}
		player.tick();
		
		
		
		
		
	}
	
	public void render(Graphics g) {
		
		for(Entity e : entities) {
			
			e.render(g);
		}
		player.render(g);
		
	}
	
	public void addEntity(Entity e) {
		
		entities.add(e);
		
	}
	//SETTERS AND GETTERS


	public Player getPlayer() {
		return player;
	}


	public void setPlayer(Player player) {
		this.player = player;
	}


	public Handler getHandler() {
		return handler;
	}


	public void setHandler(Handler handler) {
		this.handler = handler;
	}


	public ArrayList<Entity> getEntities() {
		return entities;
	}


	public void setEntities(ArrayList<Entity> entities) {
		this.entities = entities;
	}
	
	
	
	
	
}
