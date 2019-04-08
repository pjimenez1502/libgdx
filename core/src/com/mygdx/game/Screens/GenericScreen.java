package com.mygdx.game.Screens;

import com.badlogic.gdx.Screen;
import com.mygdx.game.Assets;
import com.mygdx.game.MyGdxGame;

public class GenericScreen implements Screen {

    MyGdxGame game;
    Assets assets;

    public GenericScreen(MyGdxGame game){
        this.game = game;
        this.assets = game.assets;
    }

    void setScreen(Screen screen){
        game.setScreen(screen);
    }

    @Override
    public void show() {

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
