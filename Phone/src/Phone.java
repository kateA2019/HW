public class Phone extends AbstractPhone {

    public Phone(int year) {
        super(year);
    }

    @Override
    public void call(long outputNumber) {
        System.out.println("Phone - Dialing number "+ outputNumber);
    }

    @Override
    public void ring(long inputNumber) {
        System.out.println("Phone - Incoming call from "+ inputNumber);

    }
}
