package tdd.intervalHierarchy;

public class PointTo extends Point {
	
	public PointTo(double value, boolean included) {
		super(value, included);
	}

	@Override
	public boolean isLeftTo(PointTo other) {
		if (this.value != other.value) {
			return this.isLeftToWhenNoEquals(other);
		}
		if (this.included && ! other.included) {
			return false;
		}
		if (! this.included && other.included) {
			return true;
		}
		return (! this.included && ! other.included);
	}

	@Override
	public boolean isLeftTo(PointFrom other) {
		if (this.value != other.value) {
			return this.isLeftToWhenNoEquals(other);
		}
		if (this.included && ! other.included) {
			return true;
		}
		if (! this.included) {
			return true;
		}
		return (this.included && other.included);
	}
}
