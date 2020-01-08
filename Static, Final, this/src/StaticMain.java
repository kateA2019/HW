public class StaticMain {
    public static void main(String[] args){
        Student.setCllgName("First college");

        Student s1 = new Student("Kate");
        Student s2 = new Student("Bob");

        s1.getStudentInfo();
        s2.getStudentInfo();
    }

}
