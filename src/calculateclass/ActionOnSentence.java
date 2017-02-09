package calculateclass;

public class ActionOnSentence {

	public ActionOnSentence() {

	}

	public String removeOtherChars(String sentence) {
		StringBuilder temporaryResult = new StringBuilder();
		for (int i = 0; i < sentence.length(); i++) {
			char sign = sentence.charAt(i);
			if (isAcceptableCalculateChar(sign)) {
				if (sign == '-') {
					temporaryResult.append('+');
					temporaryResult.append(sign);
				} else {
					temporaryResult.append(sign);
				}
			}
		}
		if (temporaryResult.length() > 0 && temporaryResult.charAt(0) == '+') {
			temporaryResult.deleteCharAt(0);
		}
		String result = temporaryResult.toString();
		return result;
	}

	private boolean isAcceptableCalculateChar(char sign) {
		boolean isAcceptable = false;
		byte index = (byte) sign;
		if ((index >= 48 && index <= 58) || (index >= 42 && index <= 43)
				|| (index >= 45 && index <= 46)) {
			isAcceptable = true;
		}
		return isAcceptable;
	}

	public String[] separationSentenceBySign(String sentence,
			String signOfAction) {
		String[] resultTable = null;
		if (sentence != null && sentence != "") {
			resultTable = sentence.split("\\" + signOfAction);
		}
		return resultTable;

	}

}
