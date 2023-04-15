package com.mygdx.flappy;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.utils.ScreenUtils;

public class Flappy extends Game {
	public SpriteBatch batch;
        public BitmapFont font;
	//public Texture owl;
        public Texture bg;
        //public Texture pipe;
	@Override
	public void create () {
		batch = new SpriteBatch();
                font = new BitmapFont();
                bg = new Texture("bird.jpg");
                this.setScreen(new MainMenuScreen(this));
	}
        

	@Override
	public void render () {
		super.render();
	}
	
	
	@Override
	public void dispose () {
		batch.dispose();
                bg.dispose();
                font.dispose();
	}
}
