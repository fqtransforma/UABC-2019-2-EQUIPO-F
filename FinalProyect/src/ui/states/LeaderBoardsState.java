/*
* LITTLE CLEANER 1.0
* APLICACIÓN DE ESCRITORIO EN JAVA: VIDEOJUEGO INTERACTIVO CON TEMÁTICA EDUCATIVA
* AUTORES: CASTAÑON PUGA MANUEL, MONTOYA VALDIVIA OMAR ANTONIO, LÓPEZ MORENO NEREO CESAR
* CORREO ELECTRONICO : {puga, montoya.omar, nereo.lopez}@uabc.edu.mx
* UNIVERSIDAD AUTÓNOMA DE BAJA CALIFORNIA
* http://www.uabc.mx
*/

package ui.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import logic.graphicsTools.Assets;
import logic.launcher.Handler;
import logic.utils.FileIO;

public class LeaderBoardsState extends State {

	private final Font font = new Font("Rockwell", Font.PLAIN, 20);
	private boolean show = false;

	public LeaderBoardsState(Handler handler) {
		super(handler);

	}

	@Override
	public void tick() {

		if (handler.getKeyManager().enter) {
			show = false;
			State.setState(handler.getGame().getMenuState());

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public void render(Graphics g) {
		int j = 0;
		g.drawImage(Assets.menuBG, 0, 0, 1024, 600, null);

		g.setFont(font);
		g.setColor(Color.BLACK);
		
		g.drawString("Presiona enter para regresar", 700, 300);

		for (int i = 0; i < FileIO.getHighScores().size(); i += 2) {
			g.drawString("" + (j + 1), 380, 30 * i + 20);
			g.drawString((String) FileIO.getHighScores().get(i), 400, 30 * i + 20);
			g.drawString((String) FileIO.getHighScores().get(i + 1), 500, 30 * i + 20);
			j++;
		}

	}

}
