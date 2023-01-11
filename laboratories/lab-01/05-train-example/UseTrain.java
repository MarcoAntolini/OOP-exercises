class UseTrain {
    public static void main(String[] args) {
        Train train = new Train();
        train.build(100, 200);
        train.reserveFirstClassSeats(10);
        train.reserveSecondClassSeats(20);
        System.out.println("Occupancy ratio: " + train.getTotOccupancyRatio());
        System.out.println("First class occupancy ratio: " + train.getFirstClassOccupancyRatio());
        System.out.println("Second class occupancy ratio: " + train.getSecondClassOccupancyRatio());
        train.deleteAllReservations();
        train.reserveFirstClassSeats(50);
        train.reserveSecondClassSeats(100);
        System.out.println("Occupancy ratio: " + train.getTotOccupancyRatio());
        System.out.println("First class occupancy ratio: " + train.getFirstClassOccupancyRatio());
        System.out.println("Second class occupancy ratio: " + train.getSecondClassOccupancyRatio());
    }
}
