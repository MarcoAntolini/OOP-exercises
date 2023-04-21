package it.unibo.oop.lab04.robot.composable;

public class PrehensileArm extends ControllableComponent {

	private static final double START_CONSUMPTION = 1;
	private static final double PICK_CONSUMPTION = 0.1;
	private static final double DROP_CONSUMPTION = 0.1;
	private static final double MOVE_CONSUMPTION = 0.1;
	private boolean isHolding;

	public PrehensileArm(final String name) {
		super(name);
		this.isHolding = false;
	}

	@Override
	public double getConsumption() {
		return MOVE_CONSUMPTION;
	}

	@Override
	public void startComponent() {
		if (this.getRobot().isBatteryEnough(START_CONSUMPTION)) {
			this.getRobot().consumeBattery(START_CONSUMPTION);
		}
	}

	@Override
	public void executeCommand(final String command) {
		if (this.isConnected() && this.isOn()) {
			switch (command) {
				case "pick":
					if (!this.isHolding && this.getRobot().isBatteryEnough(PICK_CONSUMPTION)) {
						this.getRobot().consumeBattery(PICK_CONSUMPTION);
						this.isHolding = true;
					}
					break;
				case "drop":
					if (this.isHolding && this.getRobot().isBatteryEnough(DROP_CONSUMPTION)) {
						this.getRobot().consumeBattery(DROP_CONSUMPTION);
						this.isHolding = false;
					}
					break;
				default:
					throw new IllegalArgumentException("Command not supported");
			}
		}
	}

	public boolean isHolding() {
		return this.isHolding;
	}

}
