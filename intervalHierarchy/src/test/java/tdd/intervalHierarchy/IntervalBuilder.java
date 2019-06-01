package tdd.intervalHierarchy;

public class IntervalBuilder {

	private Point min;
	
	private Point max;
	
	private IntervalType type;
	
	IntervalBuilder(){
		this.min = new PointFrom(0, true);
		this.max = new PointTo(1, true);
	}
	
	IntervalBuilder min(double min) {
		this.min = new PointFrom(min, true);
		return this;
	}

	IntervalBuilder max(double max) {
		this.max = new PointTo(max, true);
		return this;
	}

	IntervalBuilder type(IntervalType type) {
		this.type = type;
		return this;
	}

	Interval build() {
		assert this.min.value <= this.max.value;
		Interval interval = new Interval(this.min.value, this.max.value);
		interval.setType(this.type);
		return interval;		
	}
}
