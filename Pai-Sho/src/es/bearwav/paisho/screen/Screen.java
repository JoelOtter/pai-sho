package es.bearwav.paisho.screen;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import es.bearwav.paisho.GdxGame;
import es.bearwav.paisho.Input;

public abstract class Screen {

	private int w;
	private int h;
	private SpriteBatch batch;
	private GdxGame game;

	public Screen(GdxGame game) {
		this.game = game;
		this.batch = new SpriteBatch(10);
	}

	public abstract void init(GdxGame game);

	public abstract void dispose();

	public abstract void tick(Input input);
	
	public abstract void render();

}
