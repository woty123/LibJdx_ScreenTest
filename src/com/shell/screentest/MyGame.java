package com.shell.screentest;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class MyGame extends Game {

	public Stage stage;
	public Group gameNode;
	public AssetManager manager;
	
	public RedScreen screen1;
	public GreenScreen screen2;
	public BlueScreen screen3;

	@Override
	public void create() {
		// TODO Auto-generated method stub
		if (this.stage != null)
			return;
		stage = new Stage();
		stage.getRoot().setTransform(false);
		Gdx.input.setInputProcessor(stage);
		gameNode = new Group();
		this.stage.addActor(gameNode);
		manager = new AssetManager();
		
		screen1 = new RedScreen();
		screen2 = new GreenScreen();
		screen3 = new BlueScreen();
		
		this.setScreen(screen1);
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		super.dispose();
		stage.dispose();
		manager.dispose();

	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		super.render();
	}

}
