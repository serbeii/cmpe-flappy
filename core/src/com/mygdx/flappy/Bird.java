package com.mygdx.flappy;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Bird {
    private static final int GRAVITY = -15;
    private Texture bird = new Texture("kus.png");
    private Vector2 velocity = new Vector2(0,0);
    private float height = 370;
    private Rectangle hitbox = new Rectangle(40, 450, 60, 60);
    private float rotation = 0;
    public float getHeight(){
        return height;
    }
    public  Texture getBird(){
        return bird;
    }
    public void fly(){
        velocity.y = 330;
    }
    public Rectangle birdHitbox(){
        return hitbox;
    }
    public void render(float delta){
        hitbox.y = height+10;
        rotation -= 60*delta;
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
        
    }
	public float getRotation() {
		return rotation;
	}
}
