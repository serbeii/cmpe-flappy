package com.mygdx.flappy;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Bird {
    private static final int GRAVITY = -15;
    private Texture bird = new Texture("kus.png");
    private Sprite birdSprite = new Sprite(bird);
    private Vector2 velocity = new Vector2(0,0);
    private float height = 370;
    private Rectangle hitbox = new Rectangle(40, 450, 60, 60);
    private float rotation = 0;
    public float getHeight(){
        return height;
    }
    public  Sprite getBird(){
        return birdSprite;
    }
    public void fly(){
        velocity.y = 330;
        rotation +=20; // Rotate bird downwards (clockwise)
    }
    public Rectangle birdHitbox(){
        return hitbox;
    }
    public void render(float delta){
        hitbox.y = height+10;
       // rotation -= 60*delta;
        if (height > -40){
            velocity.add(0,GRAVITY);
        }
        // else if might work
        if (height > 860){
            height = 860;
            velocity.y = 0;
        }
        velocity.scl(delta);
        height += velocity.y;
        velocity.scl(1/delta);
        
        if (velocity.y<0) {
		    rotation += -70*delta; // Rotate bird upwards (counter-clockwise)
		} 
        if(rotation<-90) {
        	rotation = -90;
        }
        else if(rotation >45) {
        	rotation = 45;
        }
        birdSprite.setPosition(30 , height);
        birdSprite.setRotation(rotation);
        
    }
	public float getRotation() {
		return rotation;
	}
	public Texture getBirdTexture() {
		return bird;
	}
	
}
