package com.mygdx.flappy;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import java.util.Random;

public class Pipe {
    private final Texture pipeTexture = new Texture("pipe.jpg");
    private Vector2 topPipePos = new Vector2(300, 0);
    private Vector2 bottomPipePos = new Vector2(300, 550);
    private Vector2 pipeMouth = new Vector2();
    private int xPos = 600;
    private final int minOpening = 160;
    private Random rand = new Random();
    private int score = 0;
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
    private void spawn(){
        int opening = minOpening + rand.nextInt(50);
        int mouth = rand.nextInt(450);
        pipeMouth.x = mouth;
        pipeMouth.y = mouth+opening;
    }
    public Vector2 getHeight(){
        return pipeMouth;
    }
    public void render(float delta){
        if(xPos > -120) {
        xPos -= 5;
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
