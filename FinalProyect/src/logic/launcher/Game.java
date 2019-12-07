/*
* LITTLE CLEANER 1.0
* APLICACIÓN DE ESCRITORIO EN JAVA: VIDEOJUEGO INTERACTIVO CON TEMÁTICA EDUCATIVA
* AUTORES: CASTAÑON PUGA MANUEL, MONTOYA VALDIVIA OMAR ANTONIO, LÓPEZ MORENO NEREO CESAR
* CORREO ELECTRONICO : {puga, montoya.omar, nereo.lopez}@uabc.edu.mx
* UNIVERSIDAD AUTÓNOMA DE BAJA CALIFORNIA
* http://www.uabc.mx
*/

package logic.launcher;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import logic.graphicsTools.Assets;
import logic.inputDevices.KeyManager;
import logic.utils.FileIO;
import ui.display.Display;
import ui.states.GameOverState;
import ui.states.GameState;
import ui.states.HelpState;
import ui.states.LeaderBoardsState;
import ui.states.MenuState;
import ui.states.State;

public class Game implements Runnable {

	private Display display;
	public int width, height;
	public String title;

	private boolean running = false;
	private Thread thread;

	private BufferStrategy bs;
	private Graphics g;

	// threads

	// States
	private State gameState;
	private State menuState;
	private State gameOverState;
	private State leaderBoardsState;
	private State helpState;

	// input devices
	private KeyManager keyManager;

	// input managers
	private Handler handler;

	public Game(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
		
	}

	private void init() {
		
		FileIO.init();
		FileIO.readFile(".\\src\\Scores");

		display = new Display(title, width, height);
		keyManager = new KeyManager();

		display.getFrame().addKeyListener(keyManager);
		Assets.init();
		handler = new Handler(this);

		gameState = new GameState(handler);
		menuState = new MenuState(handler);
		gameOverState = new GameOverState(handler);
		leaderBoardsState = new LeaderBoardsState(handler);
		helpState = new HelpState(handler);
		
		State.setState(menuState);
	}

	private void tick() {
		keyManager.tick();

		if (State.getState() != null)
			State.getState().tick();
	}

	private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if (bs == null) {
			display.getCanvas().createBufferStrategy(2);
			return;
		}
		g = bs.getDrawGraphics();
		// Clear Screen
		g.clearRect(0, 0, width, height);
		// Draw Here!

		if (State.getState() != null)
			State.getState().render(g);

		// End Drawing!
		bs.show();
		g.dispose();
	}

	public void run() {

		init();

		int fps = 60;
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;

		while (running) {
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;

			if (delta >= 1) {
				tick();
				render();
				ticks++;
				delta--;
			}

			if (timer >= 1000000000) {
				// System.out.println("Ticks and Frames: " + ticks);
				ticks = 0;
				timer = 0;
			}
		}

		stop();

	}

	public synchronized void start() {
		if (running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}

	public synchronized void stop() {
		if (!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public KeyManager getKeyManager() {
		return keyManager;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public State getGameState() {
		return gameState;
	}

	public void setGameState(State gameState) {
		this.gameState = gameState;
	}

	public State getMenuState() {
		return menuState;
	}

	public void setMenuState(State menuState) {
		this.menuState = menuState;
	}

	public State getGameOverState() {
		return gameOverState;
	}

	public void setGameOverState(State gameOverState) {
		this.gameOverState = gameOverState;
	}

	public State getLeaderBoardsState() {
		return leaderBoardsState;
	}

	public void setLeaderBoardsState(State leaderBoardsState) {
		this.leaderBoardsState = leaderBoardsState;
	}

	public State getHelpState() {
		return helpState;
	}

	public void setHelpState(State helpState) {
		this.helpState = helpState;
	}
	

}
