public class Student {
    private String stdName;
    private byte stdAge;
    private long stdPhone;
    public int scholarship;

    public void setStdName(String name) {
        this.stdName = name;
    }

    public void setStdAge (byte age) {
        this.stdAge = age;
    }

    public void setStdPhone (long phone) {
        int length = String.valueOf(phone).length();
        if (length == 12) {
            this.stdPhone = phone;
        } else {System.out.println("The phone length is incorrect"); }
    }
    public long getStdPhone() {
        int length = String.valueOf(stdPhone).length();
        if (length == 12) {
            return stdPhone;
        } else {return 0;}
    }
    public void getData (byte stdAge, String stdName, long stdPhone) {
        this.setStdAge(stdAge);
        this.setStdName(stdName);
        this.setStdPhone(stdPhone);
        System.out.println("Student name is "+stdName);
        System.out.println("Student age is "+stdAge);
        System.out.println("Student phone is "+this.getStdPhone());
    }

    public void setScholarship (byte key){
        this.scholarship = 200*key;
    }
}