package it.unibo.oop.lab04.robot.composable;

public abstract class ControllableComponent extends Component {

	protected ControllableComponent(final String name) {
		super(name);
	}

	protected abstract void executeCommand(final String command);

}
