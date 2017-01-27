package com.ran;

public class Primitive {

	public void printPrimitive(int upToNumber) {

		for(int j=2;j<=upToNumber;j++) {
			boolean isPrimitive = true;
			for(int i=2;i<j;i++) {
				int module = j % i;
				if(module == 0) {
					isPrimitive = false;
					break;
				}
			}

			if(isPrimitive == true) {
				System.out.print(j + " ");
			}
		}
	}
}
