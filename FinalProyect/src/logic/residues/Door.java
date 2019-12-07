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

public class Door extends StaticEntity {
	
	private int size = 0;
	
	public Door(Handler handler, float x, float y, int width, int height, int size) {
		super(handler, x, y, width, height);
		
		this.size = size;
	}

	@Override
	public void tick() {
		
		if(handler.getWorld().getEntityManager().getEntities().size() == size && handler.getWorld().getPlayer().getResidue() == null) {
			
			for(int i = 0; i < handler.getWorld().getEntityManager().getEntities().size(); i++) {
				
				if(handler.getWorld().getEntityManager().getEntities().get(i).equals(this))
					handler.getWorld().getEntityManager().getEntities().remove(i);
					
			}
			
		}

	}

	@Override
	public void render(Graphics g) {
		
		g.drawImage(Assets.door,(int) x, (int)y, width, height, null);
	}

	
	
}
