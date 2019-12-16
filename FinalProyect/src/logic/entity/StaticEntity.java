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

import logic.launcher.Handler;

public abstract class StaticEntity extends Entity{
	
	protected int points;
	protected int speed, index;
	protected long lastTime, timer;
	
	public StaticEntity(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
		
	}
	
	public String getTypeResidue() {
		
		return "default";
		
	}
	
	
	public void render(Graphics g, int x, int y) {
		
		g.drawString(this.getTypeResidue(), x, y);
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	
	
}
