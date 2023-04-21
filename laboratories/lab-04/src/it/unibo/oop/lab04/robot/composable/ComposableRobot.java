package it.unibo.oop.lab04.robot.composable;

import java.util.LinkedList;
import java.util.List;

import it.unibo.oop.lab04.robot.base.BaseRobot;

public class ComposableRobot extends BaseRobot {

	private List<Component> components;
	private double moveConsumption;

	public ComposableRobot(final String robotName) {
		super(robotName);
		components = new LinkedList<>();
	}

	@Override
	public boolean isBatteryEnough(final double operationCost) {
		return super.isBatteryEnough(operationCost);
	}

	@Override
	public void consumeBattery(final double amount) {
		super.consumeBattery(amount);
	}

	public void addComponent(final Component component) {
		this.components.add(component);
		component.connect(this);
	}

	@Override
	public double getBatteryRequirementForMovement() {
		this.moveConsumption = MOVEMENT_DELTA_CONSUMPTION;
		components.stream()
				.filter(component -> component.getName().equals("Right Arm") ||
						component.getName().equals("Left Arm"))
				.forEach(component -> this.moveConsumption += component.getConsumption());
		return moveConsumption;
	}

	public void removeComponent(final Component component) {
		this.components.remove(component);
		component.disconnect();
	}

	public void startComponents() {
		components.stream().filter(Component::isOn).forEach(Component::startComponent);
	}

}
