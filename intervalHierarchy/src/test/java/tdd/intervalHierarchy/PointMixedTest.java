package tdd.intervalHierarchy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PointMixedTest {
	
	@Test
	public void testPointToFrom_Equals_NoneIncluded() {
		PointTo pointTo = new PointTo(3, false);
		PointFrom pointFrom = new PointFrom(3, false);
		assertTrue(pointTo.isLeftTo(pointFrom));
	}

	@Test
	public void testPointToFrom_Equals_ToIncludedFromNotIncluded() {
		PointTo pointTo = new PointTo(3, true);
		PointFrom pointFrom = new PointFrom(3, false);
		assertFalse(pointTo.isLeftTo(pointFrom));
	}
	
	@Test
	public void testPointToFrom_Equals_ToNotIncludedFromIncluded() {
		PointTo pointTo = new PointTo(3, false);
		PointFrom pointFrom = new PointFrom(3, true);
		assertTrue(pointTo.isLeftTo(pointFrom));
	}

	@Test
	public void testPointToFrom_Equals_ToIncludedFromIncluded() {
		PointTo pointTo = new PointTo(3, true);
		PointFrom pointFrom = new PointFrom(3, true);
		assertTrue(pointTo.isLeftTo(pointFrom));
	}
	
	@Test
	public void testPointToFrom_NotEquals_ToNotIncludedFromNotIncluded() {
		PointTo pointTo = new PointTo(1, false);
		PointFrom pointFrom = new PointFrom(3, false);
		assertTrue(pointTo.isLeftTo(pointFrom));
	}

}
