public class Student {
    private String stdName;
    private byte stdAge;
    private long stdPhone;
    private int scholarship;

    public void setStdName(String name) {
        int length = String.valueOf(name).length();    // checks the number of symbols in a var 'name'
        if (length>1 & length<10) {
            this.stdName = name;
            System.out.println("Student name is "+ stdName);
        }
        else if (length<=1) {
            System.out.println("The name should contain more than 1 symbol");
        }
        else System.out.println("The name is too long");
    }

    public void setStdAge (byte age) {
        if (age>16 & age<30) {
            this.stdAge = age;
            System.out.println("Student age is " + stdAge);
        }
        else System.out.println("The age is out of allowed range");
    }

    public void setStdPhone (long phone) {
        int length = String.valueOf(phone).length(); // checks the number of symbols in a var 'stdPhone'
        if (length == 12) {
            this.stdPhone = phone;
            System.out.println("Student phone is "+this.stdPhone);
        } else if (length < 12) {
            System.out.println("The phone length is less than required ಠ_ಠ");
        } else
            System.out.println("The phone length is more than required ಠ_ಠ");
    }

   /* public void setStdPhone (long phone){
        int length = String.valueOf(phone).length();   // checks the number of symbols in a var 'stdPhone'
        switch (length){
            case 12: {
                this.stdPhone = phone;
                System.out.println("Student phone is +"+ this.stdPhone); break;
            default:
                System.out.println("The phone length is incorrect ಠ_ಠ");
        }
    }*/

    public void getData (byte age, String name, long phone) {
        this.setStdAge(age);
        this.setStdName(name);
        this.setStdPhone(phone);
    }

    public void setScholarship (byte key){
        this.scholarship = 200*key;
        System.out.println("Student scholarship is +"+ this.scholarship + " uah");
    }
}
