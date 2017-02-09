package Data;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestNumbers {

//	@Test
//	public void teNumbers() {
//		String sentence= "Ala ma kota, kot ma psa";
//		Numbers numbers= new Numbers();
//		numbers.setNumbersInSentence(sentence);
//		assertTrue(sentence==numbers.getNumbersInSentence());
//	}
//	
	@Test
	public void test(){
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		System.out.println(list.toString());
		list.add(1, 6);
		System.out.println(list.toString());
	}
	

}
