public class exceptionHandeling1 { 
    public static void main(String[] args) {
        try {
            int myInt = Integer.parseInt("oants");

        } catch (NumberFormatException nfe) { 
            System.out.println("Hey dude, You can't make an int out of a string");

        } finally {
            System.out.println("In the finally block");
        }
    }
}
