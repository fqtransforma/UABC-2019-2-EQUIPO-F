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
import java.awt.image.BufferedImage;

import logic.graphicsTools.Assets;
import logic.launcher.Handler;
import logic.tiles.Tile;
import logic.utils.StatusBar;

public class Player extends Entity {

	private float xMove, yMove;
	private int speed;
	private static int life = 1000;
	private static int points = 0;
	private StaticEntity residue = null;
	private static int dash = 500;
	private StatusBar statusBar;

	// test
	private boolean upAnimationLock = false;
	private boolean downAnimationLock = true;
	private boolean leftAnimationLock = false;
	private boolean rightAnimationLock = false;

	public Player(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);

		statusBar = new StatusBar(handler, 232, 100, 0, 500);

		// test
		bounds.x = 10;
		bounds.y = 10; // colission box
		bounds.width = 10;
		bounds.height = 20;

		// test

		xMove = 0;
		yMove = 0;
		speed = 3;
		

	}

	@Override
	public void tick() {

		// test
		getDirection();
		animate();
		move();

	}

	@Override
	public void render(Graphics g) {
		statusBar.render(g);
		g.drawImage(getCurrentFrame(), (int) x, (int) y, width, height, null);

	}

	// test methods
	public void getDirection() {
		xMove = 0;
		yMove = 0;

		if (handler.getKeyManager().up) {

			yMove = -speed;
			upAnimationLock = true;
			downAnimationLock = false;
			leftAnimationLock = false;
			rightAnimationLock = false;

		}

		if (handler.getKeyManager().down) {

			yMove = speed;
			downAnimationLock = true;
			upAnimationLock = false;
			leftAnimationLock = false;
			rightAnimationLock = false;
		}

		if (handler.getKeyManager().right) {

			xMove = speed;
			upAnimationLock = false;
			downAnimationLock = false;
			leftAnimationLock = false;
			rightAnimationLock = true;
		}

		if (handler.getKeyManager().left) {
			upAnimationLock = false;
			downAnimationLock = false;
			rightAnimationLock = false;
			leftAnimationLock = true;
			xMove = -speed;

		}

		if (handler.getKeyManager().enter) {

			if (dash < 0) {
				this.dash = -1;
				this.speed = 3;

			}

			else {
				this.speed = 6;
				this.dash -= 20;

			}

		} else {

			this.dash += 10;
			this.speed = 3;

			if (this.dash > 500)
				this.dash = 500;

		}

	}

	public void move() {

		if (!checkEntityCollision(xMove, 0f))
			moveX();

		if (!checkEntityCollision(0f, yMove))
			moveY();

	}

	public void moveX() {
		if (xMove > 0) {// Moving right
			int tx = (int) (x + xMove + bounds.x + bounds.width) / Tile.TILEWIDTH;

			if (!collisionWithTile(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT)
					&& !collisionWithTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)) {
				x += xMove;
			}
		} else if (xMove < 0) {// Moving left
			int tx = (int) (x + xMove + bounds.x) / Tile.TILEWIDTH;

			if (!collisionWithTile(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT)
					&& !collisionWithTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)) {
				x += xMove;
			}
		}
	}

	public void moveY() {
		if (yMove < 0) {// Up
			int ty = (int) (y + yMove + bounds.y) / Tile.TILEHEIGHT;

			if (!collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty)
					&& !collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)) {
				y += yMove;
			}
		} else if (yMove > 0) {// Down
			int ty = (int) (y + yMove + bounds.y + bounds.height) / Tile.TILEHEIGHT;

			if (!collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty)
					&& !collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)) {
				y += yMove;
			}
		}
	}

	private boolean collisionWithTile(int x, int y) {

		return handler.getWorld().getTile(x, y).isSolid();

	}

	public void animate() {
		Assets.spydi_up.tick();
		Assets.spydi_down.tick();
		Assets.spydi_left.tick();
		Assets.spydi_right.tick();

	}

	public BufferedImage getCurrentFrame() {

		if (yMove > 0)
			return Assets.spydi_down.getCurrentFrame();
		if (yMove < 0)
			return Assets.spydi_up.getCurrentFrame();
		if (xMove < 0) {

			return Assets.spydi_left.getCurrentFrame();
		}
		if (xMove > 0) {

			return Assets.spydi_right.getCurrentFrame();
		}

		if (upAnimationLock) {
			return Assets.spydiUp[0];
		}
		if (downAnimationLock) {
			return Assets.spydiDown[0];
		}
		if (leftAnimationLock) {
			return Assets.spydiLeft[0];
		}
		if (rightAnimationLock) {
			return Assets.spydiRight[0];
		}

		else
			return Assets.spydi_down.getCurrentFrame();

	}

	public float getxMove() {
		return xMove;
	}

	public void setxMove(float xMove) {
		this.xMove = xMove;
	}

	public float getyMove() {
		return yMove;
	}

	public void setyMove(float yMove) {
		this.yMove = yMove;
	}

	public StaticEntity getResidue() {
		return residue;
	}

	public void setResidue(StaticEntity residue) {
		this.residue = residue;
	}

	public static int getLife() {
		return life;
	}

	public static void setLife(int life) {
		Player.life = life;
	}

	public static int getPoints() {
		return points;
	}

	public static void setPoints(int points) {
		Player.points = points;
	}

	public static int getDash() {
		return dash;
	}

	public static void setDash(int dash) {
		Player.dash = dash;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
