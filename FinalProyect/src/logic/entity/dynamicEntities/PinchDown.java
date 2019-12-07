package logic.entity.dynamicEntities;

import java.awt.Graphics;

import logic.entity.DynamicEntity;
import logic.entity.Player;
import logic.graphicsTools.Assets;
import logic.launcher.Handler;

public class PinchDown extends DynamicEntity {

	
	private int hurt = 5;
	private int minDown, maxDown, velocity;
	
	public PinchDown(Handler handler, float x, float y, int width, int height,int minDown, int maxDown, int velocity) {
		super(handler, x, y, width, height);

		this.maxDown = minDown;
		this.maxDown = maxDown;
		this.velocity = velocity;
	}

	@Override
	public void tick() {
		
		if(handler.getWorld().getPlayer().getCollisionsBounds(handler.getWorld().getPlayer().getxMove(), 
				handler.getWorld().getPlayer().getyMove()).intersects(this.getCollisionsBounds(0, 0))) {
			
			Player.setLife(Player.getLife() - hurt);
			
		}
		
			upDownMove(maxDown, minDown, velocity);

	}

	@Override
	public void render(Graphics g) {
		
		g.drawImage(Assets.rockPinch, (int)x, (int)y, width, height, null);
	}
	
	

	

}
