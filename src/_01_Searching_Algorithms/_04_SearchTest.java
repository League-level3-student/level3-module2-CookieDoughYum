package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] test0 = {"Taco", "Nacho", "Toquito"};
		assertEquals(0, _00_LinearSearch.linearSearch(test0, "Taco"));
		assertEquals(1, _00_LinearSearch.linearSearch(test0, "Nacho"));
		assertEquals(2, _00_LinearSearch.linearSearch(test0, "Toquito"));
		
		String[] test1 = {"Once", "upon", "a", "time", "in", "the", "East"};
		assertEquals(6, _00_LinearSearch.linearSearch(test1, "East"));
		
		String[] test2 = {"Taco", "Nacho", "Toquito"};
		assertEquals(-1, _00_LinearSearch.linearSearch(test2, "Loco"));
	
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] arr0 = {0, 1, 2, 3, 4, 5};
		assertEquals(0, _01_BinarySearch.binarySearch(arr0, 0, arr0.length - 1, 0));
		assertEquals(1, _01_BinarySearch.binarySearch(arr0, 0, arr0.length - 1, 1));
		assertEquals(2, _01_BinarySearch.binarySearch(arr0, 0, arr0.length - 1, 2));
		assertEquals(3, _01_BinarySearch.binarySearch(arr0, 0, arr0.length - 1, 3));
		
		assertEquals(-1, _01_BinarySearch.binarySearch(arr0, 0, arr0.length - 1, 99));
		
		int[] arr1 = {0, 43, 209, 388, 401, 599};
		assertEquals(2, _01_BinarySearch.binarySearch(arr1, 0, arr0.length - 1, 209));
		assertEquals(-1, _01_BinarySearch.binarySearch(arr1, 0, arr0.length - 1, 45));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
