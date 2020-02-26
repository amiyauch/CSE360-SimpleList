package cse360assign2;

/**
 * @Author: Adam Miyauchi
 * @ID Class ID: 113
 * @Assignment Assignment Number 1
 * @Version 1.0
 * @Since assign1
 * 
 * The SimpleList class implements an object to represent a list. 
 * The class supports creating a list, adding elements, removing elements,
 * counting elements, searching for elements, and displaying elements. 
 * See method descriptions below for specific implementation details. 
 */


public class SimpleList {
	 
	/**
	 * An array to represent this list that will hold the elements in the list
	 */
	private int[] list;
	
	/** 
	 * The number of elements in this list
	 */
	private int count;
	
	
	/**
	 * Creates a list. 
	 * <p>
	 * Creates an array to hold 10 integers and sets the count to 0.
	 */
	public SimpleList() {
		this.list = new int[10];
		this.count = 0;
	}
	
	
	/**
	 * Add an element to the list.
	 * <p>
	 * Add the parameter to the list at the beginning (index = 0). Moves all other integers
	 * over so there is room. If this list is full, then increases the size by 50% so there
	 * is room. Increments count. 
	 * 
	 * @param newElement The new integer element that will be added to this list
	 */
	public void add(int newElement) {
		
		// If the list is full increase this list size by 50%
		if (count == list.length) {
			int[] bigList = new int[ (int) (list.length * 0.5 + list.length) ];
			
			for (int index = 0; index < count; index++) {
				bigList[index] = list[index];
			}
			list = bigList;
		}

		// Shift elements and add the new element to the beginning
		for (int index = count; index > 0; index--) {
			list[index] = list[index - 1];
		}
		list[0] = newElement;
		count++;
		
	}
	
	
	/**
	 * Remove an element from this list.
	 * <p>
	 * If the element is not in this list, do nothing. If the removeElement appears 
	 * multiple times, the first entry will be removed. The elements will 
	 * be shifted to the right by 1 index. Decrements counter. If the list has more than
	 * 25% empty places, list is decreased in size by 25%.
	 * 
	 * @param removeElement The element that will be removed from this list
	 */
	public void remove(int removeElement) {
		
		final int ELEMENT_INDEX = search(removeElement);	
		
		if (ELEMENT_INDEX == -1) {
			return;		
		}
		else {
			// Move elements down
			for (int index = ELEMENT_INDEX; index < count - 1; index++) {
				list[index] = list[index + 1];
			}
			count--;
			
			// If the list has more than 25% empty space decrease the size of the list by 25%
			int emptySpace = list.length - count;		
			int quarterTotalSpace = (int) (list.length * 0.25);
			if (emptySpace > quarterTotalSpace) {			
				int[] smallList = new int[list.length - quarterTotalSpace];
				
				// Move elements to the smaller list
				for (int index = 0; index < count; index++) {
					smallList[index] = list[index];
				}
				list = smallList;
			}
		}
	}
	
	
	/**
	 * Get the number of elements stored in this list.
	 * 
	 * @return count - the number of elements in this list
	 */
	public int count() {
		return count;
	}
	
	
	/**
	 * Return this list as a string.
	 * The elements are separated with a space. There is no 
	 * space after the last element.
	 * 
	 * @return a string containing the element in this list 
	 */
	public String toString() {
		String result = "";		// String to hold the integer values
		
		if (count > 0) {
			for (int index = 0; index < count - 1; index++) {		
				result += list[index] + " ";					
			}
			result += list[count - 1];		// Avoids a space after the last element
		}
		
		return result;
	}
	
	
	/**
	 * Search for the location of an element in this list.
	 * <p>
	 * Implemented using linear search. 
	 * 
	 * @param searchElement The element to be searched for in this list
	 * @return the index of the search element or -1 if the element 
	 * 		   does not exist in this list
	 */
	public int search(int searchElement) {
		
		for (int index = 0; index < list.length; index++) {		
			if (list[index] == searchElement) {		
				return index;
			}
		}
		
		return -1;
	}
	
}