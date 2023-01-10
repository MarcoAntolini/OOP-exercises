package oop.lab02.constructors;

public class UseConstructorsEvolved {

    public static void main(final String[] args) {
        Train train1 = new Train();
        Train train2 = new Train(20, 200);
        Train train3 = new Train(35, 165);
        train1.printTrainInfo();
        train2.printTrainInfo();
        train3.printTrainInfo();
    }

}
