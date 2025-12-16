//Name: Arrune Nimalan
//Date: 12/9/2025
//Description: 
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
	}
	//methods:
	public void draw(Graphics g){
		g.setColor(Color.RED);
		g.fillOval(x, y, radius, radius);
	}
	public void move(){
		x += changeX;
		y += changeY;
	}
	public void reverseX(){
		changeX *= -1;	
	}
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