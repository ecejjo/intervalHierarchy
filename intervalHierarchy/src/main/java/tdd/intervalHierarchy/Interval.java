package tdd.intervalHierarchy;

public abstract class Interval {
	
	protected Point min;
	
	protected Point max;

	public Interval(double min, double max) {
		this.min = new Point(min);
		this.max = new Point(max);
	}

	public boolean isIntersected(Interval another) {
		return this.isIncluded(another.min.value) ||
				this.isIncluded(another.max.value)||
				another.isIncluded(this.min.value)||
				another.isEqual(this);
	}

	abstract boolean isIncluded(double value);

	private boolean isEqual(Interval another) {
		return this.min.value == another.min.value && this.max.value == another.max.value;
	}

}
