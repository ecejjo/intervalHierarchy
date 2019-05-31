package tdd.intervalHierarchy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PointFromTest {
	
	@Test
	public void testPointFromIsToLeftToBothIncluded() {
		Point one = new PointFrom(3,true);
		Point other = new PointFrom(5, true);
		assertTrue(one.isLeftTo(other));
	}
	
	@Test
	public void testPointFromIsNotToLeftToBothIncluded() {
		Point one = new PointFrom(5,true);
		Point other = new PointFrom(3, true);
		assertFalse(one.isLeftTo(other));
	}
	
	@Test
	public void testPointFromIsNotToLeftToEqualsBothIncluded() {
		Point one = new PointFrom(3,true);
		Point other = new PointFrom(3, true);
		assertTrue(one.isLeftTo(other));
	}

	@Test
	public void testPointFromIsLeftToEqualsFirstNotIncluded() {
		Point one = new PointFrom(3,false);
		Point other = new PointFrom(3, true);
		assertFalse(one.isLeftTo(other));
	}

	@Test
	public void testPointFromIsLeftToEqualsSecondNotIncluded() {
		Point one = new PointFrom(3,true);
		Point other = new PointFrom(3, false);
		assertTrue(one.isLeftTo(other));
	}

	@Test
	public void testPointFromIsLeftToEqualsNoneIncluded() {
		Point one = new PointFrom(3,false);
		Point other = new PointFrom(3, false);
		assertTrue(one.isLeftTo(other));
	}

}
