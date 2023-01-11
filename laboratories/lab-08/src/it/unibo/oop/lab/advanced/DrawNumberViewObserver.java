package it.unibo.oop.lab.advanced;

/**
 * Controller interface.
 */
public interface DrawNumberViewObserver {

    /**
     * Makes a guess.
     * 
     * @param n the attempt
     */
    void newAttempt(int n);

    /**
     * Resets the current game (if any is running) and starts a new one.
     */
    void resetGame();

    /**
     * Gracefully quits from the application.
     */
    void quit();
}
