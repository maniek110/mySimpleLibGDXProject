package com.mygdx.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.io.File;

public class HelloWorld implements ApplicationListener {

    private SpriteBatch spriteBatch;
    private Sprite sprite;
    private Texture textura;
    private Texture[] texture;
    private Animation<Texture> animation;
    float time;

    @Override
    public void create() {
        int x=new File("Resources\\Jungle Asset Pack\\Character\\sprites\\run\\").listFiles().length;
        texture=new Texture[x];
        for(int i=0;i<x;i++){
            texture[i]=new Texture("Resources\\Jungle Asset Pack\\Character\\sprites\\run\\run_"+i+".png");
        }
        time=0;
        sprite=new Sprite(texture[4]);
        animation=new Animation<Texture>(0.125f,texture);
        spriteBatch=new SpriteBatch();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(10);
        time+=Gdx.graphics.getDeltaTime();
        spriteBatch.begin();
        spriteBatch.draw(animation.getKeyFrame(time,true),100,100);
        Gdx.gl.glClear(10);
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

    }
}
