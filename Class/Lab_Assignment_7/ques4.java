package Class.Lab_Assignment_7;
import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public void setTime() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter hours: ");
            hours = scanner.nextInt();
            if (hours > 24 || hours < 0) {
                throw new HrsException("InvalidHourException: Hour should be between 0 and 24");
            }

            System.out.print("Enter minutes: ");
            minutes = scanner.nextInt();
            if (minutes > 60 || minutes < 0) {
                throw new MinException("InvalidMinuteException: Minute should be between 0 and 60");
            }

            System.out.print("Enter seconds: ");
            seconds = scanner.nextInt();
            if (seconds > 60 || seconds < 0) {
                throw new SecException("InvalidSecondException: Second should be between 0 and 60");
            }

            System.out.println("Correct Time -> " + hours + ":" + minutes + ":" + seconds);
        } 
        catch (HrsException | MinException | SecException e) {
            System.out.println("Caught the exception\nException occurred: " + e);
        }
    }
}

public class ques4 {
    public static void main(String[] args) {
        Time t = new Time();
        t.setTime();
    }
}
