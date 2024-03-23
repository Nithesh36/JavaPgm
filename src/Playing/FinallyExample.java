package Playing;

public class FinallyExample {
    public FinallyExample(int a) {
        this();//can call current class constructors
        this.m1();  int c=this.name;// can call methods ,variables
    }

    public FinallyExample() {

    }
    int name;
        public void m1(){

        }
    public static void main(String[] args) {
        System.out.println("Before method call");

        try {

//            methodWithFinally();
            int result = 10 / 0;
            System.out.println("helo afer exception");
        } catch (Exception e) {
            System.out.println("Exception caught");
            e.printStackTrace();
        }
        finally {
            System.out.println("im finally");
        }
        System.out.println("After method call");

    }

//    public static void methodWithFinally() {
//        try {
//            System.out.println("Inside try block");
//            // Simulating an exception
//            int result = 10 / 0;
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException caught");
//        } finally {
//            System.out.println("Inside finally block");
//        }
//    }
}
