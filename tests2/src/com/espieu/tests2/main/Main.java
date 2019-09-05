package com.espieu.tests2.main;

import com.espieu.tests2.buisness.Draw; 
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println(sc1.nextLine());

		Scanner sc = new Scanner("Voici vos formes : ");
		System.out.print(" "+sc.next());
		Draw.pause(1000);
		System.out.print(" "+sc.next());
		Draw.pause(1000);
		System.out.print(" "+sc.next());
		Draw.pause(1000);
		System.out.print(" "+sc.next());
		Draw.pause(1000);
		System.out.println();
		
		Draw.setBordered(true);
		Draw.setAnimed(true);
		
		Draw.drawRect(11,10);
		System.out.println("\n");
		Draw.drawTriangle(10);

	}		
}

