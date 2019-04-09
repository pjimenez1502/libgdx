package com.mygdx.game.Screens;

import com.mygdx.game.MyGdxGame;

public class LoadingScreen extends GenericScreen {

    public LoadingScreen(MyGdxGame game) {
        super(game);
    }

    @Override
    public void render(float delta) {
        if (!assets.update()){
            return;
        }
        setScreen(new GameScreen(game));

    }
}
