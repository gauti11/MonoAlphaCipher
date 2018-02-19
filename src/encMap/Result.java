package encMap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Result {
	ArrayList<String> concatData = new ArrayList<String>();
	
	public void writeFile(String fw) {
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(fw));
			//System.out.println(string);
			for (String string : concatData) 
		//	{
				writer.append(string+"\n");
				writer.newLine();
			//}
		writer.close();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
