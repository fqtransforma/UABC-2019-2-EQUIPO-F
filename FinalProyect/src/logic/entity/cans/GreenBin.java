/*
* LITTLE CLEANER 1.0
* APLICACIÓN DE ESCRITORIO EN JAVA: VIDEOJUEGO INTERACTIVO CON TEMÁTICA EDUCATIVA
* AUTORES: MONTOYA VALDIVIA OMAR ANTONIO, LÓPEZ MORENO NEREO CESAR
* CORREO ELECTRONICO : {montoya.omar, nereo.lopez}@uabc.edu.mx
* UNIVERSIDAD AUTÓNOMA DE BAJA CALIFORNIA
* http://www.uabc.mx
*/

package logic.entity.cans;

import java.awt.Graphics;

import logic.entity.Player;
import logic.entity.StaticEntity;
import logic.graphicsTools.Assets;
import logic.launcher.Handler;

public class GreenBin extends StaticEntity {

	public GreenBin(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		if (handler.getWorld().getPlayer().getResidue() != null) {

			if (handler.getWorld().getPlayer().getCollisionsBounds(handler.getWorld().getPlayer().getxMove(),
					handler.getWorld().getPlayer().getyMove()).intersects(this.getCollisionsBounds(0, 0))) {

				if (handler.getWorld().getPlayer().getResidue().getTypeResidue().equals("vidrio")) {
					Assets.itemPickup.play();
					Player.setPoints(Player.getPoints() + handler.getWorld().getPlayer().getResidue().getPoints());
					handler.getWorld().getPlayer().setResidue(null);
					Player.setLife(Player.getLife() + 100);
				
					if (Player.getLife() > 1000)
						Player.setLife(1000);
				}
				else {
					Assets.dropItem.play();
					handler.getWorld().getEntityManager().addEntity(handler.getWorld().getPlayer().getResidue());
					handler.getWorld().getPlayer().setResidue(null);
					
				}

			}

		}
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.greenBin, (int)x, (int)y, width, height, null);

	}

}
