package com.mygdx.flappy;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.utils.ScreenUtils;

public class EndScreen implements Screen{
    final Flappy game;
    private Bird bird;
    public EndScreen(final Flappy game){
        this.game = game;
        bird = new Bird();
    }
    @Override
    public void show(){
        Gdx.input.setInputProcessor(new InputAdapter() {
            @Override
            public boolean keyDown(int keyCode) {
                if (keyCode == Input.Keys.SPACE) {
                    game.setScreen(new MainMenuScreen(game));
                }
                return true;
            }
        });
    }
    @Override
    public void render(float delta){
        ScreenUtils.clear(0, 0, 0.2f, 1);
        game.batch.begin();
        game.batch.draw(bird.getBird(), 0, 0, 500, 900, 0, 1, 1, 0);
        game.font.draw(game.batch, "You lose. ", 100, 150);
        game.font.draw(game.batch, "Press spacebar to go back to the main screen.", 100, 100);
        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {
 
    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        
    }   
    
}

