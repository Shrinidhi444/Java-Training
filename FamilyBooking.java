package PacJava;
import java.util.Scanner;

abstract class Pass {
    abstract void Name(String Name);
    abstract void Age(int Age);
    abstract void MobileNo(int MobileNo);
    abstract void Time(String Time);
}

public class FamilyBooking extends Pass {
    private String[] seats = new String[60];

    void Name(String Name) {
        System.out.println("Passenger Name: " + Name);
    }

    void Age(int Age) {
        System.out.println("Passenger Age: " + Age);
    }

    void MobileNo(int MobileNo) {
        System.out.println("Passenger Mobile No: " + MobileNo);
    }

    @Override
    void Time(String Time) {
        System.out.println("Time: " + Time);
    }

    void bookSeat(int seatNo, String passengerName) {
        if (seatNo < 1 || seatNo > 60) {
            System.out.println("Invalid Seat Number!!");
            return;
        }
        if (seats[seatNo - 1] == null) {
            seats[seatNo - 1] = passengerName;
            System.out.println("Seat " + seatNo + " successfully booked for " + passengerName);
        } else {
            System.out.println("Seat " + seatNo + " is already booked.");
        }
    }

    void groupBooking(Scanner sc) {
        System.out.print("Enter number of seats you want to book together: ");
        int count = sc.nextInt();
        if (count <= 0 || count > 60) {
            System.out.println("Invalid number of seats requested.");
            return;
        }

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter Seat Number (1-60) for person " + i + ": ");
            int seatNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Passenger Name for seat " + seatNo + ": ");
            String name = sc.nextLine();
            bookSeat(seatNo, name);
        }
    }

    void showAvailableSeats() {
        System.out.print("Available Seats: ");
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == null) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
    }

    void showAllBookings() {
        System.out.println("Booked Seats:");
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] != null) {
                System.out.println("Seat " + (i + 1) + ": " + seats[i]);
            }
        }
    }

    public static void main(String[] args) {
        FamilyBooking bus = new FamilyBooking();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Bus Reservation System");
            System.out.println("1. Book Single Seat");
            System.out.println("2. Book Group Seats");
            System.out.println("3. Show Available Seats");
            System.out.println("4. Show Booked Seats");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Seat Number (1-60): ");
                    int seatNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Passenger Name: ");
                    String name = sc.nextLine();
                    bus.bookSeat(seatNo, name);
                    break;
                case 2:
                    bus.groupBooking(sc);
                    break;
                case 3:
                    bus.showAvailableSeats();
                    break;
                case 4:
                    bus.showAllBookings();
                    break;
                case 5:
                    System.out.println("Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Select between 1-5.");
            }
        }
    }
}
