package com.Inteliment.test;

public class WordOccurences {
	String word;
	Integer occurences;
	
	public WordOccurences(String word, Integer occurences){
		this.word = word;
		this.occurences = occurences;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public Integer getOccurences() {
		return occurences;
	}
	public void setOccurences(Integer occurences) {
		this.occurences = occurences;
	}

}
