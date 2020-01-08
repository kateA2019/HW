public class Smartphone extends CellPhone {
    private String operationSystem;

    public Smartphone (int year, int hour, String operationSystem) {
        super(year, hour);
        this.operationSystem = operationSystem;
    }

    public void  install(String program) {
        System.out.println("Installing " + program + " for " + operationSystem);
    }

}
