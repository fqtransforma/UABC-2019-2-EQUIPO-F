/*
* LITTLE CLEANER 1.0
* APLICACI�N DE ESCRITORIO EN JAVA: VIDEOJUEGO INTERACTIVO CON TEM�TICA EDUCATIVA
* AUTORES: CASTA�ON PUGA MANUEL, MONTOYA VALDIVIA OMAR ANTONIO, L�PEZ MORENO NEREO CESAR
* CORREO ELECTRONICO : {puga, montoya.omar, nereo.lopez}@uabc.edu.mx
* UNIVERSIDAD AUT�NOMA DE BAJA CALIFORNIA
* http://www.uabc.mx
*/

package ui.states;

import java.awt.Graphics;

import logic.entity.Player;
import logic.launcher.Handler;
import ui.worlds.WorldA;
import ui.worlds.WorldB;
import ui.worlds.WorldC;
import ui.worlds.WorldD;

public class GameState extends State {
	
	public GameState(Handler handler) {
		super(handler);

		WorldA.init(handler);
		WorldB.init(handler);
		WorldC.init(handler);
		WorldD.init(handler);
		
		handler.setWorld(WorldA.subWorld_A);
		
	}

	@Override
	public void tick() {
		
		if(Player.getLife() < 0)
			State.setState(handler.getGame().getGameOverState());
		
		WorldA.tick(handler);//Para actualizar cambios
		WorldB.tick(handler);//Para actualizar cambios
		WorldC.tick(handler);//Para actualizar cambios
		WorldD.tick(handler);//Para actualizar cambios
		
		
		handler.getWorld().tick();//Actualizar todas las entities del mundo

	}

	@Override
	public void render(Graphics g) {
		handler.getWorld().render(g);

	}

}
