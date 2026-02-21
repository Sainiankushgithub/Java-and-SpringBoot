// Code with proper SOLID principle design and Synchronization
class BookingTicketTask{
    private int total_seats = 10;
    public synchronized void bookSeats(int seats){
        if(total_seats>=seats){
            total_seats-=seats;
            System.out.println(Thread.currentThread().getName()+" : "+"Seats Booked Successfully!");
            System.out.println("Seats Left : "+total_seats);
        }else{
            System.out.println(Thread.currentThread().getName()+" : "+"Seats cannot be booked.");
            System.out.println("Seats left : "+total_seats);
        }
    }
}
class TicketBooking implements Runnable{
    private BookingTicketTask bookingTicketTask;
    private int seats;
    TicketBooking(BookingTicketTask bookingTicketTask , int seats){
        this.bookingTicketTask = bookingTicketTask;
        this.seats=seats;
    }
    @Override
    public void run() {
        bookingTicketTask.bookSeats(seats);
    }
}
public class MovieBookingAppSync {
    public static void main(String[] args) {
        BookingTicketTask bookingTicketTask = new BookingTicketTask();
        Thread t1 = new Thread(new TicketBooking(bookingTicketTask,6));
        Thread t2 = new Thread(new TicketBooking(bookingTicketTask,7));
        t1.start();
        t2.start();
    }
}
