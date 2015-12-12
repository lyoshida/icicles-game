package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

import com.mygdx.game.Constants;

import java.awt.Color;
import java.lang.reflect.Array;

/**
 * Created by luisyoshida on 12/11/15.
 */
public class IciclesScreen implements Screen {


    ShapeRenderer renderer;
    ExtendViewport viewport;
    Icicle icicle;


    @Override
    public void show() {
        viewport = new ExtendViewport(Constants.WORLD_WIDTH, Constants.WORLD_HEIGTH);
        renderer = new ShapeRenderer();

        renderer.setAutoShapeType(true);

        icicle = new Icicle(new Vector2(Constants.WORLD_WIDTH/2, Constants.WORLD_HEIGTH/2));
    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(0, 0, 1, 1);
        Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);



        renderer.setProjectionMatrix(viewport.getCamera().combined);

        renderer.begin();

        renderer.set(ShapeRenderer.ShapeType.Filled);
        icicle.render(renderer);

        renderer.end();

    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height, true);
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
        renderer.dispose();

    }
}
