import java.util.Scanner;

public class multiAccounts {
    public static void main(String[] args) {
        new Major().start();
        new Nominal().start();
    }
}

class Major extends Thread {
    public void run() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your Major Name:");
        String accName = myObj.nextLine();
        System.out.println("Enter your Major Account Number:");
        int accNum = myObj.nextInt();
        System.out.println("Enter your Major Phone Number:");
        String phoneNum = myObj.nextLine();
      

        // Consume the newline character
        myObj.nextLine();
    }
}

class Nominal extends Thread {
    public void run() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your Nominal Name:");
        String accName2 = myObj.nextLine();
        System.out.println("Enter Nominal Account Number:");
        int accNum2 = myObj.nextInt();
        System.out.println("Enter your Nominal Phone Number:");
        String phoneNum2 = myObj.nextLine();


        // Consume the newline character
        myObj.nextLine();
    }
}
