package week4.clock;

public class Runner {
    public static void main(String[] args) {
        ex78ClockCounter counter = new ex78ClockCounter(4);
        System.out.println("Value at start: " + counter);

        int i = 0;
        while (i < 10) {
            counter.next();
            System.out.println("Value: " + counter);
            i++;
        }
    }

}
