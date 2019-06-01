package tdd.intervalHierarchy;

public class PointFrom extends Point {
	
	public PointFrom(double value, boolean included) {
		super(value, included);
	}

	public boolean isLeftTo(PointFrom other) {
		if (this.value != other.value) {
			return this.isLeftToWhenNoEquals(other);
		}
		if (this.included) {
			return true;
		}
		return (! this.included && ! other.included);
	}

	public boolean isLeftTo(PointTo other) {
		if (this.value != other.value) {
			return this.isLeftToWhenNoEquals(other);
		}
		if (! this.included) {
			return false;
		}
		if (! other.included) {
			return false;
		}
		return true;
	}
}
