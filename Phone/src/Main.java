public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(2015,20000,"Android");
        smartphone.install("Burning fingers");
        smartphone.call(380991878557L);
        smartphone.ring(380934568218L);

        SomePhone somePhone1 = new SomePhone( 2010, "Nokia");
        somePhone1.call();
        somePhone1.ring();

        AbstractPhone phone = new Phone(1984);
        AbstractPhone thomasEdisonPhone = new ThomasEdisonPhone(1879);
        AbstractPhone videoPhone = new VideoPhone(2018);

        User user1 = new User("Kate");
        user1.callAnotherUser(380667423562L, phone );
        user1.callAnotherUser(380667423562L, thomasEdisonPhone );
        user1.callAnotherUser(380667423562L, videoPhone );

    }

}
