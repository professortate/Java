
import java.util.Scanner;
public class transaction {
   
   public static void main(String[] args) {
    Scanner myObj =new Scanner (System.in);
    System.out. println("Enter your Details: \n");
    System.out. println("\nEnter your Name: ");
    String accName =myObj.nextLine ();
    System.out. println("\nEnter your Account Number: ");
    int accNumber =myObj.nextInt ();
    System.out. println("\nEnter your Initial Account Balance: ");
    float accBalance =myObj.nextFloat ();
//Displaying Account Details before transaction
      System.out.println ("Accoount Details:");
      System.out.println ("Account Name:" +accName);
      System.out.println ("Account Number:" +accNumber);
      System.out.println ("Account Balance:" +accBalance);

      //Displaying after transaction
      System.out.println("Account Balance: = " + depositFunction(  accBalance));
      System.out.println ("Account Name:" +accName);
      System.out.println ("Account Number:" +accNumber);

    }

   /** returns the Account Balance  */
   public static float depositFunction(/*String accName, int accNumber,*/ float accBalance) {
    Scanner myobj =new Scanner (System.in);
    System.out. println("\nEnter your choice: 1 for deposit :2 for Withdraw: ");
    int choice =myobj.nextInt (); 
      if (choice ==1){
        System.out.println("Enter amount to deposit:");
        float amount =myobj.nextFloat ();
         accBalance += amount;}
      else{
        System.out.println("Enter amount to withdraw:");
        float amount =myobj.nextFloat ();
         accBalance -= amount;}

        return  accBalance;
   }
}
