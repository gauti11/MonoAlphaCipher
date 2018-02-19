package encMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class generateMap {

	public char[] printMap(int seed) {
		Random r = new Random();
		r.setSeed(seed);
		char[] ch = new char[26];
		String alphabet1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String alphabet = alphabet1.toLowerCase();
		ArrayList<Character> aChar = new ArrayList<>();
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
		/*
		 * Encryption
		 */
		HashMap<String, String> map = new HashMap<>();
		for (int i = 97; i < (97 + 26); i++) {
			map.put(Character.toString((char) i), Character.toString(aChar.get(i % 97)));
			System.out.println(Character.toString((char) i) + "-" + aChar.get(i % 97));
		}

		String gautam = "Gautam";
		String enc = "";
		for (int i = 0; i < gautam.length(); i++) {
			//Character.toString(gautam.charAt(i)).toLowerCase()
			enc = enc.concat(map.get(Character.toString(gautam.charAt(i)).toLowerCase()));
			// System.out.print(map.get(gautam.charAt(i)));
		}
		System.out.println("encypted: " + enc);
		gautam = "";
		for (int i = 0; i < enc.length(); i++) {
		Set<Entry<String, String>> entry3 = map.entrySet();
			for (Entry<String, String> entry : map.entrySet()) {
				if (Objects.equals(Character.toString(enc.charAt(i)), entry.getValue())) {
					gautam = gautam.concat(entry.getKey());
				}
			}
		}
		System.out.println("decrypted: " + gautam);
		/*
		 * for(int i=0;i<enc.length();i++) { enc = enc.concat(map.);
		 * System.out.print(map.get(gautam.charAt(i))); }
		 */
		return ch;
	}

}
