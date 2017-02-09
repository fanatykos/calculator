package CalculateClass;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class ActionOnSentenceTest {
	
	@Test
	public void testRemoveOtherChars(){
		String sentence="-ka6+4*9.k6-   7+89:4        99";
		String resultExpected="-6+4*9.6+-7+89:499";
		ActionOnSentence aOnSent= new ActionOnSentence();
		assertTrue(aOnSent.removeOtherChars(sentence).equals(resultExpected));
	}

	@Test
	public void testSeparationSentenceWhenSentenceIsNull() {
		String sentence = null;
		String[] tableExpected = null;
		ActionOnSentence aOnSent = new ActionOnSentence();
		String[] resultTable = aOnSent.separationSentenceBySign(sentence, "+");

		assertTrue(Arrays.equals(resultTable, tableExpected));
	}

	@Test
	public void testSeparationSentenceByPlusChar() {
		String sentence = "4+6+5+4";
		String[] tableExpected = { "4", "6", "5", "4" };
		ActionOnSentence aOnSent = new ActionOnSentence();
		String[] resultTable = aOnSent.separationSentenceBySign(sentence, "+");

		assertTrue(Arrays.equals(resultTable, tableExpected));

	}

	@Test
	public void testSeparationSentenceByMinusChar() {
		String sentence = "-88+55-334-55*44";
		String[] tableExpected = {"", "88+55", "334", "55*44" };
		ActionOnSentence aOnSent = new ActionOnSentence();
		String[] resultTable = aOnSent.separationSentenceBySign(sentence, "-");

		assertTrue(Arrays.equals(resultTable, tableExpected));

	}

	@Test
	public void testSeparationSentenceByMultiplyChar() {
		String sentence = "44+3*55+23*6";
		String[] tableExpected = { "44+3", "55+23", "6" };
		ActionOnSentence aOnSent = new ActionOnSentence();
		String[] resultTable = aOnSent.separationSentenceBySign(sentence, "*");

		assertTrue(Arrays.equals(resultTable, tableExpected));

	}

	@Test
	public void testSeparationSentenceByDivideChar() {
		String sentence = "44+3:55+23:6";
		String[] tableExpected = { "44+3", "55+23", "6" };
		ActionOnSentence aOnSent = new ActionOnSentence();
		String[] resultTable = aOnSent.separationSentenceBySign(sentence, ":");

		assertTrue(Arrays.equals(resultTable, tableExpected));

	}
}
