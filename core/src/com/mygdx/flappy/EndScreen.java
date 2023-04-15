package com.mygdx.flappy;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Screen;

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
                    game.setScreen(new Gameplay(game));
                }
                return true;
            }
        });
    }
    public void render(){
        game.batch.begin();
        game.batch.draw(bird.getBird(), 0, 0, 500, 900, 0, 0, 0, 0, true, true);
        game.batch.end();
    }

    @Override
    public void render(float delta) {

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

