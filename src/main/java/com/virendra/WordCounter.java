package com.virendra;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

	public static void main(String[] args) {
		String text = "Shubham virendra Shubham virendra virendra s ";
		String[] text_word = text.split(",");

		Map<String, Integer> wordCounter = new HashMap<String, Integer>();

		for (String word : text_word) {
			if (wordCounter.get(word) != null) {
				int lastCounter = wordCounter.get(word);
				wordCounter.put(word, lastCounter++);
			} else {
				wordCounter.put(word, 1);
			}
		}
		
		
	

	}

}
