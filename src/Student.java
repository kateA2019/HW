public abstract class Student {
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
        }
    }
    public long getStdPhone() {
        int length = String.valueOf(stdPhone).length();
        if (length == 12) {
            System.out.println("Student phone is "+this.stdPhone); return stdPhone;
        } else if (length < 12) {
            System.out.println("The phone length is less than required ಠ_ಠ"); return 0;
        } else
            System.out.println("The phone length is more than required ಠ_ಠ"); return 0;
    }
    public void getData (byte stdAge, String stdName, long stdPhone) {
        this.setStdAge(stdAge);
        this.setStdName(stdName);
        this.setStdPhone(stdPhone);
        System.out.println("Student name is "+stdName);
        System.out.println("Student age is "+stdAge);
        this.getStdPhone();
    }

    public void setScholarship (byte key){
        this.scholarship = 200*key;
    }
}