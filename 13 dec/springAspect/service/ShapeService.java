package com.vidhyac.spring.service;

import com.vidhyac.spring.model.Circle;
import com.vidhyac.spring.model.Triangle;

public class ShapeService {
	//circle and triangle are the member variables of ShapeService class
	private Circle circle;
	private Triangle triangle;
	
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	
}
