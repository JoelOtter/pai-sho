package es.bearwav.game;

import java.util.ArrayList;

public class Game {

	private Player playerOne;
	private Player playerTwo;
	private Board board;
	private ArrayList<Tile> pot;
	
	public Game() {
		board = new Board();
		playerOne = new Player();
		playerTwo = new Player();
		System.out.println(playerOne);
		pot = new ArrayList<Tile>();
	}
}
