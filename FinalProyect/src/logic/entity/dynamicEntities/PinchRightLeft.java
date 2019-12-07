package logic.entity.dynamicEntities;

import java.awt.Graphics;

import logic.entity.DynamicEntity;
import logic.entity.Player;
import logic.graphicsTools.Assets;
import logic.launcher.Handler;

public class PinchRightLeft extends DynamicEntity{

	private int hurt = 5;
	private int limitX0, limitX1, speed;
	
	public PinchRightLeft(Handler handler, float x, float y, int width, int height, int limitX0, int limitX1, int speed) {
		super(handler, x, y, width, height);
		
		this.limitX0 = limitX0;
		this.limitX1 = limitX1;
		this.speed = speed;
	}
	@Override
	public void tick() {
		
		if(handler.getWorld().getPlayer().getCollisionsBounds(handler.getWorld().getPlayer().getxMove(), 
				handler.getWorld().getPlayer().getyMove()).intersects(this.getCollisionsBounds(0, 0))) {
			
			Player.setLife(Player.getLife() - hurt);
			
		}
		
		this.leftRightMove(limitX0, limitX1, speed);
			

	}

	@Override
	public void render(Graphics g) {
		
		g.drawImage(Assets.rockPinch, (int)x, (int)y, width, height, null);
	}


}
