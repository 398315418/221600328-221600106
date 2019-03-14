import java.io.*;
import java.util.*;

public class Main {
	 public static void main(String[] args) throws IOException
	 {
	         File filein = null;
	         if(args.length>0)
	         {
	        	 filein = new File(args[0]); 	
	         }
	         else
	         {
	        	 filein = new File("input.txt");   	 
	         }
	         
	         
	         
	         Count count = new Count(filein);
	         int characterNum = count.Countcharacter();
	         int lineNum = count.Countline();
	         int wordNum = count.Countword();
	         
	         String result="result.txt";
	         
	         
	         try { 
	        	 FileOutputStream fileout = new FileOutputStream(result);
                String resultcontent = characterNum + "\r\n" + lineNum + "\r\n" + wordNum;
                 
                fileout.write(resultcontent.getBytes());
              
                fileout.flush();
                fileout.close();
	         	} 
	         catch (FileNotFoundException e) 
	         {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	         }catch (IOException e) 
	         {
	        	 // TODO Auto-generated catch block
	        	 e.printStackTrace();
	         }

	         
	         
	         
	 }	         
}

