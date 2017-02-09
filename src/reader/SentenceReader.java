package reader;

import java.util.Scanner;

public class SentenceReader {
	Scanner input = new Scanner(System.in);
		

	public String readSentence() {
		
			System.out.println("Podaj sentencj� do obliczenia.");
			String sentence= input.nextLine();
			input.close();
		return sentence;
	}

}
