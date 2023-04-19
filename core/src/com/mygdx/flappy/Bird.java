package com.mygdx.flappy;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class Bird {
    private static final int GRAVITY = -15;
    private Texture bird = new Texture("owl.jpg");
    private Vector2 velocity = new Vector2(0,0);
    private float height = 370;
    public float getHeight(){
        return height;
    }
    public  Texture getBird(){
        return bird;
    }
    public void fly(){
        velocity.y = 330;
    }
    public void render(float delta){
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
}
