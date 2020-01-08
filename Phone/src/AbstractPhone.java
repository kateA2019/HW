public abstract class AbstractPhone {
    private int year;

    public AbstractPhone(int year) {
        this.year = year;
    }

    public abstract void call (long outputNumber);
    public abstract void ring (long inputNumber);
}
