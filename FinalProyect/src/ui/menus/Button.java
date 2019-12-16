/*
* LITTLE CLEANER 1.0
* APLICACIÓN DE ESCRITORIO EN JAVA: VIDEOJUEGO INTERACTIVO CON TEMÁTICA EDUCATIVA
* AUTORES: CASTAÑON PUGA MANUEL, MONTOYA VALDIVIA OMAR ANTONIO, LÓPEZ MORENO NEREO CESAR
* CORREO ELECTRONICO : {puga, montoya.omar, nereo.lopez}@uabc.edu.mx
* UNIVERSIDAD AUTÓNOMA DE BAJA CALIFORNIA
* http://www.uabc.mx
*/

package ui.menus;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import logic.launcher.Handler;


public class Button {
	
	protected Handler handler;
	protected int x, y, width, height;
	protected boolean enabled, pressed, released;
	protected String text;
	protected Font font = new Font("Verdana", Font.PLAIN, 14);
	
	


	public Button(int x, int y, int width, int height, String text, Handler handler) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.text = text;
		this.handler = handler;

	}
	
	
	public void render(Graphics g) {
		
		if(pressed) {
			
			
			g.setColor(Color.orange);

			
			
		}
		else {
			
			g.setColor(Color.yellow);

			
		}
		if(enabled) {
			g.fillRect(x, y, width, height);
			g.setFont(font);
			g.setColor(Color.black);
			int stringWidth = g.getFontMetrics().stringWidth(text);
			g.drawString(text, x + width / 2 - stringWidth /2, y + height /2);
		}
		
	}
	
	
	

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isPressed() {
		return pressed;
	}

	public void setPressed(boolean pressed) {
		this.pressed = pressed;
	}

	public boolean isReleased() {
		return released;
	}

	public void setReleased(boolean released) {
		this.released = released;
	}


	
	
	
	
	
}
