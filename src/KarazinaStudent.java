public class KarazinaStudent extends Student {
    private int scholarship;

    @Override
    public void setScholarship (byte key) {
       this.scholarship = 250*key;
        System.out.println("The scholarship is " + this.scholarship + " uah");
    }
}