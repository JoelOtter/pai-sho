package es.bearwav.paisho;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Pai-Sho";
		cfg.useGL20 = true;
		cfg.width = 480;
		cfg.height = 320;
		
		new LwjglApplication(new GdxGame(), cfg);
		
		int count = 0;
		for (int i = 0; i <= 18; i++) {
			for (int j = 0; j <= 18; j++) {
				if (Math.pow(i-9, 2) + Math.pow(j-9, 2) <= Math.pow(9, 2)) 
					count++;
			}
		}
		
		System.out.println(count);
	}
}
