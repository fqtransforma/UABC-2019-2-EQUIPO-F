/*
* LITTLE CLEANER 1.0
* APLICACIÓN DE ESCRITORIO EN JAVA: VIDEOJUEGO INTERACTIVO CON TEMÁTICA EDUCATIVA
* AUTORES: CASTAÑON PUGA MANUEL, MONTOYA VALDIVIA OMAR ANTONIO, LÓPEZ MORENO NEREO CESAR
* CORREO ELECTRONICO : {puga, montoya.omar, nereo.lopez}@uabc.edu.mx
* UNIVERSIDAD AUTÓNOMA DE BAJA CALIFORNIA
* http://www.uabc.mx
*/

package ui.states;

import java.awt.Font;
import java.awt.Graphics;

import logic.graphicsTools.Assets;
import logic.launcher.Handler;

public class HelpState extends State {

	private final Font font = new Font("Rockwell", Font.PLAIN, 20);

	public HelpState(Handler handler) {
		super(handler);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {

		if (handler.getKeyManager().enter) {

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

		g.setFont(font);
		g.drawString("El objetivo del juego es recoger todos los residuos del mapa y clasificarlos", 100, 200);
		g.drawString("en los siguientes contenedores", 100, 230);
		g.drawString("Solo acercate al residuo y te aparecera de que tipo es", 100, 260);
		g.drawString("Presiona enter para darte un pequeño impulso por un corto tiempo al estar jugadoo", 100, 290);

		g.drawImage(Assets.blueBin, 100, 400, 32, 64, null);
		g.drawString("Carton y papel", 50, 380);

		g.drawImage(Assets.greenBin, 300, 400, 32, 64, null);
		g.drawString("vidrio", 300, 380);

		g.drawImage(Assets.blackBin, 500, 400, 32, 64, null);
		g.drawString("Aluminio", 500, 380);

		g.drawImage(Assets.yellowBin, 700, 400, 32, 64, null);
		g.drawString("Plastico", 700, 380);

		g.drawImage(Assets.brownBin, 900, 400, 32, 64, null);
		g.drawString("Organico", 900, 380);

		g.drawString("Presiona enter para regresar al menu anterior", 100, 550);

	}

}
