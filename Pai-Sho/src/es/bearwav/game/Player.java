package es.bearwav.game;

import java.util.ArrayList;

import es.bearwav.game.tiles.*;

public class Player {
	private ArrayList<Tile> tiles;
	
	public Player() {
		tiles = new ArrayList<Tile>();
		addTiles(3, "dragon");
		addTiles(3, "lotus");
		addTiles(6, "jasmine");
		addTiles(6, "lily");
		addTiles(6, "rose");
		addTiles(6, "jade");
		addTiles(6, "rhododendron");
		addTiles(6, "chrysanthemum");
		addTiles(3, "knotweed");
		addTiles(3, "wheel");
		addTiles(3, "rock");
		addTiles(3, "boat");
	}
	
	private void addTiles(int i, String type){
		for (int j = 0; j < i; j++) {
			if (type.equals("dragon")) tiles.add(new Dragon());
			else if (type.equals("lotus")) tiles.add(new Lotus());
			else if (type.equals("wheel")) tiles.add(new Wheel());
			else if (type.equals("boat")) tiles.add(new Boat());
			else if (type.equals("rock")) tiles.add(new Rock());
			else if (type.equals("knotweed")) tiles.add(new Knotweed());
			else if (type.equals("jasmine")) tiles.add(new Jasmine());
			else if (type.equals("lily")) tiles.add(new Lily());
			else if (type.equals("jade")) tiles.add(new Jade());
			else if (type.equals("rose")) tiles.add(new Rose());
			else if (type.equals("chrysanthemum")) tiles.add(new Chrysanthemum());
			else if (type.equals("rhododendron")) tiles.add(new Rhododendron());
		}
	}
	
	public String toString() {
		String output = "----------sss\n";
		for (Tile t : tiles) {
			output += t.toString() + "\n";
		}
		output += "----------" ;
		return output;
	}
}
