package it.unibo.oop.lab04.robot.arms;

import it.unibo.oop.lab04.robot.base.BaseRobot;

public class RobotWithTwoArms extends BaseRobot implements RobotWithArms {

	private static final double CONSUMPTION_FOR_CARRYING = 0.1;
	private final BasicArm leftArm;
	private final BasicArm rightArm;
	private int carriedItemsCount;

	public RobotWithTwoArms(String robotName) {
		super(robotName);
		this.leftArm = new BasicArm("left");
		this.rightArm = new BasicArm("right");
	}

	@Override
	public boolean pickUp() {
		if (!this.leftArm.isGrabbing() && this.isBatteryEnough(this.leftArm.getConsuptionForPickUp())) {
			this.leftArm.pickUp();
			this.carriedItemsCount++;
			this.consumeBattery(this.leftArm.getConsuptionForPickUp());
			return true;
		} else if (!this.rightArm.isGrabbing() && this.isBatteryEnough(this.rightArm.getConsuptionForPickUp())) {
			this.rightArm.pickUp();
			this.carriedItemsCount++;
			this.consumeBattery(this.rightArm.getConsuptionForPickUp());
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean dropDown() {
		if (this.leftArm.isGrabbing() && this.isBatteryEnough(this.leftArm.getConsuptionForDropDown())) {
			this.leftArm.dropDown();
			this.carriedItemsCount--;
			this.consumeBattery(this.leftArm.getConsuptionForDropDown());
			return true;
		} else if (this.rightArm.isGrabbing() && this.isBatteryEnough(this.rightArm.getConsuptionForDropDown())) {
			this.rightArm.dropDown();
			this.carriedItemsCount--;
			this.consumeBattery(this.rightArm.getConsuptionForDropDown());
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int getCarriedItemsCount() {
		return this.carriedItemsCount;
	}

	@Override
	public double getBatteryRequirementForMovement() {
		return MOVEMENT_DELTA_CONSUMPTION + (this.carriedItemsCount * CONSUMPTION_FOR_CARRYING);
	}

}
