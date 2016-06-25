package com.Inteliment.test;

public class Counts {
	WordOccurences[] wordOccurences;

	public WordOccurences[] getWordOccurences() {
		return wordOccurences;
	}

	public void setWordOccurences(WordOccurences[] wordOccurences) {
		wordOccurences = wordOccurences;
	}

	public void addWordOccurence(WordOccurences wordOccurences){
		int wordOccrencesCount = this.wordOccurences.length;
		if(wordOccurences!=null){
			this.wordOccurences[wordOccrencesCount] = wordOccurences;
		}
	}
}
