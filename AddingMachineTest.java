package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 *This class is use to test all the functions in AddingMachine class. 
 * @author Xinkai Wang
 *
 */
class AddingMachineTest {

	@Test
	void testGetTotal() {
		AddingMachine addingmachine = new AddingMachine();
		assertEquals(0,addingmachine.getTotal());
	}

	@Test
	void testAdd() {
		AddingMachine addingmachine = new AddingMachine();
		addingmachine.add(8);
		assertEquals(8,addingmachine.getTotal());
	}

	@Test
	void testSubtract() {
		AddingMachine addingmachine = new AddingMachine();
		addingmachine.subtract(7);
		assertEquals(-7,addingmachine.getTotal());
	}

	@Test
	void testToString() {
		AddingMachine addingmachine = new AddingMachine();
		addingmachine.add(8);
		addingmachine.subtract(7);
		assertEquals("0 + 8 - 7",addingmachine.toString());
	}

	@Test
	void testClear() {
		AddingMachine addingmachine = new AddingMachine();
		addingmachine.add(8);
		addingmachine.subtract(7);
		addingmachine.clear();
		assertEquals("0",addingmachine.toString());
		assertEquals(0,addingmachine.getTotal());
	}

}
