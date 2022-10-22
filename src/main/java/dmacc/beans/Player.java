/*
 * @author Noah Clark
 * CIS175 Fall 2022
 * Oct 22, 2022
 */

package dmacc.beans;

public class Player {
	private String name;
	private String phone;
	
	public Player() {
		super();
	}
	public Player(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", phone=" + phone + "]";
	}
}
