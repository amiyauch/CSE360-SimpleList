
package assign1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @Author Adam Miyauchi
 * @ID 113
 * @Assignment 1
 * @Version 1.0
 * @Since assign1
 * 
 * The SimpleListTest class is a Junit test class to test the SimpleList class.
 */
public class SimpleListTest {

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
	 * Tests adding an integer to a partially filled SimpleList. 
	 */
	@Test
	public void testAddPartial() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(2);
		
		assertEquals(testList.search(2), 0);
	}
	
	
	/**
	 * Tests adding an integer to a full SimpleList. 
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
		
		assertEquals(testList.search(1), -1);
	}
	
	
	/**
	 * Tests removing an integer from a SimpleList.
	 */
	@Test
	public void testRemove() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(2);
		testList.remove(1);
		
		assertEquals(testList.search(2), 0);
	}

	
	/**
	 * Tests removing an integer that does not exist in the list.
	 */
	@Test
	public void testRemoveFail() {
		SimpleList testList = new SimpleList();
		testList.add(4);
		
		assertEquals(testList.search(1), -1);
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
	
	
	/*
	 * Tests count on a full list. 
	 */
	@Test
	public void testCountFull() {
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
		
		assertEquals(testList.count(), 10);
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