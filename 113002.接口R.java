package com.test;

public interface K {

	static void testa() {
		String boy_filePath = "img/boy.gif";
		String girt_filePath="img/girl.gif";
		int [][]array2d= {{1,2,3},{4,5,6}};
		
		System.out.println("boy_filePath:" + boy_filePath);
		System.out.println("girt_filePath:" + girt_filePath);
		
		
		for(int i[]:array2d) {
			for(int j : i) {
				System.out.print(j + ",");
			}
			
			System.out.print("");
		}
		
		
	}
}
