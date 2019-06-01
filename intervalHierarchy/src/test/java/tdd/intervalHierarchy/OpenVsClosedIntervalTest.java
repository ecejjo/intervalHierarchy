package tdd.intervalHierarchy;

import org.junit.Test;

import junit.framework.TestCase;

public class OpenVsClosedIntervalTest extends TestCase {

	@Test
	public void testOpenClosedIsIntersectedOverlapingByLeft() {
		Interval one = new IntervalBuilder().type(IntervalType.OPEN).min(3).max(14).build();
		Interval another = new IntervalBuilder().type(IntervalType.CLOSED).min(1).max(7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testOpenClosedIsIntersectedOverlapingByLeftWithEquals() {
		Interval one = new IntervalBuilder().type(IntervalType.OPEN).min(3).max(14).build();
		Interval another = new IntervalBuilder().type(IntervalType.CLOSED).min(3).max(7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testOpenClosedIsIntersectedOverlapingByEquals() {
		Interval one = new IntervalBuilder().type(IntervalType.OPEN).min(3).max(14).build();
		Interval another = new IntervalBuilder().type(IntervalType.CLOSED).min(3).max(14).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testOpenClosedIsIntersectedOverlapingByRight() {
		Interval one = new IntervalBuilder().type(IntervalType.OPEN).min(3).max(14).build();
		Interval another = new IntervalBuilder().type(IntervalType.CLOSED).min(7).max(17).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testOpenClosedIsIntersectedOverlapingByBoth() {
		Interval one = new IntervalBuilder().type(IntervalType.OPEN).min(3).max(14).build();
		Interval another = new IntervalBuilder().type(IntervalType.CLOSED).min(0).max(17).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsOpenClosedIntersectedOverlapingByInside() {
		Interval one = new IntervalBuilder().type(IntervalType.OPEN).min(3).max(14).build();
		Interval another = new IntervalBuilder().type(IntervalType.CLOSED).min(5).max(10).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testOpenClosedIsIntersectedNotOverlapingByLeft() {
		Interval one = new IntervalBuilder().type(IntervalType.OPEN).min(3).max(14).build();
		Interval another = new IntervalBuilder().type(IntervalType.CLOSED).min(0).max(2).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testOpenClosedIsIntersectedNotOverlapingByRight() {
		Interval one = new IntervalBuilder().type(IntervalType.OPEN).min(3).max(14).build();
		Interval another = new IntervalBuilder().type(IntervalType.CLOSED).min(16).max(22).build();
		assertFalse(one.isIntersected(another));
	}
}
