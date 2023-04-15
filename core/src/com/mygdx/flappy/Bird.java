package com.mygdx.flappy;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

public class Bird {
    private static final int GRAVITY = -15;
    private Texture bird = new Texture("owl.jpg");
    private Vector3 velocity = new Vector3(0,0,0);
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
        if (height > -10){
            velocity.add(0,GRAVITY,0);
        }
        velocity.scl(delta);
        height += velocity.y;
        velocity.scl(1/delta);
        if (height < -10){
            height = 0;
        }
    }
}
