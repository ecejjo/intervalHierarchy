package tdd.intervalHierarchy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PointToTest {
	
	@Test
	public void testPointToIsToLeftToBothIncluded() {
		PointTo one = new PointTo(3,true);
		PointTo other = new PointTo(5, true);
		assertTrue(one.isLeftTo(other));
	}
	
	@Test
	public void testPointToIsNotToLeftToBothIncluded() {
		PointTo one = new PointTo(5,true);
		PointTo other = new PointTo(3, true);
		assertFalse(one.isLeftTo(other));
	}
	
	@Test
	public void testPointToIsLeftTo_EqualsBothIncluded() {
		PointTo one = new PointTo(3,true);
		PointTo other = new PointTo(3, true);
		assertFalse(one.isLeftTo(other));
	}

	@Test
	public void testPointToIsLeftToEqualsFirstNotIncluded() {
		PointTo one = new PointTo(3,false);
		PointTo other = new PointTo(3, true);
		assertTrue(one.isLeftTo(other));
	}

	@Test
	public void testPointToIsLeftToEqualsSecondNotIncluded() {
		PointTo one = new PointTo(3,true);
		PointTo other = new PointTo(3, false);
		assertFalse(one.isLeftTo(other));
	}

	@Test
	public void testPointToIsLeftToEqualsNoneIncluded() {
		PointTo one = new PointTo(3,false);
		PointTo other = new PointTo(3, false);
		assertTrue(one.isLeftTo(other));
	}

}
