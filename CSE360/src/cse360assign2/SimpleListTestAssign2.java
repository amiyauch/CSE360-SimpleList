package cse360assign2;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import cse360assign2.SimpleList;


public class SimpleListTestAssign2 {
	
	/**
	 * Test adding an integer to a partially filled array
	 */
	@Test
	public void testAddPartial() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		assertEquals(1, testList.search(3));
	}
	
	
	/**
	 * Tests adding an integer to a full list.
	 */
	@Test
	public void testAddFull() {
		SimpleList testList = new SimpleList();
			testList.add(1);
			testList.add(2);
			testList.add(3);
			testList.add(4);
			testList.add(5);
			testList.add(6);
			testList.add(7);
			testList.add(8);
			testList.add(9);
			testList.add(10);
			testList.add(11);
			testList.add(12);
			assertEquals(11, testList.search(1));
	}
	
	
	/**
	 * Tests adding an integer to a full list which will cause the list
	 * size to be increase by 50%.
	 */
	@Test
	public void testIncreaseSize() {
		SimpleList testList = new SimpleList();
			testList.add(1);
			testList.add(2);
			testList.add(3);
			testList.add(4);
			testList.add(5);
			testList.add(6);
			testList.add(7);
			testList.add(8);
			testList.add(9);
			testList.add(10);
			testList.add(11);
			testList.add(12);
			assertEquals(15, testList.size());
	}
	
	
	/**
	 * Tests removing an arbitrary integer from the list
	 */
	@Test
	public void testRemove() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.remove(3);
		assertEquals(testList.search(3), -1);
	}
	
	
	/**
	 * Tests removing an integer that appears twice in the list.
	 * The method should only remove the first.
	 */
	@Test
	public void testRemoveDuplicate() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.add(3);
		testList.remove(3);
		assertEquals(testList.search(3), 1);
	}
	
	
	/**
	 * Tests removing an element that does not exist in the list.
	 */
	@Test
	public void testRemoveNonExistentElement() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(2);
		testList.remove(3);
		assertEquals(testList.search(3), -1);
	}
	
	
	/**
	 * Tests the shorting procedure of the remove element. 
	 * Shortens the list by 25% if the list has more than 
	 * 25% empty space.
	 */
	@Test
	public void testShortenList() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.remove(3);
		assertEquals(8, testList.size());
	}
	
	
	/**
	 * Test to check the list does not reduce to less than one entry
	 */
	@Test
	public void testMinimumLength() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.add(5);
		testList.add(6);
		testList.add(7);
		testList.add(8);
		testList.add(9);
		testList.add(10);
		
		
		testList.remove(1);
		testList.remove(2);
		testList.remove(3);
		testList.remove(4);
		testList.remove(5);
		testList.remove(6);
		testList.remove(7);
		testList.remove(8);
		testList.remove(9);
		testList.remove(10);
		
		assertEquals(3, testList.size());
	}
	
	
	/**
	 * Test appending an element to a partially filled list.
	 */
	@Test
	public void testAppendPartial() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.append(2);
		assertEquals(1, testList.search(2));
	}
	
	
	/**
	 * Test appending an element to a full list
	 */
	@Test
	public void testAppendFull() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.add(5);
		testList.add(6);
		testList.add(7);
		testList.add(8);
		testList.add(9);
		testList.add(10);
		testList.append(11);
		testList.append(12);
		assertEquals(11, testList.search(12));
	}
	
	
	/**
	 * Tests the increase list size procedure of append method
	 */
	@Test
	public void appendIncreaseSize() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.add(5);
		testList.add(6);
		testList.add(7);
		testList.add(8);
		testList.add(9);
		testList.add(10);
		testList.append(11);
		testList.append(12);
		assertEquals(15, testList.size());
	}
	
	
	/**
	 * Tests the first method.
	 */
	@Test
	public void testFirst() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(2);
		assertEquals(2, testList.first());
	}
	
	
	/**
	 * Tests the first method when the list is empty.
	 */
	@Test
	public void firstEmpty() {
		SimpleList testList = new SimpleList();
		
		assertEquals(-1, testList.first());
	}
	
	
	/**
	 * Tests the last method.
	 */
	@Test
	public void testLast() {
		SimpleList testList = new SimpleList();
		
		testList.add(1);
		testList.add(2);
		
		assertEquals(1, testList.last());
	}
	
	
	/**
	 * Tests the last method when the list is empty
	 */
	@Test
	public void testLastEmpty() {
		SimpleList testList = new SimpleList();
		
		assertEquals(-1, testList.last());
	}
	
	
	/**
	 * Tests the size method.
	 */
	@Test
	public void testSize() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(2);
		assertEquals(10, testList.size());
	}
	
	
	/** 
	 * Tests the SimpleList constructor. Will fail if the SimpleList
	 * object created is null.
	 */
	@Test
	public void testMakeSimpleListPass() {
		SimpleList testList = new SimpleList();
		assertNotNull(testList);
	}
	
	
	/**
	 * Test the SimpleList constructor. Will fail if the SimpleList
	 * object created is not null.
	 */
	@Test
	public void testMakeSimpleListFail() {
		SimpleList testList = null;
		assertNull(testList);
	}
	
	
	/**
	 * Tests count on an empty list.
	 */
	@Test
	public void testCountEmpty() {
		SimpleList testList = new SimpleList();
		
		assertEquals(testList.count(), 0);
	}
	
	
	/**
	 * Test count on a partially filled list.
	 */
	@Test
	public void testCountPartial() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(1);
		
		assertEquals(testList.count(), 2);
	}
	
	
	/**
	 * Tests toString method on a partially filled SimpleList. 
	 */
	@Test
	public void testToString() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		
		assertEquals(testList.toString(), "1");
	}
	
	
	/**
	 * Test toString method on an empty list.
	 */
	@Test
	public void testToStringEmpty() {
		SimpleList testList = new SimpleList();
		
		assertEquals(testList.toString(), "");
	}
	
	
	/** 
	 * Tests search method.
	 */
	@Test
	public void search() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(2);
		
		assertEquals(testList.search(1), 1);
	}
	
	
	/**
	 * Tests searching for an integer that exists multiple
	 * times in the SimpleList. Will fail if all the occurrences are removed. 
	 */
	@Test
	public void searchMultiple() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(1);
		
		assertEquals(testList.search(1), 0);
	}
	
	
	/**
	 * Test searching for an element that does not exist in the SimpleList.
	 */
	@Test
	public void searchFail() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(2);
		
		assertEquals(testList.search(3), -1);
	}
	
	
}




