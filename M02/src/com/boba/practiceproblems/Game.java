package com.boba.practiceproblems;

import java.util.ArrayList;
import java.util.List;

public class Game {
	
	private List<Level> levels;

	public Game() {
		// Initialize levels
		
		levels = new ArrayList<Level>();
		levels.add(new Level1());
		levels.add(new Level2());
	}
	
	public void play() {
		// Go through each level in order and play it.
		for (Level l : levels) {
			l.play();	// we must declare a play() over in the interface
		}
	}

	// Straight away, we can create a new game with levels without really writing any code
	public static void main(String[] args) {
		Game g = new Game();
		g.play();
	}

}
