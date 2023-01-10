package oop.lab02.cli;

public class TestCommandLine {

    public static void main(final String[] args) {
        if (args.length == 0) {
            System.out.println("No argument has been provided.");
        } else {
            System.out.println("The provided arguments are:");
            for (final String arg : args) {
                System.out.println(" * " + arg + ", " + arg.length() + " characters long");
            }
        }
    }

}
