package com.fileio;
import java.io.File;
public class FileDemo4 {

	public static void main(String[] args) {
		System.out.println("Main method started !!");
		
		File folder = new File("C:\\Users\\nithi\\OneDrive\\Attachments\\Desktop\\Divya");
		
		if(folder.exists()) {
			if(folder.delete()) {
				System.out.println("Folder Deleted Successfully !!!");
			}else {
			System.out.println("Failed to delete folder ( it may not be empty). ");
		    }
		}else {
			System.out.println("Folder does not exist. ");
		}
	}

}
