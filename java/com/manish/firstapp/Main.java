package com.manish.firstapp;

import org.apache.log4j.Logger;

public class Main {

	public static void main(String[] args) {
		System.out.println("Manish");
		final Logger log = Logger.getLogger(Main.class);
		log.debug("Logger Startrd");
		log.error("Logger Startrd");
	}

}
