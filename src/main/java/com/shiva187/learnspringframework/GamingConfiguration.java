package com.shiva187.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.shiva187.learnspringframework.game.GameRunner;
import com.shiva187.learnspringframework.game.GamingConsole;
import com.shiva187.learnspringframework.game.PacManGame;

@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole game() {
		var game = new PacManGame();
		return game;
	}
	
//	var game = new MarioGame();

//	var game = new SuperContraGame();
//	var gameRunner = new GameRunner(game);
//	
//	gameRunner.run();

}
