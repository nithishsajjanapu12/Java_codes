package com.fileio;
//WAP to create a file 
import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Main method started");
		File f = new File("C:\\Users\\nithi\\OneDrive\\Attachments\\Desktop\\Nithishk\\Aruna.txt");
		
		boolean isFileCreated = f.createNewFile();
		
		if(isFileCreated) {
			System.out.println("File Created Successfully !!");
		}
		else {
			System.out.println("Something went wrong !!");
		}
		System.out.println("Main method ended");
	}

}
