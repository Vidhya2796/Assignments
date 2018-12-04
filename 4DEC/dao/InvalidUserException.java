package com.vidhyac.dao;

public class InvalidUserException extends RuntimeException {
	public InvalidUserException(String msg){
		super(msg);
	}
}
