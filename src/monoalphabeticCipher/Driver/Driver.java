package monoalphabeticCipher.Driver;

import java.util.Random;

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
		generateMap gm = new generateMap();
		gm.printMap(26);
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
	 