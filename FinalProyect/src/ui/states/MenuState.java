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

import logic.entity.Player;
import logic.graphicsTools.Assets;
import logic.launcher.Handler;
import ui.menus.ExitBtn;
import ui.menus.ScoreBtn;
import ui.menus.StartBtn;

public class MenuState extends State {

	private int select;
	private final Font font = new Font("Rockwell", Font.PLAIN, 20);
	private StartBtn startBtn;
	private ScoreBtn pointsBtn;
	private ExitBtn exitBtn;

	public MenuState(Handler handler) {
		super(handler);
		init();
	}

	public void init() {

		startBtn = new StartBtn(400, 200, 200, 100, "Empezar", handler);
		pointsBtn = new ScoreBtn(400, 300, 200, 100, "Puntuaciones mas altas", handler);
		exitBtn = new ExitBtn(400, 400, 200, 100, "salir", handler);

		
		startBtn.setEnabled(true);
		pointsBtn.setEnabled(true);
		exitBtn.setEnabled(true);
		

		select = 0;
		
		Assets.menuSong.play();

	}

	@Override
	public void tick() {

		switch (select) {

		case 0:
			startBtn.setPressed(true);
			pointsBtn.setPressed(false);
			exitBtn.setPressed(false);
			break;

		case 1:
			startBtn.setPressed(false);
			pointsBtn.setPressed(true);
			exitBtn.setPressed(false);
			break;

		case 2:
			startBtn.setPressed(false);
			pointsBtn.setPressed(false);
			exitBtn.setPressed(true);
			break;

		}

		if (handler.getKeyManager().down)
			select++;

		if (handler.getKeyManager().up)
			select--;

		if (select < 0)
			select = 0;
		if (select > 3)
			select = 3;

		try {
			Thread.sleep(80);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		if (startBtn.isPressed() && handler.getKeyManager().enter) {

			handler.getGame().setGameState(new GameState(handler));
			Player.setLife(1000);
			Player.setPoints(0);

			State.setState(handler.getGame().getGameState());
			Assets.menuSong.stop();
			Assets.themeSong.play();
			
			

		}
		if (pointsBtn.isPressed() && handler.getKeyManager().enter) {

			Player.setLife(1000);
			Player.setPoints(0);
			
			
			State.setState(handler.getGame().getLeaderBoardsState());

		}
		
		if (exitBtn.isPressed() && handler.getKeyManager().enter) {
			
			System.exit(0);

		}
		
		if(handler.getKeyManager().esc) {
			
			State.setState(handler.getGame().getHelpState());
		}
		

		

	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.menuBG, 0, 0, 1024, 600, null);
		g.drawImage(Assets.tittleBG, 200, 0, 600, 200, null);
		g.setFont(font);
		g.drawString("Preciona la tecla 'esc'", 700, 300);
		g.drawString("para obtener ayuda", 700, 350);
		
		startBtn.render(g);
		pointsBtn.render(g);
		exitBtn.render(g);

	}

}
