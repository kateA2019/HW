import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ExceptionsDemo {
    //**1st example
    // Если оператор return содержится и в блоке catch и в finally, какой из них “главнее”?
    // Вернется из блока finally.
    public static String method() {
        try {
            return "someString";
        } catch (Exception ex) {
            return "Catch message";
        } finally {
            return "Finally message";
        }
    }
    //**2nd example
    // Какое из двух исключений “выпадет” из блока try-finally?
    // Что случится со вторым исключением? - исключение в finally «проглотит» исключение выше (если не было обработано)
    public static Exception twoExceptionsMethod () {
        try {
            return new IndexOutOfBoundsException();
        } finally {
            return new NullPointerException();
        }
    }
    public static String twoExceptionsMethod2 () {
        try {
            throw new NullPointerException();
        } catch (NullPointerException ex) {
            System.out.println (ex.getMessage() + " catchBlock");
        } finally {
            Exception ex2 = new Exception();
            return ex2.getMessage() + " finallyBlock";
        }
    }
    //**3rd example
    // последовательность обработки исключений - от «младшего» к старшему.
    // public class FileNotFoundException extends IOException
    public static void ioExcAndFileNotFoundEx() {
        try {
            String x = "abc1";
            if (x.equals("abc")) throw new IOException();
            else throw new FileNotFoundException();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //**4th example
    // unchecked exception (RunTime)
    public static int getAreaValue(int x, int y){
        if(x < 0 || y < 0) throw new IllegalArgumentException("value of 'x' or 'y' is negative: x="+x+", y="+y);
        return x*y;
    }
    //**5th example
    // finally priority
    static void procA() {
        try {
            System.out.println("inside procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("procA's finally");
        }
    }
    static void procB() {
        try {
            System.out.println("inside procB");
            return;
        } finally {
            System.out.println("procB's finally");
        }
    }
    //**6th example
    // several catch blocks

    // MAIN
    public static void main(String[] args) {
        //**1st example
        String what = method();
        System.out.println(what);
        //**2nd example
        Exception ex = twoExceptionsMethod();
        System.out.println(ex.getClass());
        String s = twoExceptionsMethod2();
        System.out.println(s);
        //**3rd example
        ioExcAndFileNotFoundEx();
        //**4th example
        // исключение починить нельзя, поэтому пробрасываем данное исключение дальше с помощью "throw e;"
        // т.е. в сигнатуре main д.б.: public static void main(String[] args) throws IllegalArgumentException
        /*int result = 0;
        try{
            result = getAreaValue(-1, 100);
        }catch(IllegalArgumentException e){
            throw e;
        }
        System.out.println("Result is : "+result);*/
        //**5th example
        try {
            procA();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        procB();

        // !! recursion example - infinite loop
        // System.out.println("1");
        // main(args);

        //**6th example - EX should be handled from SubClass to SuperClass, otherwise not compile
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Перехват исключений общего класса Exception.");
        } /*catch (ArithmeticException e) {
            //ОШИБКА: недостижимый код !
            System.out.println("Этoт код вообще недостижим.");
        }*/
        //**7th example - multi-catch block
        try {
            int a = args.length;
            int b = 42 / a;
            int[] c = new int[a];
            c[a] = 6;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка:" + e);
        }
    }
}
