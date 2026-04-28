package com.fileio;

//WAP to create a folder and at the same time create a file inside it
import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started ");

		File f = new File("C:\\Users\\nithi\\OneDrive\\Attachments\\Desktop\\Nithishk");

		boolean isDirectoryCreated = f.mkdir();

		if (isDirectoryCreated) {
			System.out.println("Directory Created Successfully !!");

			File f1 = new File(f, "LaharikaS");
			boolean isFileCreated = f1.createNewFile();

			if (isFileCreated) {
				System.out.println("File is also created in your created folder Successfully !!");
			}
		}

		System.out.println("Main method ended");
	}

}
