package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.Array;

public class HelloWorld extends ApplicationAdapter {

    private SpriteBatch spriteBatch;
    private Sprite sprite;
    private TextureAtlas textureAtlas;
    private Array<TextureAtlas.AtlasRegion> frames;
    private Animation animation;


    @Override
    public void create() {
        System.out.println(Gdx.files.getLocalStoragePath());
        //textureAtlas=new TextureAtlas(Gdx.files.internal("Resources\\Jungle Asset Pack\\Character\\sprites\\run\\run.atlas"));
        //TextureAtlas.AtlasRegion region=textureAtlas.findRegion("0");
        //frames=textureAtlas.findRegions("run");
        spriteBatch=new SpriteBatch();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void render() {
        Texture texture=new Texture(Gdx.files.internal("Resources\\run\\0002.png"));
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(10);
        spriteBatch.begin();
        sprite=new Sprite(texture);
        sprite.draw(spriteBatch);
        //animation=new Animation(8,frames, Animation.PlayMode.LOOP);
        spriteBatch.end();
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {
        spriteBatch.dispose();
        textureAtlas.dispose();
    }
}
