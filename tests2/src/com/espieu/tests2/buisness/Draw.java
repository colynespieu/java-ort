package com.espieu.tests2.buisness;

public class Draw {
	static boolean bordered = false;
	static boolean animated = false;
	
	public static void setBordered(boolean border) {
		bordered = border;
	}
	
	public static void setAnimed(boolean animed) {
		animated = animed;
	}
	
	public static void pause(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static  void drawRect(int weight, int height){
		for (int i = 0; i < weight;i++ ) {
			for (int y = 0; y < height;y++) {
				if (bordered && (i == 0 || i == weight-1 || y == 0 || y == height-1 )) {
						System.out.print("# ");
				}
				else {
					System.out.print(". ");
				}
				if (animated) {
					pause(10);
				}
			}
			System.out.print("\n");
		}
	}
	
	public static void drawTriangle(int weight){
		for (int i = 0; i < weight; i++) {
			for (int z = 0;z < i;z++) {
				if (bordered == true && (z ==0 || i == weight-1 || z ==i-1 )){
					System.out.print("# ");
				}
				else {
					System.out.print(". ");
				}
				if (animated) {
					pause(10);
				}
			}
		System.out.print("\n");
		}
	
	}
}
