package tdd.intervalHierarchy;

public class ClosedInterval extends Interval {

	public ClosedInterval(double min, double max) {
		super(min, max);
	}

	boolean isIncluded(double value) {
		return this.min.value <= value && value <= this.max.value;
	}
}
