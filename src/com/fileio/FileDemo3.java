package com.fileio;

import java.io.File;

//WAP to delete() a file  
public class FileDemo3 {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\nithi\\OneDrive\\Attachments\\Desktop\\Nithishk\\Aruna.txt");
		
		boolean isFileDeleted = f.delete();
		
		if(isFileDeleted) {
			System.out.println("File is Deleted Successfully !!");
		}else {
			System.out.println("OOPS !! Something went wrong ");
		}
		
		
	}

}
