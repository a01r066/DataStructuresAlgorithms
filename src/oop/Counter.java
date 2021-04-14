package oop;

public class Counter {
	
	public int countEvens(int[] items) {
		int count = 0;
		
		// Single loop - linear - O(n) - big O
		for(int i = 0; i < items.length; i++) {
			if(items[i]%2 == 0) {
				count++;
			}
		}
		
		return count;
	}
	
	public int getElementFrom(int[] items, int index) {
		return items[index];
	}
	
	public int countDuplicates(int[] items1, int[] items2) {
		int count = 0;
		
		// Quadratic - nested loop - O(n2) - big O n square
		for(int i = 0; i < items1.length; i++) {
			for(int j = 0; j < items2.length; j++) {
				if(items1[i] == items2[j]) {
					count++;
				}
			}
		}
		
		return count;
	}
}
