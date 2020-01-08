public class VideoPhone extends AbstractPhone{

    public VideoPhone(int year) {
        super(year);
    }
    @Override
    public void call(long outputNumber) {
        System.out.println("VideoPhone - Подключаю видеоканал для абонента " + outputNumber );
    }
    @Override
    public void ring(long inputNumber) {
        System.out.println("VideoPhone - У вас входящий видеовызов..." + inputNumber);
    }

}
