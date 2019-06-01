package tdd.intervalHierarchy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PointFromTest {
	
	@Test
	public void testPointFromIsToLeftToBothIncluded() {
		PointFrom one = new PointFrom(3,true);
		PointFrom other = new PointFrom(5, true);
		assertTrue(one.isLeftTo(other));
	}
	
	@Test
	public void testPointFromIsNotToLeftToBothIncluded() {
		PointFrom one = new PointFrom(5,true);
		PointFrom other = new PointFrom(3, true);
		assertFalse(one.isLeftTo(other));
	}
	
	@Test
	public void testPointFromIsNotToLeftToEqualsBothIncluded() {
		PointFrom one = new PointFrom(3,true);
		PointFrom other = new PointFrom(3, true);
		assertTrue(one.isLeftTo(other));
	}

	@Test
	public void testPointFromIsLeftToEqualsFirstNotIncluded() {
		PointFrom one = new PointFrom(3,false);
		PointFrom other = new PointFrom(3, true);
		assertFalse(one.isLeftTo(other));
	}

	@Test
	public void testPointFromIsLeftToEqualsSecondNotIncluded() {
		PointFrom one = new PointFrom(3,true);
		PointFrom other = new PointFrom(3, false);
		assertTrue(one.isLeftTo(other));
	}

	@Test
	public void testPointFromIsLeftToEqualsNoneIncluded() {
		PointFrom one = new PointFrom(3,false);
		PointFrom other = new PointFrom(3, false);
		assertTrue(one.isLeftTo(other));
	}

}
