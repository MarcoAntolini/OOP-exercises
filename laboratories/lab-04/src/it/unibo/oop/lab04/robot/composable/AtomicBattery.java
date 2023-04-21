package it.unibo.oop.lab04.robot.composable;

public class AtomicBattery extends Component {

	private static final double START_CONSUMPTION = 0.1;

	public AtomicBattery() {
		super("Atomic Battery");
	}

	@Override
	public double getConsumption() {
		return START_CONSUMPTION;
	}

	@Override
	public void startComponent() {
		if (this.getRobot().isBatteryEnough(START_CONSUMPTION)) {
			this.getRobot().consumeBattery(START_CONSUMPTION);
			restoreRobotBattery();
		}
	}

	private void restoreRobotBattery() {
		if (this.getRobot().getBatteryLevel() < 50) {
			this.getRobot().recharge();
		}
	}

}
