class Train {
    int nTotSeats;
    int nFirstClassSeats;
    int nSecondClassSeats;
    int nFirstClassReservedSeats;
    int nSecondClassReservedSeats;

    void build(int firstClassSeats, int secondClassSeats) {
        this.nFirstClassSeats = firstClassSeats;
        this.nSecondClassSeats = secondClassSeats;
        nTotSeats = firstClassSeats + secondClassSeats;
        nFirstClassReservedSeats = 0;
        nSecondClassReservedSeats = 0;
    }

    void reserveFirstClassSeats(int seats) {
        nFirstClassReservedSeats += seats;
    }

    void reserveSecondClassSeats(int seats) {
        nSecondClassReservedSeats += seats;
    }

    double getTotOccupancyRatio() {
        return (double) (nFirstClassReservedSeats + nSecondClassReservedSeats) / (nFirstClassSeats + nSecondClassSeats);
    }

    double getFirstClassOccupancyRatio() {
        return (double) nFirstClassReservedSeats / nFirstClassSeats;
    }

    double getSecondClassOccupancyRatio() {
        return (double) nSecondClassReservedSeats / nSecondClassSeats;
    }

    void deleteAllReservations() {
        nFirstClassReservedSeats = 0;
        nSecondClassReservedSeats = 0;
    }
}