package tdd.intervalHierarchy;

public class IntervalBuilder {

	private double min;
	
	private double max;
	
	private IntervalType type;
	
	IntervalBuilder(){
		this.min = 0;
		this.max = 1;
	}
	
	IntervalBuilder min(double min) {
		this.min = min;
		return this;
	}

	IntervalBuilder max(double max) {
		this.max = max;
		return this;
	}

	IntervalBuilder type(IntervalType type) {
		this.type = type;
		return this;
	}

	Interval build() {
		assert this.min <= this.max;
		
		switch (this.type) {
		case OPEN:
			return new OpenInterval(this.min, this.max);
		case CLOSED:
			return new ClosedInterval(this.min, this.max);
		}
		return null;
	}
}
