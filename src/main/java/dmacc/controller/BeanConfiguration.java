/*
 * @author Noah Clark
 * CIS175 Fall 2022
 * Oct 22, 2022
 */

package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Character;
import dmacc.beans.Player;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Player player() {
		Player bean = new Player("Noah", "555-555-5552");
		return bean;
	}
	
	@Bean
	public Character character() {
		Character bean = new Character("Amiri", "Human", "Barbarian", 7);
		return bean;
	}
}
