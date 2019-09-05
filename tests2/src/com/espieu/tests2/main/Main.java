package com.espieu.tests2.main;

import com.espieu.tests2.buisness.Draw;

public class Main {
	
	public static void main(String[] args) {
		
		Draw.setBordered(true);
		Draw.setAnimed(true);
		Draw.drawRect(11,10);
		System.out.println("\n");
		Draw.drawTriangle(10);

	}
		
}
		
	

