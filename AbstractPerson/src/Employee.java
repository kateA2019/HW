public class Employee extends Person{
    private String company;
    public Employee (String name, String myCompany){
        super(name);
        this.company = myCompany;
    }

    @Override
    public void display() {
        System.out.printf( "Emploee name: %s \t Company: %s \n", super.getName(), company );
    }
}
