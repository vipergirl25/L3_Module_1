package SearchingAndSortingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int brokenEgg = 0;
		for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equalsIgnoreCase("cracked")) {
				brokenEgg = i;
				break;
			}
		}
		return brokenEgg;
	}
	public static int countPearls(List<Boolean> oysters) {
		int numberOfPearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i)==true) {
				numberOfPearls++;
			}
		}
		return numberOfPearls;
	}
	public static double findTallest(List<Double> peeps) {
		double tallest = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i)>tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}
	
	public static String findLongestWord(List<String> words) {
		String longestWord = "";
		for (int i = 0; i < words.size(); i++) {
			if(words.get(i).length()>longestWord.length()) {
				longestWord = words.get(i);
			}
		}
		return longestWord;
	}
	public static List<String> sortDNA(List<String> unsortedSequences) {
		List<String>sortedSequence = new ArrayList<String>();
		int hello = 0;
		for (int i = 0; i < unsortedSequences.size(); i++) {
			hello = unsortedSequences.get(i).compareTo(unsortedSequences.get(i + 1));
			if(hello>0) {
				unsortedSequences.set(i, unsortedSequences.get(i + 1)); 
			}
		}
		return sortedSequence;
	}

}