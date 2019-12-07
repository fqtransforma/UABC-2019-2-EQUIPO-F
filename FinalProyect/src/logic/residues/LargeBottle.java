/*
* LITTLE CLEANER 1.0
* APLICACI�N DE ESCRITORIO EN JAVA: VIDEOJUEGO INTERACTIVO CON TEM�TICA EDUCATIVA
* AUTORES: CASTA�ON PUGA MANUEL, MONTOYA VALDIVIA OMAR ANTONIO, L�PEZ MORENO NEREO CESAR
* CORREO ELECTRONICO : {puga, montoya.omar, nereo.lopez}@uabc.edu.mx
* UNIVERSIDAD AUT�NOMA DE BAJA CALIFORNIA
* http://www.uabc.mx
*/

package logic.residues;

import java.awt.Graphics;

import logic.entity.StaticEntity;
import logic.graphicsTools.Assets;
import logic.launcher.Handler;

public class LargeBottle extends StaticEntity {

	public LargeBottle(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
		// Collision box
		bounds.x = 0;
		bounds.y = 0;
		bounds.width = width;
		bounds.height = height;

		points = 100;
		speed = 500;
		lastTime = System.currentTimeMillis();

	}

	@Override
	public void tick() {

		if (handler.getWorld().getPlayer().getResidue() == null) {

			if (handler.getWorld().getPlayer().getCollisionsBounds(handler.getWorld().getPlayer().getxMove(),
					handler.getWorld().getPlayer().getyMove()).intersects(this.getCollisionsBounds(0, 0))) {
				Assets.collectItem.play();
				for (int i = 0; i < handler.getWorld().getEntityManager().getEntities().size(); i++) {

					if (handler.getWorld().getEntityManager().getEntities().get(i).equals(this)) {
						handler.getWorld().getPlayer().setResidue(this);
						handler.getWorld().getEntityManager().getEntities().remove(i);

					}

				}

			}

		}

		timer += System.currentTimeMillis() - lastTime;
		lastTime = System.currentTimeMillis();

		if (timer > speed) {
			timer = 0;
			if (points > 0)
				this.points--;
		}

	}

	@Override
	public String getTypeResidue() {

		return "vidrio";

	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.largeBottle, (int) x, (int) y, width, height, null);

	}

}
