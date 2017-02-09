package Reader;

import java.util.Scanner;

public class SentenceReader {
	Scanner input = new Scanner(System.in);
		

	public String readSentence() {
		
			System.out.println("Podaj sentencjê do obliczenia.");
			String sentence= input.nextLine();
			input.close();
		return sentence;
	}

}
