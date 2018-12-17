package hours24.mpr;

import java.util.*;

public class hour9 {

	public static void main(String[] args) {
		//First
		String mostFamous = "Rudolf, czerwonow³osy renifer";
		char[] mfl = mostFamous.toCharArray();
		for(int dex = 0; dex < mfl.length; dex++) {
			char current = mfl[dex];
			if(current != ' ') {
				System.out.print(current);
			} else {
				System.out.print('.');
			}
		}
		System.out.println("\n"+mfl[4]);
		
		//Second
		String[] names = {"Grzegorz", "Adam", "£ukasz", "Mirek", "Aleksandra", "Edyta", "Marek", "Justyna", "Agata", "Kinga"};
		System.out.println("Pocz¹tkowa kolejnoœæ:");
		for(int i=0; i<names.length; i++) {
			System.out.println(i + ": " + names[i]);
		}
		Arrays.sort(names);
		System.out.println("Nowa kolejnoœæ:");
		for(int i=0; i<names.length; i++) {
			System.out.println(i + ": " + names[i]);
		}
		System.out.println();
		
		//Third
		String phrase[] = {
				"Ala ma kota a",
				"Kot ma Ale",
				"Du¿y nie jest ma³y",
				"Alicja w krainie czarów",
				"Cierpliwoœæ",
				"Konsekwencja to cnota"
		};
		int[] letterCount = new int[26];
		for (int count = 0; count < phrase.length; count++) {
			String current = phrase[count].toUpperCase();
			char[] letters = current.toCharArray();
			for(int count2 = 0; count2 < letters.length; count2++) {
				char lett = letters[count2];
				if ( (lett >= 'A') & (lett <= 'Z')) {
					letterCount[lett - 'A']++;
				}
			}
		}
		for (char count = 'A'; count <= 'Z'; count++) {
			System.out.print(count + ": " + letterCount[count - 'A']+" ");
			if (count == 'M') {
				System.out.println();
			}
		}
		System.out.println();
	}
}
