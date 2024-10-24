class sample {
    public static void main (String args[]) {
try{
        int a=0,d;
        d=50/a;
        System.out.println("This will not be printed as arithmetic error occur");

    }
    catch (ArithmeticException e) {
        System.out.println("Division Error");


    }
    System.out.println("This is after catch statement");
}
}