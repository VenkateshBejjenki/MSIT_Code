import java.io.File;
import java.nio.file.Paths;
import java.util.Scanner;
public class Task {

	public static void main(String[] args) {
		Scanner j=new Scanner(System.in);
		System.out.println("Enter the path/file");
		String oPath =j.nextLine();
		
		
		//String oPath=Paths.get(".", args).toAbsolutePath().normalize().toString();
		String path;
		File f = null;
		try{
	         f = new File(oPath);
	         
	         //System.out.println(Paths.get(".", args).toAbsolutePath().normalize().toString());	//PWD
	         
	         path = f.getPath();
	         if(f.isFile()){
	        	 System.out.println(path+" is File");
	         }else if(f.isDirectory()){
	        	 System.out.println(path+" is directory");
	        	 File[] listOfFiles = f.listFiles();
	        	 for (int i = 0; i < listOfFiles.length; i++) {
	        		 if(listOfFiles[i].isFile()){
	        			 System.out.println(listOfFiles[i].getName()+" is File");
	        		 }else if(listOfFiles[i].isDirectory()){
	        			 System.out.println(listOfFiles[i].getName()+" is directory");
	        		 } 
	        	 }
	         }
	      }catch(Exception e){e.printStackTrace();}
		
	}

}
