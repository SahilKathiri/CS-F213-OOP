package Tutorial_3;

import java.util.ArrayList;
import java.util.Scanner;

class Term {
    private int value;
    private int power;

    public Term(int value, int power) {
        this.value = value;
        this.power = power;
    }

    public void differentiate() {
        value *= power;
        power--;
    }

    public double getValue() {
        return value;
    }

    public double getPower() {
        return power;
    }
}

class Function {
    Scanner inp = new Scanner(System.in);

    ArrayList<Term> fn = new ArrayList<>();

    public void populate() {
        String flag = "";
        int value, power;

        while (!flag.equalsIgnoreCase("end")) {
            Term temp;

            System.out.print("Value: ");
            value = inp.nextInt();
            System.out.print("Power: ");
            power = inp.nextInt();

            temp = new Term(value, power);
            fn.add(temp);

            System.out.print("Press (any char)+enter to continue, 'end' to finish input");
            flag = inp.next();
        }
    }

    public void differentiate() {
        for (int i = 0; i < fn.size(); i++) {
            Term temp = fn.get(i);
            temp.differentiate();
            fn.set(i, temp);
        }
    }

    public void display() {
        for (Term x: fn) {
            String sign = (x.getValue() > 0)? " + " : " - ";
            System.out.print(sign + Math.abs(x.getValue()) + " x^" + x.getPower());
        }
    }
}

public class DifferentiationTester {
    public static void main(String[] args) {
        System.out.println("Enter the value and power separately");
        Function fn = new Function();
        fn.populate();

        System.out.println("The given function is \n");
        fn.display();

        System.out.println("\n\nThe differentiated function is\n");
        fn.differentiate();
        fn.display();
    }
}
