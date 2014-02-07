package es.bearwav.paisho;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;

import es.bearwav.paisho.screen.Screen;

public class GdxGame implements ApplicationListener {
	
	private Screen screen;
	private Input input;
	
	@Override
	public void create() {
		
	}

	@Override
	public void dispose() {
		screen.dispose();
	}

	@Override
	public void render() {		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		screen.tick(input);
		screen.render();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
