package assisted.practice.project;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project {
	//Add File
	public static void genaretFile(String fileName) throws IOException 
	{
		String filePath="D:\\Project\\";
		ArrayList<String> al=new ArrayList<String>();
		
		
		String finalname=filePath+fileName;
		
		File f=new File(finalname);
		boolean b=f.createNewFile();
		if(b!=true) 
		{
			System.out.println("The file not created");
		}
		else 
		{
			al.add(fileName);
			System.out.println("Your file is created");
		}
		
		System.out.println("Your list of file is "+al);
	}
	
	//Delete File
	public static void deleteFile(String fileName) {
		String path="D:\\Project";
		String finalfile=path+fileName;
		File file=new File(finalfile);
		file.delete();
		System.out.println("file deleted");
		
	}
	//Searching Function
	
	public static void serchFile(String serchingFileName) {
		String path="D:\\Project\\";
		File f=new File(path);
		File filename[]=f.listFiles();
		int count=0;
		for(File ff:filename) {
			
			if(ff.getName().equals(serchingFileName))
			{
				count++;
				break;
			}else {
				count=0;
			}
		}
		if (count!=0) {
			System.out.println("You have "+serchingFileName+" File :)");
			
		}else {
			System.out.println("File is not found");
		}
	}
	
	//Display File
	
	public  static void displayFile() {
		String path="D:\\Project\\";
		File f=new File(path);
		File filename[]=f.listFiles();
		System.out.println("Your File List is");
		for(File ff:filename) {
			System.out.println(ff.getName());
		}
	}
	
	
	
	//Main Method Start
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner =new Scanner(System.in);
		boolean c=true;
		//for stop Main menu;
		while(c) {
			
			System.out.println("1.Retrive Files");
			System.out.println("2.Business Level Operation");
			System.out.println("3.Exit from the app");
			System.out.println();
			boolean b=true;
			int x=scanner.nextInt();
			switch (x) {
			case 1:{
				displayFile();
				System.out.println();
				break;
			}
			case 2: 
			{	while(true) {
				
				System.out.println();
				System.out.println("1.Add File");
				System.out.println("2.Delete File");
				System.out.println("3.Search for a File");
				System.out.println("4.Go to go Main Menu");
				System.out.println();
				int i=scanner.nextInt();
				
				if(i<=0 || i>=5) {									
					//If no is not valid it also work for menu
					
					System.out.println("Please enter valid number");
					System.out.println();
			
				}else{
								if(i==1){
									System.out.println("Enter the File Name to Create");
									String  FileForCreate=scanner.next();
									genaretFile(FileForCreate);
									System.out.println();
									
								}
								else if(i==2) {
									System.out.println("Enter the File Name to Delete");
									String FileForDelete=scanner.next();
									deleteFile(FileForDelete);
									System.out.println();
								}
								else if(i== 3) {
									System.out.println("Enter the File Name for Serching");
									
								
								String FileForSerching=scanner.next();
								serchFile(FileForSerching);
								System.out.println();
								}
								else if(i==4) {
									
									System.out.println();
									break;
								}
						}
							
			}
			break;
				}
			
			case 3:{
				System.out.println("You have exit from app successfully");
				c=false;
				break;
				
			}
			}
				
		}
		
	}

}
