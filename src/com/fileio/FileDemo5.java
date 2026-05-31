package com.fileio;

import java.io.File;
import java.io.IOException;

public class FileDemo5 {

	public static void main(String[] args) throws IOException {
		System.out.println("Main method started");
		File f = new File("D:\\batch 68\\snk.txt");
		File f1 = new File("D:\\batch 68\\divya.txt");
		File f2 = new File("D:\\batch 68\\snk.txt");
		
		if(!f.exists()) {
			f.createNewFile();
		}
		if(!f1.exists()) {
			f1.createNewFile();
		}
//		f.delete();
		System.out.println("Absolute Path : "+f.getAbsolutePath());//returns path
		System.out.println("AbsoluteFile : "+f.getAbsoluteFile());//returns path
		System.out.println("Free Space : " +f.getFreeSpace());// returns free space available 
		System.out.println("equals : "+f.equals(f2));//returns true when both files path with file name must be same
		System.out.println("getName : "+ f.getName());
		System.out.println("getParent : "+f.getParent());
		System.out.println("get Path : "+f.getPath());//returns path
		System.out.println("getTotalSpace : "+f.getTotalSpace());
		System.out.println("getUsableSpace : "+f.getUsableSpace());
		System.out.println("Hashcode : "+f.hashCode());
		System.out.println("isAbsolute : "+f1.isAbsolute());
		System.out.println("isDirectory : "+f1.isDirectory());
		System.out.println("isHidden : "+f1.isHidden());
		System.out.println("lastModified : "+f.lastModified());
		System.out.println("length : "+f.length());
		System.out.println("isFile : "+f1.isFile());
		
		
	}

}
