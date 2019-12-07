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

public class DynamicEntity extends Entity {

	// Para movimientos circulares
	protected float angle = 0;

	// Para movimientos izquierda derecha
	protected boolean direction = true;

	protected int xMove, yMove;// Es la direccion a la que se mueve la Entity

	public DynamicEntity(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);

	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(Graphics g) {

	}

	// Esta clase se usara para crear Entities (Objetos con los que interactua el
	// usuario) pero seran dinamicos
	// es decir, se pueden mover en el mapa

	public void circularMove(int radius, float speed) {

		this.x = this.width / 2 + (float) (Math.cos(angle)) * radius;
		this.y = this.height / 2 + (float) (Math.sin(angle)) * radius;

		angle = angle + speed;

		if (angle > 6.28f || angle < -6.28f) {
			angle = 0;
		}

	}

	public void leftRightMove(float limitX0, float limitX1, float speed) {

		if (this.x < limitX1 - this.width && direction)
			x += speed;
		else
			direction = false;

		if (!direction) {
			x -= speed;
			if (x < limitX0)
				direction = true;
		}

	}

	public void upDownMove(float limitY1, float limitY0, float speed) {

		if (y < limitY1 && direction)
			y += speed;
		else
			direction = false;

		if (!direction) {

			y -= speed;
			if (y < limitY0)
				direction = true;

		}

	}

	public float getAngle() {
		return angle;
	}

	public void setAngle(float angle) {
		this.angle = angle;
	}
	
	
	

}
