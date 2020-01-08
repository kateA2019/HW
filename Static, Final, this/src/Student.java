// static keyword with methods and variables
public class Student {
    String name;
    int rollNo;
    static  String cllgName;
    static int counter = 0;

    public Student(String name) {
        this.name = name;
        this.rollNo = setRollNo();
    }
    // static/global method
    static void setCllgName(String name) {
        cllgName = name;
    }
    // getting unique rollNo through static variable(counter)
    static int setRollNo(){
        counter++;
        return counter;
    }
       // instance/object method
    void getStudentInfo (){
        System.out.println("name : " + this.name);
        System.out.println("rollNo : " + this.rollNo);
        System.out.println("cllgName : " + cllgName); // accessing static variable without 'this'
    }
}