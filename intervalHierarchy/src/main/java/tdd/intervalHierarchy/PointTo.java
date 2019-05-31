package tdd.intervalHierarchy;

public class PointTo extends Point {
	
	public PointTo(double value, boolean included) {
		super(value, included);
	}

	public boolean isLeftTo(Point other) {
		if (this.value != other.value) {
			return this.isLeftToWhenNoEquals(other);
		}
		
		if (this.included && other.included) {
			return false;
		}
		return ! this.included;
	}
}
