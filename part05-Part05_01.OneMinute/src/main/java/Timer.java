
public class Timer {
    private ClockHand seconds;
    private ClockHand cents;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.cents = new ClockHand(100);
    }

    public void advance() {
        this.cents.advance();

        if (this.cents.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return seconds +":"+ cents;
    }
}
