package PacJava;
import java.util.Scanner;


abstract class Passenger {
    abstract void Name(String Name);
    abstract void Age(int Age);
    abstract void MobileNo(int MobileNo);
    abstract void Time(String Time);
}

	
public class Busbooking extends Passenger {
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

    
    void Time(String Time) {
        System.out.println("Time: " + Time);
    }

    
    void bookSeat(int SeatNo, String PassName) {
        if (SeatNo < 1 || SeatNo > 60) {
            System.out.println("Invalid Seat Number!!");
            return;
        }
        if (seats[SeatNo - 1] == null) {
            seats[SeatNo - 1] = PassName;
            System.out.println("Seat " + SeatNo + " is successfully booked for " + PassName);
        } else {
            System.out.println("Seat " + SeatNo + " is already booked.");
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

    // Show all booked seats
    void showAllBookings() {
        System.out.println("Booked Seats:");
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] != null) {
                System.out.println("Seat " + (i + 1) + ": " + seats[i]);
            }
        }
    }

    public static void main(String[] args) {
        Busbooking bus = new Busbooking();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("**BusReservation System**");
            System.out.println("1. Book Seat");
            System.out.println("2. Show Available Seats");
            System.out.println("3. Show Booked Seats");
            System.out.println("4. Exit");
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
                    bus.showAvailableSeats();
                    break;

                case 3:
                    bus.showAllBookings();
                    break;

                case 4:
                    System.out.println("Thank you!!!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!!!.select between 1-4.");
            }
        }
    }
}


//package PacJava;
//import java.util.Scanner;
//
//abstract class Passenger{
//	abstract void Name(String Name);
//	abstract void Age(int Age);
//	abstract void MobileNo(int MobileNo);
//	abstract void Time(String Time);
//}
//public class Busbooking extends class Passengers {
//   private String[] seats = new String[60];
//   void Name (String Name) {
//	System.out.println("Passenger Name :",Name);   
//   }
//   
//   void Age (int Age) {
//	   System.out.println("Passenger Age:",Age);
//   }
//   
//   void MobileNo(int MobileNo) {
//	   System.out.println("Passenger Mobile No:",MobileNo);
//   }
//   
//   void Time(String Time) {
//	   System.out.println("Time:",Time);
//   }
//   
//   void bookseat(int SeatNo,String PassName) {
//	   if(SeatNo < 1 || SeatNo > 60) {
//		   System.out.Println("Invalid Seat NUmber!!!!");
//	   }
//	   if(Seats[SeatNo - 1] == 0) {
//		   seats[SeatNo] == Name;
//		   System.out.println("seat"+SeatNo+"Is Successfully Booked"+Name);
//	   }else {
//		   System.out.println("seat"+SeatNo+"Is Already Booked");
//	   }
//   }
//   
//   void shoewAvailSeat() {
//	   System.out.print("Available Seats Are:");
//	   
//	   for(int i=1;i<seats.length;i++) {
//		   if(seats[i]==null) {
//			   System.out.println((i+1)+" ");
//		   }
//	   }
//	   System.out.println();
//;   }
//   
//   void AllBookings()
//   {
//	   System.out.println("Bookedseats:");
//	   for(int i =1;i<seats.length;i++ ) {
//		   if(seats[i]!=null) {
//			   System.out.println("seat"+(i+1)+":"+seats[i]);
//		   }
//	   }
//	   
//	   public static void main(String[] args) {
//		   
//		   Scanner sc = new Scanner(System.in);
//		 
//		   while(true) {
//			   
//			   System.out.println("Bus Reservation System!!");
//			   System.out.println("1.BookSeat"\n "2.AvailableSeat" \n "3.Bookedseat" \n "Exit");
//			   
//			   int choice = sc.nextInt();
//			   switch(choice) {
//			   case 1:
//				   System.out.println("Enter Seat Number:");
//				   int SeatNo =sc.NextInt();
//				   sc.NextLine();
//				   
//				   
//			   }
//		   }
//		   
//   }
//
//	}

//}


//package PacJava;
//import java.util.Scanner;
//
//// Abstract class with required methods
//abstract class Passenger {
//    abstract void name(String name);
//    abstract void age(int age);
//    abstract void mobileNo(String mobile);
//    abstract void time(String time);
//}
//
//// Concrete class that extends Passenger
//class BusBooking extends Passenger {
//    private String[] seats = new String[60];
//
//    @Override
//    void name(String name) {
//        System.out.println("Passenger Name: " + name);
//    }
//
//    @Override
//    void age(int age) {
//        System.out.println("Passenger Age: " + age);
//    }
//
//    @Override
//    void mobileNo(String mobile) {
//        System.out.println("Passenger Mobile No: " + mobile);
//    }
//
//    @Override
//    void time(String time) {
//        System.out.println("Booking Time: " + time);
//    }
//
//    // Book a seat
//    void bookSeat(int seatNo, String passengerName) {
//        if (seatNo < 1 || seatNo > 60) {
//            System.out.println("Invalid Seat Number. Please choose between 1-60.");
//            return;
//        }
//        if (seats[seatNo - 1] == null) {
//            seats[seatNo - 1] = passengerName;
//            System.out.println("Seat " + seatNo + " booked successfully for " + passengerName);
//        } else {
//            System.out.println("Seat " + seatNo + " is already booked.");
//        }
//    }
//
//    // Cancel a seat
//    void cancelSeat(int seatNo) {
//        if (seatNo < 1 || seatNo > 60) {
//            System.out.println("Invalid Seat Number.");
//            return;
//        }
//        if (seats[seatNo - 1] != null) {
//            System.out.println("Booking cancelled for seat " + seatNo);
//            seats[seatNo - 1] = null;
//        } else {
//            System.out.println("Seat " + seatNo + " is not booked.");
//        }
//    }
//
//    // Display available seats
//    void showAvailableSeats() {
//        System.out.print("Available Seats: ");
//        for (int i = 0; i < seats.length; i++) {
//            if (seats[i] == null) {
//                System.out.print((i + 1) + " ");
//            }
//        }
//        System.out.println();
//    }
//
//    // Show booking details
//    void showAllBookings() {
//        System.out.println("Booking Details:");
//        for (int i = 0; i < seats.length; i++) {
//            if (seats[i] != null) {
//                System.out.println("Seat " + (i + 1) + ": " + seats[i]);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        BusBooking bus = new BusBooking();
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("\n--- Bus Reservation System ---");
//            System.out.println("1. Book Seat");
//            System.out.println("2. Cancel Seat");
//            System.out.println("3. Show Available Seats");
//            System.out.println("4. Show All Bookings");
//            System.out.println("5. Exit");
//            System.out.print("Choose an option: ");
//            int choice = sc.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter Seat Number to Book (1-60): ");
//                    int seatNo = sc.nextInt();
//                    sc.nextLine(); // Consume newline
//                    System.out.print("Enter Passenger Name: ");
//                    String name = sc.nextLine();
//                    bus.bookSeat(seatNo, name);
//                    break;
//                case 2:
//                    System.out.print("Enter Seat Number to Cancel (1-60): ");
//                    int cancelNo = sc.nextInt();
//                    bus.cancelSeat(cancelNo);
//                    break;
//                case 3:
//                    bus.showAvailableSeats();
//                    break;
//                case 4:
//                    bus.showAllBookings();
//                    break;
//                case 5:
//                    System.out.println("Exiting. Thank you!");
//                    return;
//                default:
//                    System.out.println("Invalid choice. Try again.");
//            }
//        }
//    }
//}