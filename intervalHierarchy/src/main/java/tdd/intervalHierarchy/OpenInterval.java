package tdd.intervalHierarchy;

public class OpenInterval extends Interval {

	public OpenInterval(double min, double max) {
		super(min, max);
	}

	boolean isIncluded(double value) {
		return this.min.value < value && value < this.max.value;
	}
}
