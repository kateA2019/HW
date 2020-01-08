public class Client extends Person {
    private String bank;

    public Client(String name, String company) {
        super(name);
        this.bank = company;
    }
    @Override
    public void display() {
        System.out.printf("Client name: %s \t Company: %s \n", super.getName(), bank);
    }
}
