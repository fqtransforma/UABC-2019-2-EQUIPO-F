/*
* LITTLE CLEANER 1.0
* APLICACIÓN DE ESCRITORIO EN JAVA: VIDEOJUEGO INTERACTIVO CON TEMÁTICA EDUCATIVA
* AUTORES: CASTAÑON PUGA MANUEL, MONTOYA VALDIVIA OMAR ANTONIO, LÓPEZ MORENO NEREO CESAR
* CORREO ELECTRONICO : {puga, montoya.omar, nereo.lopez}@uabc.edu.mx
* UNIVERSIDAD AUTÓNOMA DE BAJA CALIFORNIA
* http://www.uabc.mx
*/

package ui.menus;

import java.awt.Graphics;

import logic.graphicsTools.Assets;
import logic.launcher.Handler;

public class ExitBtn extends Button {

	public ExitBtn(int x, int y, int width, int height, String text, Handler handler) {
		super(x, y, width, height, text, handler);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void render(Graphics g) {
		
		if(pressed) {
			
			g.drawImage(Assets.buttonExit, x, y, width, height, null);
			
			
			
		}
		else {
			
			g.drawImage(Assets.buttonExitOff, x, y, width, height, null);

			
		}
		
	}
}
