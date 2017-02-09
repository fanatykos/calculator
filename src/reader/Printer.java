package reader;

public class Printer {
	
	public void printReaderedSentence(String sentence){
		System.out.println("Wprowadzono wyra�enie:");
		System.out.println(sentence);
	}
	
	public void printSentenceAfterRemovedOtherChars(String sentence){
		System.out.println("Dzia�anie po usuni�ciu niechcianych znak�w:");
		System.out.println(sentence);
	}
	
	public void printResult(String sentence){
		System.out.println("Wynik dzia�ania to:");
		System.out.println(sentence);
	}
	
	public void printErrorDivideByZero(){
		System.out.println("Dzia�anie nie mo�e by� wykonane, pr�ba dzielenia przez 0");
	}
}
