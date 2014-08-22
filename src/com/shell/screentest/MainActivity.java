package com.shell.screentest;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class MainActivity extends AndroidApplication {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		AndroidApplicationConfiguration configuration = new AndroidApplicationConfiguration();
		configuration.useGLSurfaceView20API18 = true;
		configuration.useAccelerometer = false;
		configuration.useCompass = false;
		configuration.hideStatusBar = true;
		initialize(new MyGame(), configuration);

	}

}
