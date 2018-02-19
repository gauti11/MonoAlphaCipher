package encMap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileProcessor {
	BufferedReader br;
	public fileProcessor(String fileIn)
	{
  
		try {	
			  File file = new File(fileIn);
			  if(!file.isDirectory() && file.exists())
			  {
				 br = new BufferedReader(new FileReader(file)); 
			  }
			  else
			  {
					System.err.println("File Not found");
					throw new FileNotFoundException();
			  }
			} 
				catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		
	/**
	 * File being read line by line
	 * @return
	 */
	public String readLine()
	{
		String sread = null;
		 try {
			if ((sread = br.readLine()) != null) {
					//return sread;			
			  }			
			/*else if(sread == null && br!=null)
				br.close();*/
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return sread;
	}
}

