package com.mygdx.flappy;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;

public class Gameplay implements Screen {
    private final Flappy game;
    private final Sound jump;
    private Pipe pipe;
    private final Texture bg;
    private final Bird bird;
    private int score;
    public Gameplay(final Flappy game) {
        this.game = game;
        pipe = new Pipe();
        pipe.spawn();
        bird = new Bird();
        bg = new Texture("bird.jpg");
        jump = Gdx.audio.newSound(Gdx.files.internal("hit.mp3"));
    }
    @Override
    public void render(float delta) {
        score = pipe.getScore();
        ScreenUtils.clear(1, 0, 0, 1);
		game.batch.begin();
		game.batch.draw(bg,0,0,500, 900, 0, 1, 1, 0);
                game.batch.draw(pipe.getPipe(),pipe.getTopPipePos().x,pipe.getTopPipePos().y,120, pipe.getHeight().x, 0, 1, 1, 0);
                game.batch.draw(pipe.getPipe(),pipe.getBottomPipePos().x,pipe.getBottomPipePos().y,120, 900-pipe.getHeight().y,0, 1, 1, 0);
		game.batch.draw(bird.getBird(),30,bird.getHeight(),80, 80, 0, 1, 1, 0);
                game.font.draw(game.batch,String.valueOf(score),250,800);
		game.batch.end();
            handleInput();
            bird.render(delta);
            pipe.render(delta);
            checkStatus();
    }
    public void handleInput(){
        Gdx.input.setInputProcessor(new InputAdapter() {
            @Override
            public boolean keyDown(int keyCode) {
                if (keyCode == Input.Keys.SPACE) {
                    jump.play(0.5f);
                    bird.fly();
                }
                return true;
            }
        });
    }
    @Override
    public void resize(int width, int height) {
    }
    @Override
    public void show() {
    }
    @Override
    public void hide() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }
    @Override
    public void dispose() {
        bg.dispose();
        jump.dispose();
    }

    private void checkStatus() {
        if(bird.getHeight() <= -40){
            game.setScreen(new EndScreen(game));
            dispose();
        }
    }

}
