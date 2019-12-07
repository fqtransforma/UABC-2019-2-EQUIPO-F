package logic.entity.dynamicEntities;

import java.awt.Graphics;

import logic.entity.DynamicEntity;
import logic.entity.Player;
import logic.graphicsTools.Assets;
import logic.launcher.Handler;

public class RockPinch extends DynamicEntity{
	
	private int hurt;
	private float speed;
	private int radius;
	private float aux1, aux2;
	
	public RockPinch(Handler handler, float x, float y, int width, int height, float speed, int radius) {
		super(handler, x, y, width, height);
		
		aux1 = x;
		aux2 = y;
		this.speed = speed;//Pongo velocidad de la entity
		this.radius = radius;
		hurt = 5;
	}
	public RockPinch(Handler handler, float x, float y, int width, int height, float speed, int radius, float angle) {
		super(handler, x, y, width, height);
		
		aux1 = x;
		aux2 = y;
		this.speed = speed;//Pongo velocidad de la entity
		this.radius = radius;
		hurt = 20;
		this.angle = angle;
	}

	@Override
	public void tick() {
		
		if(handler.getWorld().getPlayer().getCollisionsBounds(handler.getWorld().getPlayer().getxMove(), 
				handler.getWorld().getPlayer().getyMove()).intersects(this.getCollisionsBounds(0, 0))) {
			
			Player.setLife(Player.getLife() - hurt);
			
		}
		circularMove(radius, speed);
		x+=aux1;
		y+=aux2;

	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.rockPinch, (int)(x), (int)(y), width, height, null);
		
	}
	@Override
	public boolean noHurt() {
		
		return true;
	}
	
	
	
}
