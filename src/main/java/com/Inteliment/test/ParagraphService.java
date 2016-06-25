package com.Inteliment.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody; 

@Controller
public class ParagraphService {
	
	public static final String PARAGRAPH_FILEPATH = "c:\\inteliment\\test\\input.txt";
	public static final String CSV_SEPERATOR = "|";
	public static final String LINE_SEPERATOR = "\n";
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public @ResponseBody Counts getSearchText(SearchText searchText){
		Counts searchCountDetails = new Counts();
		if(searchText!=null){
			String[] searchTexts = searchText.getTextToSearch();
			File inputFile = new File(PARAGRAPH_FILEPATH);
			HashMap wordOccurenceMap = getWordOccurance(inputFile);
						
			for(int i=0; i<searchTexts.length;i++){
				String tmpSearchText = searchTexts[i];
				Integer occursInt = (Integer)wordOccurenceMap.get(tmpSearchText);
				
				WordOccurences wordOccur = new WordOccurences(tmpSearchText, occursInt.intValue());
				searchCountDetails.addWordOccurence(wordOccur);
			}
		}
		return searchCountDetails;
	}
	
	@RequestMapping(value="/top/{topListInt}", method=RequestMethod.POST)
	public String getTopWordCount(@PathVariable Integer topList){
		StringBuffer topWordCountList = new StringBuffer();
		File inputFile = new File(PARAGRAPH_FILEPATH);
		HashMap wordOccurenceMap = getWordOccurance(inputFile);
		ArrayList wordOccurenceList = getWordCountDetailsInArrayList(wordOccurenceMap);
		Collections.sort(wordOccurenceList, new WordOccurTopSort());
		
		for(int i=0; i<topList.intValue();i++){
			
		}
		int start=1;
		int end=topList.intValue();
		
		Iterator listItr = wordOccurenceList.iterator();
		while(listItr.hasNext()){
			if(start <= end){
				WordOccurences wordDetailsObj = (WordOccurences)listItr.next();
				if(wordDetailsObj!=null){
					topWordCountList.append(wordDetailsObj.getWord());
					topWordCountList.append(CSV_SEPERATOR);
					topWordCountList.append(wordDetailsObj.getOccurences());
					topWordCountList.append(LINE_SEPERATOR);
				}
				
				start++;
			}
			
		}
		return topWordCountList.toString();
	} 
	
	public HashMap getWordOccurance(File inputFile){
		HashMap<String, Integer> wordCountDetails = new HashMap<String, Integer>();
		try {
			Scanner fileScanner = new Scanner(inputFile);
			
			while(fileScanner.hasNext()){
				String tmpWord = (String) fileScanner.next();
				if(tmpWord!=null && tmpWord.trim().length() > 0){
					Integer wordOccurences = wordCountDetails.get(tmpWord);
					
					if(wordOccurences == null){
						wordOccurences = 1;
					} else {
						wordOccurences++;
					}
					
					wordCountDetails.put(tmpWord, wordOccurences);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return wordCountDetails;
	}
	
	public ArrayList getWordCountDetailsInArrayList(HashMap wordCountDetailsMap){
		ArrayList wordCountDetailsList = new ArrayList();
		if(wordCountDetailsMap.size()>0){
			Iterator<String> itr = wordCountDetailsMap.keySet().iterator();
			
			while(itr.hasNext()){
				String word = (String)itr.next();
				Integer occurences = (Integer)wordCountDetailsMap.get(word);
				
				WordOccurences wordOccurence = new WordOccurences(word, occurences);
				wordCountDetailsList.add(wordOccurence);
			}
		}
		
		return wordCountDetailsList;
	}
}
