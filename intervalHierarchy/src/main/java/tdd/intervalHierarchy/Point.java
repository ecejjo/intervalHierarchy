package tdd.intervalHierarchy;

public abstract class Point {
	
	double value;
	
	boolean included;
	
	public Point(double value, boolean included) {
		this.value = value;
		this.included = included;
	}
	
	public abstract boolean isLeftTo(PointFrom other);

	public abstract boolean isLeftTo(PointTo other);
	
	protected boolean isLeftToWhenNoEquals(Point other) {
		return (this.value < other.value);
	}
}
