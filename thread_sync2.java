/*
This code simulates a super simple movie ticket booking system. Imagine a theater with only 10 seats. Multiple people (represented by threads) can try to book tickets at the same time. The code makes sure that:

No overbooking: No more seats are sold than are available.
Orderly booking: People trying to book get served one at a time to prevent conflicts.
*/


class BookTheatreSeats {
    int total_seats = 10;

    synchronized void bookseats(int seats) {
        if (seats <= total_seats) {
            System.out.println(seats + " Seats Booked");
            total_seats = total_seats - seats;
            System.out.println("Availabe seats are: " + total_seats);
        } else {
            System.out.println("Booking Failed !!");
            System.out.println("Available seats are only: " + total_seats);
        }
    }
}

class MovieBookApp extends Thread {
    static BookTheatreSeats b;
    int seats;

    public void run() {
        b.bookseats(seats);
    }

    public static void main(String[] args) {
        b = new BookTheatreSeats();

        MovieBookApp t1 = new MovieBookApp();
        t1.seats = 7;
        MovieBookApp t2 = new MovieBookApp();
        t2.seats = 6;

        t1.start();
        t2.start();

    }
}
