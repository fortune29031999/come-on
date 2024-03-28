package review;

public class Car {
private String model;

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public Car(String model) {
	super();
	this.model = model;
}

public String toString() {
	return model;
}
}
