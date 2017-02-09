package calculateclass;

import java.math.BigDecimal;

public class Calculator {
	ActionOnSentence action= new ActionOnSentence();

	public Calculator() {
		}

	public String calculate(String sentence) {
		sentence = action.removeOtherChars(sentence);
		String result = "";
		if (sentence == null || sentence=="") {
			return result;
		}
		String[] addArray = action.separationSentenceBySign(sentence, "+");
		for (int i = 0; i < addArray.length; i++) {
			String[] multiplyArray = action.separationSentenceBySign(
					addArray[i], "*");
			for (int j = 0; j < multiplyArray.length; j++) {
				String[] divideArray = action.separationSentenceBySign(
						multiplyArray[j], ":");
				multiplyArray[j] = performTheAction(divideArray, ":");
			}
			addArray[i] = performTheAction(multiplyArray, "*");
		}

		result = performTheAction(addArray, "+");

		return result;

	}

	private String performTheAction(String[] array, String sign) {
		BigDecimal resultOfAction = BigDecimal.valueOf(Double
				.parseDouble(array[0]));
		String sentence;
		if (array.length == 1) {
			sentence = Double.toString(resultOfAction.doubleValue());
			return sentence;
		}
		for (int i = 1; i < array.length; i++) {
			switch (sign) {
			case "+":
				resultOfAction = resultOfAction.add(BigDecimal.valueOf(Double
						.parseDouble(array[i])));
				break;
			case "-":
				resultOfAction = resultOfAction.subtract(BigDecimal
						.valueOf(Double.parseDouble(array[i])));
				break;
			case "*":
				resultOfAction = resultOfAction.multiply(BigDecimal
						.valueOf(Double.parseDouble(array[i])));
				break;
			case ":":
				if (Double.parseDouble(array[i]) != 0.0) {
					resultOfAction = resultOfAction.divide(BigDecimal
							.valueOf(Double.parseDouble(array[i])));
				} else {
					
				}
				break;
			}
		}

		sentence = Double.toString(resultOfAction.doubleValue());

		return sentence;
	}

}
