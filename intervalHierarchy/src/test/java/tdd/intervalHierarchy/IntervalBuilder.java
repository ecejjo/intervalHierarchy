package tdd.intervalHierarchy;

public class IntervalBuilder {

	private Point min;
	
	private Point max;
	
	private IntervalType type;
	
	IntervalBuilder(){
		this.min = new Point(0);
		this.max = new Point(1);
	}
	
	IntervalBuilder min(double min) {
		this.min = new Point(min);
		return this;
	}

	IntervalBuilder max(double max) {
		this.max = new Point(max);
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
			return new OpenInterval(this.min.value, this.max.value);
		case CLOSED:
			return new ClosedInterval(this.min.value, this.max.value);
		}
		return null;
	}
}
