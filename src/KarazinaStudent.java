public class KarazinaStudent extends Student {

    @Override
    public void setScholarship (byte key) {
       super.scholarship = (200+50)*key;
        System.out.println("The scholarship is " +super.scholarship+" uah.");
    }
}