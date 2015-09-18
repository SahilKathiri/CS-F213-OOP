package Tutorial_2;

import java.util.Scanner;

public class CreditCard {
    private String name;
    private String cardNo;
    private boolean enabled;
    private int pin;
    private String expiryMonth;
    private byte cardType;        // 3-Platinum, 2-Gold, 1-Silver
    private int currentCredit;
    private int creditLimit;

    static Scanner inp = new Scanner(System.in);

    // Constructors

    public CreditCard() {}

    public CreditCard(String name, String cardNo,
                      boolean enabled, String expiryMonth,
                      byte cardType, int currentCredit,
                      int creditLimit) {
        this.name = name;
        this.cardNo = cardNo;
        this.enabled = enabled;
        this.expiryMonth = expiryMonth;
        this.cardType = cardType;
        this.currentCredit = currentCredit;
        this.creditLimit = creditLimit;
    }

    // Setters
    public void setPin(int pin) {
        System.out.print("Enter your pin: ");
        this.pin = pin;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    // Methods
    public void transact(int amt) {
        if (enabled) {
            int pin = inp.nextInt();
            if (this.pin == pin && amt <= this.creditLimit)
                currentCredit -= (amt - amt*cardType/100);
            else if (this.pin != pin)
                System.out.println("The pin you entered is wrong");
            else if (amt >= this.creditLimit)
                System.out.println("The amount is greater than your Credit Limit");

        }
    }

    public void display() {
        String cardType = "";

        // To make the cardType more readable
        if (this.cardType == 3)
            cardType = "Platinum";
        else if (this.cardType == 2)
            cardType = "Gold";
        else if (this.cardType == 1)
            cardType = "Silver";

        System.out.println("Name: " + name +
                            "\nCard no: " + cardNo +
                            "\nExpiry Month: " + expiryMonth +
                            "\nCard Type: " + cardType +
                            "\nCurrent Credit: " + currentCredit +
                            "\nCredit Limit: " + creditLimit);
    }


    // Main
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
            String name = inp.nextLine();
            System.out.println();
        System.out.print("Enter your card number: ");
            String cardNo = inp.nextLine();
            System.out.println();
        System.out.print("Is your card activated and enabled? (y/n): ");
            boolean enabled = false;
            if (inp.next().equals("y"))
                enabled = true;
            System.out.println();
        System.out.print("Enter the card's expiration month: ");
            String expiryMonth = inp.next();
            System.out.println();
        System.out.print("Enter your cards type's discount (%): ");
            byte cardType = inp.nextByte();
            System.out.println();
        System.out.print("Enter your credit: ");
            int currentCredit = inp.nextInt();
            System.out.println();
        System.out.print("Enter your credit limit: ");
            int creditLimit = inp.nextInt();

        CreditCard customer = new CreditCard(name, cardNo,
                enabled, expiryMonth, cardType, currentCredit,
                creditLimit);

        customer.setPin(0);
        customer.setEnabled(true);
        customer.transact(100);
        customer.display();
    }

}
