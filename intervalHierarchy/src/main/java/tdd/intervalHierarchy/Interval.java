package tdd.intervalHierarchy;

public abstract class Interval {
	
	protected double min;
	
	protected double max;

	public Interval(double min, double max) {
		this.min = min;
		this.max = max;
	}

	public boolean isIntersected(Interval another) {
		return this.isIncluded(another.min) ||
				this.isIncluded(another.max)||
				another.isIncluded(this.min)||
				another.isEqual(this);
	}

	abstract boolean isIncluded(double value);

	private boolean isEqual(Interval another) {
		return this.min == another.min && this.max == another.max;
	}

}
