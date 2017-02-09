package Main;

import CalculateClass.Calculator;
import Reader.Printer;
import Reader.SentenceReader;

public class MainClass {
	public static void main(String[] args) {

		SentenceReader reader = new SentenceReader();
		Printer printer = new Printer();
		String sentence = reader.readSentence();
		Calculator calc = new Calculator();
		printer.printResult(calc.calculate(sentence));
	}
}
