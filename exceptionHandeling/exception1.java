import java.util.Scanner;
public class exception1 {
    public static void main (String args[]){
        Scanner scanner =new Scanner(System.in);
        try {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            int result =10/number;
            System.out.println("The result is:" +result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occured:cannot divide by zero");
        }
        catch (Exception e){
            System.out.println("An error occured.");
        }
        finally{
            scanner.close();
        }


    }
    
}
