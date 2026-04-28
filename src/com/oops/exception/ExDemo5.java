package com.oops.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExDemo5 {

	public static void main(String[] args) throws FileNotFoundException,IOException,InterruptedException{
		File f = new File("D:\\HelloText.txt");
		FileReader fr = new FileReader(f);
		
		int a = fr.read();
		while(a != -1) {
			System.out.print((char) a);
			Thread.sleep(15);
			a = fr.read();
		}
	}

}
