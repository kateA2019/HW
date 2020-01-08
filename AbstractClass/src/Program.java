public class Program {
    public static void main(String[] args){
        Addition add = new Addition();
        int s = add.addTwoInt(3, 4);
        System.out.println("Sum of two integer values : "+ s);

        // Creating an instance of the class
        MethodTest test = new MethodTest();

        // Calling the m1() method by the object created in above step.
        int i = test.m1();
        System.out.println("Control returned after method m1 :" + i);

        // Call m2() method
        test.m2();
        int no_of_objects = MethodTest.get();
        System.out.print("No of instances created till now : ");
        System.out.println(no_of_objects);

    }
}
