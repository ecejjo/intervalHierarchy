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
		
		switch (this.type) {
		case OPEN:
			this.min.included = false;
			this.max.included = false;
			return new OpenInterval(this.min.value, this.max.value);
		case CLOSED:
			this.min.included = true;
			this.max.included = true;
			return new ClosedInterval(this.min.value, this.max.value);
		}
		return null;
	}
}
