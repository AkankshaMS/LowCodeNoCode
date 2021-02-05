package com.app;

import com.annotation.Setter;
class Samp{
	public int id;
	public void greet() {
		System.out.println("Heeloo");
	}
}

public class Main {
	
    public static void main(String[] args) {
    	Samp s = new Samp();
    	s.greet();
    	
    }
}
