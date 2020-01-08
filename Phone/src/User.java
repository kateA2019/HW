public class User {
    private String name;

    public User (String name) {
        this.name = name;
    }

    public void callAnotherUser (long number, AbstractPhone testObject){
    //Polymorphism - использование в коде абстактного типа AbstractPhone testObject
        testObject.call(number);
        testObject.ring(number);
    }
}
