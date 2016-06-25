package com.Inteliment.test;

import java.util.Comparator;

public class WordOccurTopSort implements Comparator<WordOccurences> {

	@Override
	public int compare(WordOccurences arg0, WordOccurences arg1) {
		// TODO Auto-generated method stub
		if(arg0.getOccurences() < arg1.getOccurences()){
			return 1;
		} else {
			return -1;
		}
	}

}
