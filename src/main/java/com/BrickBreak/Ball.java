//Name: Arrune Nimalan
//Date: 12/9/2025
//Description: This class represents the ball in the Brick Break game and uses several methods 
// to control its movement and appearance.
package com.BrickBreak;
import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int radius;
	private int changeX;
	private int changeY;
	//constructor(s):
	public Ball (int x, int y, int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
		changeX = 1;
		changeY = -2;
	}
	//methods:
	//Preconditon: Graphics g is not null
	//Postcondition: Draws the ball on the screen
	public void draw(Graphics g){
		g.setColor(Color.RED);
		g.fillOval(x, y, radius, radius);
	}
	//Precondition: None
	//Postcondition: Moves the ball based on its currenty velocity
	public void move(){
		x += changeX;
		y += changeY;
	}
	//Precondition: None
	//Postcondition: Reverses the ball in the x direction
	public void reverseX(){
		changeX *= -1;	
	}
	//Precondition: None
	//Postcondition: Reverses the ball in the y direction
	public void reverseY(){
		changeY *= -1;
	}
	public int getXpos(){
		return x;
	}
	public int getYpos(){
		return y;
	}
	public int getSize(){
		return radius;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	public void setXVelocity(int x){
		changeX = x;
	}
	public void setYVelocity(int y){
		changeY = y;
	}
}