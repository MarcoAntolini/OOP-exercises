package it.unibo.oop.lab04.robot.composable;

public abstract class Component {

	private ComposableRobot robot;
	private String name;
	private boolean isOn;
	private boolean isConnected;

	protected Component(final String name) {
		this.name = name;
		this.isOn = false;
		this.isConnected = false;
	}

	public void turnOn() {
		this.isOn = true;
	}

	public void turnOff() {
		this.isOn = false;
	}

	public boolean isOn() {
		return this.isOn;
	}

	public void connect(final ComposableRobot robot) {
		this.robot = robot;
		this.isConnected = true;
	}

	public void disconnect() {
		this.robot = null;
		this.isConnected = false;
	}

	public boolean isConnected() {
		return this.isConnected;
	}

	public ComposableRobot getRobot() {
		return this.robot;
	}

	public abstract double getConsumption();

	public abstract void startComponent();

	public String getName() {
		return this.name;
	}

	public String toString() {
		return "Component: " + this.name + " is " + (this.isOn ? "on" : "off") + " and "
				+ (this.isConnected ? ("connected to " + this.robot) : "disconnected") + ".";
	}

}
