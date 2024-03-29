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
import logic.launcher.Handler;
import ui.worlds.WorldC;
import ui.worlds.WorldD;

public class NextDoor3to4 extends StaticEntity{
	
	private int size = 0;
	
	public NextDoor3to4(Handler handler, float x, float y, int width, int height, int size) {
		super(handler, x, y, width, height);
		
		this.size = size;
	}

	@Override
	public void tick() {
		if (handler.getWorld().getEntityManager().getEntities().size() == size
				&& handler.getWorld().getPlayer().getResidue() == null
				&& handler.getWorld().equals(WorldC.subWorld_D)) {

			handler.setWorld(WorldD.subWorld_A);
			//State.setState(handler.getGame().getGameOverState());
		}
		
	
	}

	@Override
	public void render(Graphics g) {
	
		
	}
	
	
	
}
