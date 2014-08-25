package com.shell.screentest;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable;

public class GreenScreen implements Screen {

	private MyGame game;
	private Stage stage;
	private Group gameNode;

	private Image bg;
	private SpriteBatch batch;
	private int width, heigth;

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);

		this.stage.act(delta);
		this.stage.draw();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		this.game = (MyGame) Gdx.app.getApplicationListener();
		this.stage = this.game.stage;
		this.gameNode = this.game.gameNode;
		batch = new SpriteBatch();
		width = Gdx.graphics.getWidth();
		heigth = Gdx.graphics.getHeight();

		batch.setColor(Color.GREEN);
//		BaseDrawable drawable = new BaseDrawable();
//		drawable.draw(batch, 0, 0, width, heigth);
		
		Pixmap pixmap = new Pixmap(1, 1, Pixmap.Format.RGBA8888);
		pixmap.setColor( 0, 1, 0, 1.0f );
		pixmap.fillRectangle(0, 0, 1, 1);
		
		bg = new Image(new Texture(pixmap));
		pixmap.dispose();
		bg.setPosition(0, 0);
		bg.setBounds(0, 0, width, heigth);
		this.gameNode.addActor(bg);
		bg.addListener(new InputListener() {

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				System.out.println("wbzhang   --------------   GreenScreen touchDown");
				GreenScreen.this.game.setScreen(GreenScreen.this.game.screen3);
				return false;
			}

		});
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		this.gameNode.clear();
		dispose();
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		batch.dispose();
	}

}
