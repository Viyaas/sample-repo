import java.util.Scanner;


public class BasicCalculator {


    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);

        System.out.println("Simple Calculator");

        System.out.println("\n Here are your options:");
        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");

        System.out.println("\n What would you like to do?: ");
        int choice = value.nextInt();
        System.out.println();


        if (choice == 1){
            addition();  // functions
        }
        else if (choice == 2){
            subtraction();
        }
        else if (choice == 3){
            division();
        }
        else if (choice == 4){
            multiplication();
        }

        System.out.println();
        value.close();
    }

    public static void addition(){

        int nOne, nTwo;
        Scanner value = new Scanner(System.in);

        System.out.println("Addition");

        System.out.print("\nFirst Number: ");
        nOne = value.nextInt();

        System.out.print("\nSecond Number: ");
        nTwo = value.nextInt();

        value.close();
        System.out.println("\nSum: " + nOne + " + " + nTwo + " = " + (nOne + nTwo));
    }

    public static void subtraction(){
        int nOne, nTwo;
        Scanner value = new Scanner(System.in);

        System.out.println("Subtraction");

        System.out.print("\nFirst Number: ");
        nOne = value.nextInt();

        System.out.print("\nSecond Number: ");
        nTwo = value.nextInt();

        value.close();
        System.out.println("\nSum: " + nOne + " - " + nTwo + " = " + (nOne - nTwo));
    }

    public static void division(){
        int nOne, nTwo;
        Scanner value = new Scanner(System.in);

        System.out.println("Division");

        System.out.print("\nFirst Number: ");
        nOne = value.nextInt();

        System.out.print("\nSecond Number: ");
        nTwo = value.nextInt();

        value.close();
        System.out.println("\nSum: " + nOne + " / " + nTwo + " = " + (nOne / nTwo));
    }

    public static void multiplication(){
        int nOne, nTwo;
        Scanner value = new Scanner(System.in);

        System.out.println("Multiplication");

        System.out.print("\nFirst Number: ");
        nOne = value.nextInt();

        System.out.print("\nSecond Number: ");
        nTwo = value.nextInt();

        value.close();
        System.out.println("\nSum: " + nOne + " x " + nTwo + " = " + (nOne * nTwo));
    }
}