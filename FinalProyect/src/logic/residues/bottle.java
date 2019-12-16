/*
* LITTLE CLEANER 1.0
* APLICACIÓN DE ESCRITORIO EN JAVA: VIDEOJUEGO INTERACTIVO CON TEMÁTICA EDUCATIVA
* AUTORES: CASTAÑON PUGA MANUEL, MONTOYA VALDIVIA OMAR ANTONIO, LÓPEZ MORENO NEREO CESAR
* CORREO ELECTRONICO : {puga, montoya.omar, nereo.lopez}@uabc.edu.mx
* UNIVERSIDAD AUTÓNOMA DE BAJA CALIFORNIA
* http://www.uabc.mx
*/

package logic.residues;

import java.awt.Graphics;

import logic.entity.StaticEntity;
import logic.graphicsTools.Assets;
import logic.launcher.Handler;

public class bottle extends StaticEntity {

	public bottle(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);

		// Collision box
		bounds.x = 0;
		bounds.y = 0;
		bounds.width = width;
		bounds.height = height;

		points = 130;
		speed = 500;
		lastTime = System.currentTimeMillis();
	}

	@Override
	public void tick() {

		if (handler.getWorld().getPlayer().getResidue() == null) {

			if (handler.getWorld().getPlayer().getCollisionsBounds(handler.getWorld().getPlayer().getxMove(),
					handler.getWorld().getPlayer().getyMove()).intersects(this.getCollisionsBounds(0, 0))) {

				for (int i = 0; i < handler.getWorld().getEntityManager().getEntities().size(); i++) {

					if (handler.getWorld().getEntityManager().getEntities().get(i).equals(this)) {
						handler.getWorld().getPlayer().setResidue(this);
						handler.getWorld().getEntityManager().getEntities().remove(i);
						Assets.collectItem.play();
					}

				}

			}

		}
		
		timer += System.currentTimeMillis() - lastTime;
		lastTime = System.currentTimeMillis();
		
		if(timer > speed){
			timer = 0;
			if(points > 0)
				this.points--;
		}
		

	}
	
	

	@Override
	public String getTypeResidue() {
		
		return "plastico";
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.bottle, (int) x, (int) y, width, height, null);


	}

}