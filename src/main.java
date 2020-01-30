public class main {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.getData((byte)15, "K", 3809918780883L);
        student1.setScholarship((byte)10);
        System.out.println("---------------------------------------");

        KarazinaStudent karazinaStudent1 = new KarazinaStudent();
        karazinaStudent1.getData((byte)20, "Ivan", 380715468912L);
        karazinaStudent1.setScholarship((byte)11);


    }
}