package com.ran;

import com.duplicate.DuplicateNumber;

public class Application {

	public static void main(String[] args) {
		DuplicateNumber duplicateNumber = new DuplicateNumber();
		int i = duplicateNumber.getDuplicate();
		System.out.println(i);
	}
}
