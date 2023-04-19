package com.mygdx.flappy;

import com.badlogic.gdx.graphics.Texture;

public class Pipe {
    private Texture pipeTexture = new Texture("pipe.jpg");
    private int topPipePos;
    private int bottomPipePos;
    public Texture getPipe(){
        return pipeTexture;
    }
}
