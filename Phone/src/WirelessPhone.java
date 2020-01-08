public abstract class WirelessPhone extends AbstractPhone {
    //Inheritance
    //ресурс работы аккумуляторных батарей в часах.
    private int hour;

    public WirelessPhone(int year, int hour) {
        super(year);
        this.hour = hour;
    }
}
