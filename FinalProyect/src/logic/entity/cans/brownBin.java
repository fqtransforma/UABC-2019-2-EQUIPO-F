/*
* LITTLE CLEANER 1.0
* APLICACIÓN DE ESCRITORIO EN JAVA: VIDEOJUEGO INTERACTIVO CON TEMÁTICA EDUCATIVA
* AUTORES: MONTOYA VALDIVIA OMAR ANTONIO, LÓPEZ MORENO NEREO CESAR
* CORREO ELECTRONICO : {montoya.omar, nereo.lopez}@uabc.edu.mx
* UNIVERSIDAD AUTÓNOMA DE BAJA CALIFORNIA
* http://www.uabc.mx
*/

package logic.entity.cans;

import java.awt.Color;
import java.awt.Graphics;

import logic.entity.Player;
import logic.entity.StaticEntity;
import logic.graphicsTools.Assets;
import logic.launcher.Handler;

public class brownBin extends StaticEntity {

	public brownBin(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);

		// Collision box
		bounds.x = 0;
		bounds.y = 0;
		bounds.width = width;
		bounds.height = height;

	}

	@Override
	public void tick() {

		if (handler.getWorld().getPlayer().getResidue() != null) {

			if (handler.getWorld().getPlayer().getCollisionsBounds(handler.getWorld().getPlayer().getxMove(),
					handler.getWorld().getPlayer().getyMove()).intersects(this.getCollisionsBounds(0, 0))) {

				if (handler.getWorld().getPlayer().getResidue().getTypeResidue().equals("organico")) {
					Assets.itemPickup.play();
					Player.setPoints(Player.getPoints() + handler.getWorld().getPlayer().getResidue().getPoints());
					handler.getWorld().getPlayer().setResidue(null);
					Player.setLife(Player.getLife() + 100);

					if (Player.getLife() > 1000)
						Player.setLife(1000);
				} else {
					Assets.dropItem.play();
					handler.getWorld().getEntityManager().addEntity(handler.getWorld().getPlayer().getResidue());
					handler.getWorld().getPlayer().setResidue(null);

				}

			}

		}
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.brownBin, (int) x, (int) y, width, height, null);
		// g.setColor(Color.red);
		// g.drawRect((int)(x + bounds.x), (int)(y + bounds.y), bounds.width,
		// bounds.height);

	}

}
