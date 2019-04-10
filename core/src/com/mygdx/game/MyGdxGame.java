package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.mygdx.game.Screens.GameScreen;
import com.mygdx.game.Screens.LoadingScreen;

public class MyGdxGame extends Game {

	public Assets assets;
	
	@Override
	public void create () {
		assets = new Assets();
		assets.load();

		setScreen(new LoadingScreen(this));


		Gamepad gamepad = new Gamepad();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		super.render();

	}

}
