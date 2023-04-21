package it.unibo.oop.lab04.robot.arms;

public class BasicArm {

	private static final double CONSUMPTION_FOR_PICK_UP = 0.1;
	private static final double CONSUMPTION_FOR_DROP_DOWN = 0.1;
	private String name;
	private boolean isGrabbing;

	public BasicArm(String name) {
		this.name = name;
		this.isGrabbing = false;
	}

	public boolean isGrabbing() {
		return this.isGrabbing;
	}

	public void pickUp() {
		if (!this.isGrabbing) {
			this.isGrabbing = true;
		}
	}

	public void dropDown() {
		if (this.isGrabbing) {
			this.isGrabbing = false;
		}
	}

	public double getConsuptionForPickUp() {
		return CONSUMPTION_FOR_PICK_UP;
	}

	public double getConsuptionForDropDown() {
		return CONSUMPTION_FOR_DROP_DOWN;
	}

	public String toString() {
		return "BasicArm [name=" + name + ", isGrabbing=" + isGrabbing + "]";
	}
}
