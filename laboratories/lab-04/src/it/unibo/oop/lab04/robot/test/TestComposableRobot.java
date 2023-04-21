package it.unibo.oop.lab04.robot.test;

import it.unibo.oop.lab04.robot.composable.AtomicBattery;
import it.unibo.oop.lab04.robot.composable.BorderNavigator;
import it.unibo.oop.lab04.robot.composable.ComposableRobot;
import it.unibo.oop.lab04.robot.composable.PrehensileArm;

/**
 * Utility class for testing composable robots
 * 
 */
public final class TestComposableRobot {

    private TestComposableRobot() {
    }

    public static void main(final String[] args) {

        AtomicBattery battery = new AtomicBattery();
        BorderNavigator navigator = new BorderNavigator();
        PrehensileArm rightArm = new PrehensileArm("Right Arm");
        PrehensileArm leftArm = new PrehensileArm("Left Arm");

        ComposableRobot robot = new ComposableRobot("Composable Robot");

        robot.addComponent(battery);
        robot.addComponent(navigator);
        robot.addComponent(rightArm);
        robot.addComponent(leftArm);

        robot.startComponents();

    }
}
