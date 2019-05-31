package tdd.intervalHierarchy;

public class PointFrom extends Point {
	
	public PointFrom(double value, boolean included) {
		super(value, included);
	}

	public boolean isLeftTo(Point other) {
		if (this.value != other.value) {
			return this.isLeftToWhenNoEquals(other);
		}
		if (! this.included && ! other.included) {
			return true;
		}
		return (this.included);
	}
}
