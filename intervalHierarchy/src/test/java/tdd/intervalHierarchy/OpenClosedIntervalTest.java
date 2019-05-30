package tdd.intervalHierarchy;

import org.junit.Test;

import junit.framework.TestCase;

public class OpenClosedIntervalTest extends TestCase {

	@Test
	public void testOpenClosedIsIntersectedOverlapingByLeft() {
		OpenInterval one = new OpenIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(1).max(7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testOpenClosedIsIntersectedOverlapingByLeftWithEquals() {
		OpenInterval one = new OpenIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(3).max(7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testOpenClosedIsIntersectedOverlapingByEquals() {
		OpenInterval one = new OpenIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(3).max(14).build();
		assertTrue(one.isIntersected(another));
	}

}
