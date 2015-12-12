package com.mygdx.game;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by luisyoshida on 12/11/15.
 */
public class Icicle {

    // The icicle position
    Vector2 position;

    public Icicle(Vector2 position) {
        this.position = position;
    }

    public void render(ShapeRenderer renderer) {

        renderer.setColor(Constants.ICICLE_COLOR);

        renderer.set(ShapeRenderer.ShapeType.Filled);

        renderer.triangle(
            position.x, position.y,
            position.x - Constants.ICICLE_WIDTH/2, position.y + Constants.ICICLE_HEIGHT,
            position.x + Constants.ICICLE_WIDTH/2, position.y + Constants.ICICLE_HEIGHT
        );
    }
}
