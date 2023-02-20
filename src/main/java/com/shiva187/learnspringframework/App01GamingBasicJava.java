package com.shiva187.learnspringframework;

import com.shiva187.learnspringframework.game.GameRunner;
import com.shiva187.learnspringframework.game.MarioGame;
import com.shiva187.learnspringframework.game.PacManGame;
import com.shiva187.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
//		var game = new MarioGame();
		var game = new PacManGame();
//		var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		
		gameRunner.run();

	}

}
