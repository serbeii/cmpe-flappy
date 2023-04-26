package com.mygdx.flappy;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class Flappy extends Game {
	public SpriteBatch batch;
        public BitmapFont font;
        public OrthographicCamera camera;
        public static Viewport viewport;
	//public Texture owl;
        
        //public Texture pipe;
	@Override
	public void create () {
		batch = new SpriteBatch();
                font = new BitmapFont();
                camera = new OrthographicCamera(500, 900);
                camera.translate(camera.viewportWidth/2,camera.viewportHeight/2);
                viewport = new FitViewport(500, 900,camera);
                viewport.apply();
                this.setScreen(new MainMenuScreen(this));
	}
        

	@Override
	public void render () {
		super.render();
	}
	
	
	@Override
	public void dispose () {
		batch.dispose();
                font.dispose();
	}
}
