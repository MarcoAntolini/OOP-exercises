package oop.lab02.constructors;

public class Train {

    final static int defaultTotSeats = 150;
    final static int defaultFCSeats = 50;
    final static int defaultSCSeats = 100;
    int nTotSeats;
    int nFCSeats;
    int nSCSeats;
    int nFCReservedSeats;
    int nSCReservedSeats;

    Train(final int nTotSeats, final int nFCSeats, final int nSCSeats) {
        this.nTotSeats = nTotSeats;
        this.nFCSeats = nFCSeats;
        this.nSCSeats = nSCSeats;
        this.nFCReservedSeats = 0;
        this.nSCReservedSeats = 0;
    }

    Train(final int nFCSeats, final int nSCSeats) {
        this(nFCSeats + nSCSeats, nFCSeats, nSCSeats);
    }

    Train() {
        this(defaultTotSeats, defaultFCSeats, defaultSCSeats);
    }

    void reserveFCSeats(final int nSeats) {
        this.nFCReservedSeats += nSeats;
    }

    void reserveSCSeats(final int nSeats) {
        this.nSCReservedSeats += nSeats;
    }

    double getTotOccupancyRatio() {
        return (this.nFCReservedSeats + this.nSCReservedSeats) * 100d / this.nTotSeats;
    }

    double getFCOccupancyRatio() {
        return this.nFCReservedSeats * 100d / this.nFCSeats;
    }

    double getSCOccupancyRatio() {
        return this.nSCReservedSeats * 100d / this.nSCSeats;
    }

    void deleteAllReservations() {
        this.nFCReservedSeats = 0;
        this.nSCReservedSeats = 0;
    }

    void printTrainInfo() {
        System.out.println("Train total seats: " + this.nTotSeats);
        System.out.println("Train first class seats: " + this.nFCSeats);
        System.out.println("Train second class seats: " + this.nSCSeats);
        System.out.println("Train reserved first class seats: " + this.nFCReservedSeats);
        System.out.println("Train reserved second class seats: " + this.nSCReservedSeats + "\n");
    }
}
