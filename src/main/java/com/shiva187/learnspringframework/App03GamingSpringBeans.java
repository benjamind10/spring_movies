package com.shiva187.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shiva187.learnspringframework.game.GameRunner;
import com.shiva187.learnspringframework.game.GamingConsole;
import com.shiva187.learnspringframework.game.MarioGame;
import com.shiva187.learnspringframework.game.PacManGame;
import com.shiva187.learnspringframework.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
		}


	}

}
