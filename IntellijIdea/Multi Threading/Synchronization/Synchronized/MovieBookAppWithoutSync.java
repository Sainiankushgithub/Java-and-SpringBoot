class BookTicket{
    int total_seats = 10;
    public void bookSeat(int seats){
        if(total_seats>=seats){
            total_seats-=seats;
            System.out.println("Seats Booked SuccessFully ! ");
            System.out.println("Seat Left : "+total_seats);
        }else{
            System.out.println("Seats Cannot be booked !");
            System.out.println("Seats left : "+total_seats);
        }
    }
}
public class MovieBookAppWithoutSync extends Thread{
    static BookTicket b;
    int seats;
    public void run(){
        b.bookSeat(seats);
    }
    public static void main(String[] args) {
        b = new BookTicket();
        MovieBookAppWithoutSync t1 = new MovieBookAppWithoutSync();
        t1.seats=7;
        t1.start();

        MovieBookAppWithoutSync t2 = new MovieBookAppWithoutSync();
        t2.seats =6;
        t2.start();
    }
}
