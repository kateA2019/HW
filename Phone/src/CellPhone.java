public class CellPhone extends WirelessPhone {
    public CellPhone(int year, int hour) {
        super(year, hour);
    }
    @Override
    public void call (long outputNumber) {
        System.out.println("Dialing number "+ outputNumber);
    }
    @Override
    public void ring (long inputNumber) {
        System.out.println("Incoming call from "+ inputNumber);
    }
}
