package Searching;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class c_chain {
	public static void main(String[] args) throws IOException {
		
	
	File f1=new File("C:\\Users\\HP\\Desktop\\hello\\h.txt");
	
	if(f1.createNewFile())
	{
		System.out.println("file is created");
	}

	FileReader f2=new FileReader(f1);
	char ch[]=new char[(int ) f1.length()];
	f2.read(ch);
	for (int i = 0; i < ch.length; i++) {
		System.out.print(ch[i]);
	}System.out.println();
	
	String s1=new String(ch);
	System.out.println(s1);
	}
	
}
