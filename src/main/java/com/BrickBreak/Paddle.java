//Name: Arrune Nimalan
//Date: 12/16/2025
//Description: This class controls the paddle which the user uses to hit the ball back up and hit the bricks. It uses several methods to control its movement and appearance.
package com.BrickBreak;

import java.awt.Graphics;
import java.awt.*;

public class Paddle {


	//your code here!


	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int width;
	private int height;
	private int velocity;
	//constructor(s):
	public Paddle (int x, int y, int width, int velocity){
		this.x = x;
		this.y = y;
		this.width = width;
		this.velocity = velocity;
	}
	//methods:
	public void draw(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);
	}
	public void move(){
		x += velocity;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	} 
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	public int getVelocity(){
		return velocity;
	}
	public int setX(int x){
		this.x = x;
		return x;
	}
	public int setVelocity(int velocity){
		this.velocity = velocity;
		return velocity;
	}
	public int addVelocity(int velocity){
		this.velocity += velocity;
		return velocity;
	}
}