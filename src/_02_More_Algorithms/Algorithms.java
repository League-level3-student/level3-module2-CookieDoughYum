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
}
