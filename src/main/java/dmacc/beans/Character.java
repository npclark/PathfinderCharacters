/*
 * @author Noah Clark
 * CIS175 Fall 2022
 * Oct 22, 2022
 */

package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Character {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String ancestry;
	private String charaClass;
	private int level;
	@Autowired
	private Player player;
	
	public Character() {
		super();
	}
	public Character(String name, String ancestry, String charaClass, int level) {
		this.name = name;
		this.ancestry = ancestry;
		this.charaClass = charaClass;
		this.level = level;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAncestry() {
		return ancestry;
	}
	public void setAncestry(String ancestry) {
		this.ancestry = ancestry;
	}
	public String getCharaClass() {
		return charaClass;
	}
	public void setCharaClass(String charaClass) {
		this.charaClass = charaClass;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	@Override
	public String toString() {
		return "Character [id=" + id + ", name=" + name + ", ancestry=" + ancestry + ", charaClass=" + charaClass
				+ ", level=" + level + ", player=" + player + "]";
	}
}
