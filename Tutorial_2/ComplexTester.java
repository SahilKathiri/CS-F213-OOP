package Tutorial_2;
/*
 * Not finished yet.
 * Need some time to think what is wrong with this.
 */
public class ComplexTester {
    public static void main(String[] args) {
        Complex c1 = new Complex(1, 3); //1=>real, 3=>imag
        Complex c2 = new Complex("2 + 3i");
        Complex c3 = new Complex(c1);
        Complex c4 = new Complex();

        c1.add(c2);  // c1 = c1 + c2;
        c1.add(3, 6); // c1 = c1 + complex(3,6);
        c4 = c1.add(c3); //c4 = c1 + c3
        c1.display();
        c4.display();
    }
}

class Complex {
    double r,i;    //real, imaginary

    public Complex(double r, double i) {
        this.r = r;
        this.i = i;
    }

    public Complex(String exp) {
        /*
         * Only supports complex numbers in the form "a + bi"
         * Will not handle "a - bi". Yet.
         */
        String real = exp.substring(0, exp.indexOf("+")).trim();
        double r = Double.parseDouble(real);

        String imag = exp.substring(exp.indexOf("+") + 1, exp.length()).trim();
        imag = imag.substring(0, imag.indexOf("i"));
        double i = Double.parseDouble(imag);

        this.r = r;
        this.i = i;

    }

    public Complex(Complex z) {
        this.r = z.r;
        this.i = z.i;
    }

    public Complex() {}

    public Complex add(Complex z) {
        Complex x = new Complex(this);

        this.r += z.r;
        this.i += z.i;

        return z;
    }
    public  void add(double r, double i) {
        this.r += r;
        this.i += i;
    }

    public void sub(Complex z) {
        this.r -= z.r;
        this.i -= z.i;
    }
    public  void sub(double r, double i) {
        this.r -= r;
        this.i -= i;
    }

    public void mul(Complex z) {

    }

    public void display() {
        System.out.println(r + " + " + i + "i");
    }

}
