package com.mygdx.game.Screens;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.World;



public class GameScreen extends GenericScreen {

    public SpriteBatch spriteBatch;

    public OrthographicCamera camera;
    public Viewport viewport;

    public int SCENE_WIDTH = 480;
    public int SCENE_HEIGHT = 270;

    World world;


    public GameScreen(MyGdxGame game) {
        super(game);
    }

    @Override
    public void show() {
        camera = new OrthographicCamera();
        camera.position.set(SCENE_WIDTH/2, SCENE_HEIGHT/2, 0);
        viewport = new FitViewport(SCENE_WIDTH, SCENE_HEIGHT, camera);
        viewport.apply();

        spriteBatch = new SpriteBatch();

        world = new World(SCENE_WIDTH, SCENE_HEIGHT);

    }

    @Override
    public void render(float delta) {
        spriteBatch.setProjectionMatrix(camera.combined);



        world.render(delta, spriteBatch, assets);

    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);

        viewport.update(width,height);
    }
}
