/*
 * @author Noah Clark
 * CIS175 Fall 2022
 * Oct 22, 2022
 */

package dmacc;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Character;
import dmacc.beans.Player;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.CharacterRepository;

@SpringBootApplication
public class PathfinderCharactersApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PathfinderCharactersApplication.class, args);
	}
	
	@Autowired
	CharacterRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Character c = appContext.getBean("character", Character.class);
		repo.save(c);
		
		Character d = new Character("Droven", "Half-orc", "Inventor", 6);
		Player p = new Player("June", "555-5555-557");
		d.setPlayer(p);
		repo.save(d);
		
		List<Character> allCharacters = repo.findAll();
		for(Character hero: allCharacters) {
			System.out.println(hero.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}

}
