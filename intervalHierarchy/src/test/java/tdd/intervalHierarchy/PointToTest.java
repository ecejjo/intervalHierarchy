package tdd.intervalHierarchy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PointToTest {
	
	@Test
	public void testPointToIsToLeftToBothIncluded() {
		Point one = new PointTo(3,true);
		Point other = new PointTo(5, true);
		assertTrue(one.isLeftTo(other));
	}
	
	@Test
	public void testPointToIsNotToLeftToBothIncluded() {
		Point one = new PointTo(5,true);
		Point other = new PointTo(3, true);
		assertFalse(one.isLeftTo(other));
	}
	
	@Test
	public void testPointToIsLeftToEqualsBothIncluded() {
		Point one = new PointTo(3,true);
		Point other = new PointTo(3, true);
		assertTrue(one.isLeftTo(other));
	}

	@Test
	public void testPointToIsLeftToEqualsFirstNotIncluded() {
		Point one = new PointTo(3,false);
		Point other = new PointTo(3, true);
		assertTrue(one.isLeftTo(other));
	}

	@Test
	public void testPointToIsLeftToEqualsSecondNotIncluded() {
		Point one = new PointTo(3,true);
		Point other = new PointTo(3, false);
		assertFalse(one.isLeftTo(other));
	}

	@Test
	public void testPointToIsLeftToEqualsNoneIncluded() {
		Point one = new PointTo(3,false);
		Point other = new PointTo(3, false);
		assertTrue(one.isLeftTo(other));
	}

}
