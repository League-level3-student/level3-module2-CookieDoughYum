package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i=0; i<eggs.size(); i++) {
			if(eggs.get(i)=="cracked") {
				return i;
			}
		}
		return -1;
	}

	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int pearls=0;
		for(int i=0; i<oysters.size(); i++) {
			if(oysters.get(i)==true) {
				pearls+=1;
			}
		}
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		boolean swap=true;
		while(swap) {
			swap=false;
		for(int i=0; i<peeps.size()-1; i++) {
			if(peeps.get(i)>peeps.get(i+1)) {
				Double temp=peeps.get(i);
				Double temp1=peeps.get(i+1);
				temp=peeps.get(i+1);
				temp1=temp;
	            swap=true;
			}
		}
		return peeps.get(peeps.size()-1);
	}
		return -1;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String longest = null;
		for(int i=0; i<words.size()-1; i++) {
			if(words.get(i).length()<words.get(i+1).length()) {
				longest=words.get(i);
			}
		}
		int longestLength=Integer.parseInt(longest);
		if(longestLength<words.get(words.size()).length()) {
			longest=words.get(words.size());
		}
		return longest;
	}

	public static Object containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		for(int i=0; i<message1.size(); i++) {
			if(message1.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<String> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		boolean swap=true;
		while(swap) {
			swap=false;
		for(int i=0; i<results.size()-1; i++) {
			if(results.get(i)>results.get(i+1)) {
				Double temp=results.get(i);
				Double temp1=results.get(i+1);
				temp=results.get(i+1);
				temp1=temp;
	            swap=true;
			}
		}
		return results.get(results.size()-1);
	}
		return -1;
	}
	}

