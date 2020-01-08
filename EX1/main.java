package EX1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double balance,rate;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balance");
        balance = sc.nextDouble();
        System.out.println("Enter anual rate:");
        rate = sc.nextDouble();
        Bank objBank = new Bank(balance,rate);
//        objBank.calculateInterest();
        System.out.println("Interes = : "+objBank.calculateInterest());
    }
}
