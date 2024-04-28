//Updated version of sync2 example here customer can enter using scanner class 
//The Work of Customer 1(including To enter ticket, Succesfull or not display) was completed than only Customer 2 will executed.

import java.util.Scanner;

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
    BookTheatreSeats b;
    int seats;

    MovieBookApp(BookTheatreSeats b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    public void run() {
        b.bookseats(seats);
    }
}

class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BookTheatreSeats b1 = new BookTheatreSeats();

        System.out.println("Customer 1: Enter Seats To Booked: ");
        int x1 = sc.nextInt();
        MovieBookApp t1 = new MovieBookApp(b1, x1);
        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Customer 2: Enter Seats To Booked: ");
        int x2 = sc.nextInt();
        MovieBookApp t2 = new MovieBookApp(b1, x2);

        t2.start();

    }
}

/*

The Booking Process

Setup:

A BookTheatreSeats object (b1) is created, representing the theater with 10 seats.
A Scanner is set up to take user input.
Customer 1:

The program asks Customer 1 for the number of seats.
A MovieBookApp thread (t1) is created, assigned the theater (b1) and the requested seats.
Thread t1 starts running, and it tries to call the bookseats method.
Thread Magic (bookseats)

The synchronized keyword on bookseats makes sure only one customer can book at a time (only one thread in this method).
The booking logic remains the same (checking seats, updating, etc.).
Customer 2 (After Turn)

t1.join() makes the main thread wait for t1 to finish.
Then, the process repeats for Customer 2.
Key Concepts (Recap)

synchronized: Ensures only one thread can book seats at a time, preventing conflicts.
Threads: Represent customers booking seats, adding a sense of real-time action.
Scanner: Allows for interactive user input.
join(): Makes the program wait for one customer to finish their booking before proceeding with the next one.*/
