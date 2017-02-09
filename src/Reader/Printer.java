package Reader;

public class Printer {
	
	public void printReaderedSentence(String sentence){
		System.out.println("Wprowadzono wyra¿enie:");
		System.out.println(sentence);
	}
	
	public void printSentenceAfterRemovedOtherChars(String sentence){
		System.out.println("Dzia³anie po usuniêciu niechcianych znaków:");
		System.out.println(sentence);
	}
	
	public void printResult(String sentence){
		System.out.println("Wynik dzia³ania to:");
		System.out.println(sentence);
	}
	
	public void printErrorDivideByZero(){
		System.out.println("Dzia³anie nie mo¿e byæ wykonane, próba dzielenia przez 0");
	}
}
