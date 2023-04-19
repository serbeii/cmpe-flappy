package com.mygdx.flappy;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import java.util.Random;

public class Pipe {
    private Texture pipeTexture = new Texture("pipe.jpg");
    private Vector2 topPipePos = new Vector2(300, 0);
    private Vector2 bottomPipePos = new Vector2(300, 550);  
    private final int minOpening = 160;
    private Random rand = new Random();
    public Texture getPipe(){
        return pipeTexture;
    }
    public Vector2 getTopPipePos(){
        return topPipePos;
    }
    public Vector2 getBottomPipePos(){
        return bottomPipePos;
    }
    public void render(float delta){
        
    }
}
