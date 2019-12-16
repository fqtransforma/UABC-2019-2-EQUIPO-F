/*
* LITTLE CLEANER 1.0
* APLICACIÓN DE ESCRITORIO EN JAVA: VIDEOJUEGO INTERACTIVO CON TEMÁTICA EDUCATIVA
* AUTORES: CASTAÑON PUGA MANUEL, MONTOYA VALDIVIA OMAR ANTONIO, LÓPEZ MORENO NEREO CESAR
* CORREO ELECTRONICO : {puga, montoya.omar, nereo.lopez}@uabc.edu.mx
* UNIVERSIDAD AUTÓNOMA DE BAJA CALIFORNIA
* http://www.uabc.mx
*/

package ui.states;

import java.awt.Graphics;

import javax.swing.JOptionPane;

import logic.entity.Player;
import logic.graphicsTools.Assets;
import logic.launcher.Handler;
import logic.utils.FileIO;

//Clase que muestra la pantalla de fin de juego
public class GameOverState extends State {

	private boolean first = false;
	private int i = 0;

	public GameOverState(Handler handler) {
		super(handler);

	}

	@Override
	public void tick() {

		if (first) {

			handler.getGame().setGameState(null);
			Assets.themeSong.stop();
			FileIO.writeScore(JOptionPane.showInputDialog(null, "Introduce tu nombre"), Player.getPoints());
			Assets.menuSong.play();
			State.setState(handler.getGame().getMenuState());
			i = 0;
			first = false;
		}



	}

	@Override
	public void render(Graphics g) {

		if (!first) {
			
			g.drawImage(Assets.gameOverBG, 0, 0, Assets.gameOverBG.getWidth(), Assets.gameOverBG.getHeight(), null);
			
			i++;
			if (i > 5)
				first = true;

		}

	}

}
