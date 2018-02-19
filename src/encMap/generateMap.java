package encMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Random;

public class generateMap {
	ArrayList<Character> aChar = new ArrayList<>();
	HashMap<String, String> map = new HashMap<>();
	String enc;
	ArrayList<String> result = new ArrayList<>();
	public char[] printMap(int seed) {
		Random r = new Random();
		r.setSeed(seed);
		char[] ch = new char[26];
		String alphabet1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String alphabet = alphabet1.toLowerCase();
		for (int i = 0; i < 26; i++) {
			int x = r.nextInt(26);
			// char c = '';
			while (x > (alphabet.length() - 1)) {
				x = r.nextInt(26);
			}
			char c = alphabet.charAt(x);
			while (aChar.contains(c)) {
				while (x > (alphabet.length() - 1)) {
					x = r.nextInt(26);
				}
				c = alphabet.charAt(x);
			}
			aChar.add(c);
			alphabet = alphabet.replaceAll(Character.toString(c), "");
			// System.out.print(alphabet.charAt(r.nextInt(seed)));
		}

		for (int i = 97; i < (97 + 26); i++) {
			map.put(Character.toString((char) i), Character.toString(aChar.get(i % 97)));
			//System.out.println(Character.toString((char) i) + "-" + aChar.get(i % 97));
		}
		return ch;
	}
	/*
	 * Encryption
	 */
	public ArrayList<String> encryptData(String readData, int seed)
	{	
		printMap(seed);
		for (int i = 0; i < readData.length(); i++) {
			System.out.print(readData.charAt(i) +"-"+map.get(Character.toString(readData.charAt(i)).toLowerCase())+" ");
		}
		//String readData = "Gautam";
		String enc = "";
		for (int i = 0; i < readData.length(); i++) {
			//Character.toString(gautam.charAt(i)).toLowerCase()
			enc = enc.concat(map.get(Character.toString(readData.charAt(i)).toLowerCase()));
			// System.out.print(map.get(gautam.charAt(i)));
		}
		System.out.println("\nencypted: " + enc);
		result.add(enc);
		return result;
	}



	//Decryption

	public ArrayList<String> decryptData(String readData, int seed)
	{
		String decr = "";
		printMap(seed);
		/*for (int i = 0; i < readData.length(); i++) {
			System.out.print(readData.charAt(i) +"-"+map.get(Character.toString(readData.charAt(i)).toLowerCase())+" ");
		}*/
		for (int i = 0; i < readData.length(); i++) {
			//Set<Entry<String, String>> entry3 = map.entrySet();
			for (Entry<String, String> entry : map.entrySet()) {
				if (Objects.equals(Character.toString(readData.charAt(i)), entry.getValue())) {
					System.out.print(readData.charAt(i) +"-"+entry.getKey()+" ");
					decr = decr.concat(entry.getKey());
				}
			}
		}
		System.out.println("\ndecrypted: " + decr);
		result.add(decr);
		/*
		 * for(int i=0;i<enc.length();i++) { enc = enc.concat(map.);
		 * System.out.print(map.get(gautam.charAt(i))); }
		 */
		return result;
	}
}

