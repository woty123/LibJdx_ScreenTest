package com.shell.screentest;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class MyGame extends Game {

	public Stage stage;
	public AssetManager manager;

	@Override
	public void create() {
		// TODO Auto-generated method stub
		stage = new Stage();
		manager = new AssetManager();
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
