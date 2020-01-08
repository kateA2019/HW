public class ThomasEdisonPhone extends AbstractPhone {

    public ThomasEdisonPhone(int year) {
        super(year);
    }
    @Override
    public void call(long outputNumber) {
        System.out.println("ThomasEdisonPhone - Вращайте ручку");
        System.out.println("ThomasEdisonPhone - Сообщите номер абонента, сэр");
    }
    @Override
    public void ring(long inputNumber) {
        System.out.println("ThomasEdisonPhone - Телефон звонит");
    }
}