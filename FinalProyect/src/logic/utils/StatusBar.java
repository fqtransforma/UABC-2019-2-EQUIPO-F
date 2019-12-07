/*
* LITTLE CLEANER 1.0
* APLICACIÓN DE ESCRITORIO EN JAVA: VIDEOJUEGO INTERACTIVO CON TEMÁTICA EDUCATIVA
* AUTORES: CASTAÑON PUGA MANUEL, MONTOYA VALDIVIA OMAR ANTONIO, LÓPEZ MORENO NEREO CESAR
* CORREO ELECTRONICO : {puga, montoya.omar, nereo.lopez}@uabc.edu.mx
* UNIVERSIDAD AUTÓNOMA DE BAJA CALIFORNIA
* http://www.uabc.mx
*/

package logic.utils;

import java.awt.Color;
import java.awt.Graphics;

import logic.entity.Player;
import logic.launcher.Handler;

public class StatusBar {
	
	private Handler handler;
	private int width, height, x, y;
	
	
	public StatusBar(Handler handler, int width, int height, int x, int y) {
		
		this.handler = handler;
		this.height = height;
		this.width = width;
		this.x = x;
		this.y = y;
		
		
	}
	
	public void render(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(x, y , width, height);
		
		//Para imprimir residuo conseguido
		if(handler.getWorld().getPlayer().getResidue() != null) {
			
			g.setColor(Color.WHITE);
			g.drawString("Residuo: ", 0, 580);
			handler.getWorld().getPlayer().getResidue().render(g, 60, 580);
			
		}
		
		
		//Imprimir Vida de acuerdo a la cantidad 
		if(Player.getLife() > 500) {
			g.setColor(Color.GREEN);
			g.fillRect(x + 50, y , Player.getLife() / 7, 20);
		}
		else if(Player.getLife() > 200) {
			g.setColor(Color.ORANGE);
			g.fillRect(x + 50, y , Player.getLife() / 7, 20);
		}else{
			g.setColor(Color.RED);
			g.fillRect(x + 50, y , Player.getLife() / 7, 20);
		}
		
		g.setColor(Color.WHITE);
		g.drawString("Vida", x, y + 15);;
		
		
		g.drawString("Puntuacion = " + Player.getPoints(), x, y + 40);;
		
		g.setColor(Color.YELLOW);
		g.fillRect(x + 50, y + 45, Player.getDash() / 7, 20);
		g.drawString("Dash", x, y + 60);;
		
		
		
	}
	
}
