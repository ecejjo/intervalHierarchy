package tdd.intervalHierarchy;

public abstract class Point {
	
	double value;
	
	boolean included;
	
	public Point(double value, boolean included) {
		this.value = value;
		this.included = included;
	}
	
	public abstract boolean isLeftTo(Point other);
	
	protected boolean isLeftToWhenNoEquals(Point other) {
		return (this.value < other.value);
	}
}
