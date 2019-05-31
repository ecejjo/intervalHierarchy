package tdd.intervalHierarchy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PointMixedTest {
	
	@Test
	public void testPointToFrom_Equals_NoneIncluded() {
		Point pointTo = new PointTo(3, false);
		Point pointFrom = new PointFrom(3, false);
		assertTrue(pointTo.isLeftTo(pointFrom));
	}

	@Test
	public void testPointToFrom_Equals_ToIncludedFromNotIncluded() {
		Point pointTo = new PointTo(3, true);
		Point pointFrom = new PointFrom(3, false);
		assertFalse(pointTo.isLeftTo(pointFrom));
	}
	
	@Test
	public void testPointToFrom_Equals_ToNotIncludedFromIncluded() {
		Point pointTo = new PointTo(3, false);
		Point pointFrom = new PointFrom(3, true);
		assertTrue(pointTo.isLeftTo(pointFrom));
	}

	@Test
	public void testPointToFrom_Equals_ToIncludedFromIncluded() {
		Point pointTo = new PointTo(3, true);
		Point pointFrom = new PointFrom(3, true);
		assertFalse(pointTo.isLeftTo(pointFrom));
	}
	
	@Test
	public void testPointToFrom_NotEquals_ToNotIncludedFromNotIncluded() {
		Point pointTo = new PointTo(1, false);
		Point pointFrom = new PointFrom(3, false);
		assertTrue(pointTo.isLeftTo(pointFrom));
	}

}
