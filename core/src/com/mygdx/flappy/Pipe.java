package com.mygdx.flappy;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import java.util.Random;

public class Pipe {
    private final Texture pipeTexture = new Texture("pipe.jpg");
    private Vector2 topPipePos = new Vector2(300, 550);
    private Vector2 bottomPipePos = new Vector2(300, 0);
    private Vector2 pipeMouth = new Vector2();
    private Rectangle topPipe = new Rectangle(300, 0, 120, 240);
    private Rectangle bottomPipe = new Rectangle(300,0,120,350);
    private int xPos = 600;
    private final int minOpening = 160;
    private Random rand = new Random();
    private int score = 0;
    public Rectangle topPipeHit(){
    return topPipe;
}
    public Rectangle bottomPipeHit(){
        return bottomPipe;
    }
    public Texture getPipe(){
        return pipeTexture;
    }
    public Vector2 getTopPipePos(){
        return topPipePos;
    }
    public Vector2 getBottomPipePos(){
        return bottomPipePos;
    }
    public int getScore(){
        return score;
    }
    public void spawn(){
        int opening = minOpening + rand.nextInt(101);
        int mouth = rand.nextInt(300)+100;
        topPipePos.y = mouth+opening;
        topPipe.height = 900 - topPipePos.y;
        pipeMouth.x = mouth;
        topPipe.y = topPipePos.y;    
        pipeMouth.y = mouth+opening;
        bottomPipe.height = mouth;
    }
    public Vector2 getHeight(){
        return pipeMouth;
    }
    public void render(float delta){
        
        if(xPos > -120) {
        xPos -= 5;
        topPipe.x = xPos;
        bottomPipe.x = xPos;
        topPipePos.x = xPos;
        bottomPipePos.x = xPos;
        }
        else{
            spawn();
            xPos = 600;
        }
        if(xPos == 20) score ++;
    }
}
