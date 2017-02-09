package main;

import calculateclass.Calculator;
import reader.Printer;
import reader.SentenceReader;

public class MainClass {
	public static void main(String[] args) {

		SentenceReader reader = new SentenceReader();
		Printer printer = new Printer();
		String sentence = reader.readSentence();
		Calculator calc = new Calculator();
		printer.printResult(calc.calculate(sentence));
	}
}
