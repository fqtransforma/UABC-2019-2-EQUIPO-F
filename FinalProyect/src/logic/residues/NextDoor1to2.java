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
import logic.launcher.Handler;
import ui.worlds.WorldA;
import ui.worlds.WorldB;

public class NextDoor1to2 extends StaticEntity {
	
	private int size = 0;
	
	public NextDoor1to2(Handler handler, float x, float y, int width, int height, int size) {
		super(handler, x, y, width, height);
		// TODO Auto-generated constructor stub
		this.size = size;
	}

	@Override
	public void tick() {
		if (handler.getWorld().getEntityManager().getEntities().size() == size
				&& handler.getWorld().getPlayer().getResidue() == null
				&& handler.getWorld().equals(WorldA.subWorld_D)) {

			handler.setWorld(WorldB.subWorld_A);

		}
		
		

	}

	@Override
	public void render(Graphics g) {
		

	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	
	

}
