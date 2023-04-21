package it.unibo.oop.lab04.robot.composable;

public class BorderNavigator extends Component {

	private enum Direction {
		UP, RIGHT, DOWN, LEFT
	}

	private static final double START_CONSUMPTION = 10;

	public BorderNavigator() {
		super("Border Navigator");
	}

	@Override
	public double getConsumption() {
		return START_CONSUMPTION;
	}

	@Override
	public void startComponent() {
		if (this.getRobot().isBatteryEnough(START_CONSUMPTION)) {
			this.getRobot().consumeBattery(START_CONSUMPTION);
			navigateBorder();
		}
	}

	private void navigateBorder() {
		Direction direction = Direction.UP;
		while (this.isConnected() && this.isOn()) {
			if (direction == Direction.UP && !this.getRobot().moveUp()) {
				direction = Direction.RIGHT;
			} else if (direction == Direction.RIGHT && !this.getRobot().moveRight()) {
				direction = Direction.DOWN;
			} else if (direction == Direction.DOWN && !this.getRobot().moveDown()) {
				direction = Direction.LEFT;
			} else if (direction == Direction.LEFT && !this.getRobot().moveLeft()) {
				direction = Direction.UP;
			}
		}
	}

}
