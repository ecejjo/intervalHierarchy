package tdd.intervalHierarchy;

public class Interval {
	
	protected PointFrom min;
	
	protected PointTo max;

	public Interval(double min, double max) {
		this.min = new PointFrom(min, true);
		this.max = new PointTo(max, true);
	}
	
	public void setType (IntervalType type) {
		switch (type) {
		case OPEN:
			this.min.included = false;
			this.max.included = false;
			break;
		case CLOSED:
			this.min.included = true;
			this.max.included = true;
			break;
		}
	}

	public boolean isIntersected(Interval another) {
		return this.isIncluded(another.min) || this.isIncluded(another.max) ||
				another.isIncluded(this.min) || another.isIncluded(this.max);
	}
	
	boolean isIncluded(PointFrom point) {
		return this.min.isLeftTo(point) && ! this.max.isLeftTo(point);
	}
	
	boolean isIncluded(PointTo point) {
		return this.min.isLeftTo(point) && ! this.max.isLeftTo(point);
	}
}
