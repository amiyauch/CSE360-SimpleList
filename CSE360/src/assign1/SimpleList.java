package assign1;

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
	 * Shift all elements one index to the right. If this list is full,
	 * the last element will fall off this list. Increments count. 
	 * 
	 * @param newElement The new integer element that will be added to this list
	 */
	public void add(int newElement) {
		System.out.println("here");
		for (int index = list.length - 1; index > 0; index--) {		
			list[index] = list[index - 1];
		}
		
		list[0] = newElement;		
		
		if (count < 10) {			// Don't increment count if the list is already full
			count++;
		}
	}
	
	
	/**
	 * Remove an element from this list.
	 * <p>
	 * If the element is not in this list, do nothing. If the removeElement appears 
	 * multiple times, the first entry will be removed. The elements will 
	 * be shifted to the right by 1 index. Decrements counter.
	 * 
	 * @param removeElement The element that will be removed from this list
	 */
	public void remove(int removeElement) {
		
		final int ELEMENT_INDEX = search(removeElement);	// The index of the removeElement
		
		for (int index = ELEMENT_INDEX; index < list.length - 1; index++) {
			list[index] = list[index + 1];
		}
		count--;
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