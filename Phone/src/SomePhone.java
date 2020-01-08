public class SomePhone {
    //Encapsulation - includes *private* methods and properties that
    //cannot be called outside the class

    private  int year;
    private String company;

    public SomePhone(int year, String company) {
        this.year = year;
        this.company = company;
    }

    private void openConnection () {
        //findComutator
        //openNewConnection
    }

    public void call() {
        openConnection();
        System.out.println("Dialing number");
    }

    public void ring () {
        System.out.println("Dzign-dzign");
    }

}
