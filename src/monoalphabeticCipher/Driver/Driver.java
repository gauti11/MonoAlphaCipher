package monoalphabeticCipher.Driver;

import java.util.ArrayList;

import encMap.Result;
import encMap.fileProcessor;
import encMap.generateMap;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	System.out.println("Hello World");
		int seed = 26;
		Random ns = new Random();
		int x = ns.nextInt(seed)+1;
		System.out.println(x);
		ns.setSeed(seed);
		double k = ns.nextDouble()*10;
		System.out.println("\n" + k);*/
		//C:\Users\GautiSpurs\eclipse-workspace\Monoalphabetic Cipher\src\input.txt
		fileProcessor fp = new fileProcessor(args[0]);
		generateMap gm = new generateMap();
		Result r = new Result();
		ArrayList<String> val = new ArrayList<>();
		if(Integer.parseInt(args[3]) == 1) {
			String s = null;
			while((s = fp.readLine()) != null) {
				val = gm.encryptData(s, Integer.parseInt(args[2]));
			}
			
		} else if(Integer.parseInt(args[3]) == 0) {
			String s = null;
			while((s = fp.readLine()) != null) {
				val = gm.decryptData(s, Integer.parseInt(args[2]));
			}
		}
		r.writeFile(args[1], val);
		//gm.printMap(8);
		//gm.encryptData("Gautam", 8);
		//gm.decryptData("hello",8);
/*
		final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String alphabet1 = "QWERTYUIOPASDFGHJKLZXCVBNM";
		final int N = alphabet.length();

		Random r = new Random();
		r.setSeed(seed);
		for (int g = 0; g < 26; g++) {
			System.out.print(alphabet.charAt(r.nextInt(seed)));
		}*/
	}
}
	 