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
import java.awt.Rectangle;

import logic.launcher.Handler;

public abstract class Entity {

	protected float x, y;
	protected int width, height;
	protected Rectangle bounds;
	protected Handler handler;
	
	public Entity(Handler handler, float x, float y, int width, int height){
		this.handler = handler;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		bounds = new Rectangle(0, 0, width, height);
	}
	

	
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
	
	
	public boolean checkEntityCollision(float offsetX, float offsetY) {
		
		for(Entity e : handler.getWorld().getEntityManager().getEntities()) {
			if(e.equals(this))
				continue;
			
			if(e.getCollisionsBounds(0f, 0f).intersects(getCollisionsBounds(offsetX, offsetY)))
				return true;
			}
		
			return false;	
		
		
		
	}
	
	public Rectangle getCollisionsBounds(float offsetX, float offsetY) {
		
		return new Rectangle((int)(x + bounds.x + offsetX), (int)(y + bounds.y + offsetY), bounds.width, bounds.height);
		
	}
	
	public boolean noHurt() {
		
		return false;
	}


	public float getX() {
		return x;
	}



	public void setX(float x) {
		this.x = x;
	}



	public float getY() {
		return y;
	}



	public void setY(float y) {
		this.y = y;
	}



	public int getWidth() {
		return width;
	}



	public void setWidth(int width) {
		this.width = width;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public Rectangle getBounds() {
		return bounds;
	}



	public void setBounds(Rectangle bounds) {
		this.bounds = bounds;
	}



	public Handler getHandler() {
		return handler;
	}



	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	
}
