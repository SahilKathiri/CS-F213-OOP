package Tutorial_2;

public class ComplexTester {
    public static void main(String[] args) {
        Complex c1 = new Complex(1, 3); //1=>real, 3=>imag
        Complex c2 = new Complex("2 + 3i");
        Complex c3 = new Complex(c1);
        Complex c4 = new Complex();

        c1.add(c2);  // c1 = c1 + c2;
        c1.add(3, 6); // c1 = c1 + complex(3,6);
        c4 = c1.add1(c3); //c4 = c1 + c3
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

    public void add(Complex z) {
        this.r += z.r;
        this.i += z.i;
    }
    public  void add(double r, double i) {
        this.r += r;
        this.i += i;
    }
    public Complex add1(Complex z) {
        Complex result = new Complex();

        result.r = this.r + z.r;
        result.i = this.i + z.i;

        return result;
    }

    public void sub(Complex z) {
        this.r -= z.r;
        this.i -= z.i;
    }
    public  void sub(double r, double i) {
        this.r -= r;
        this.i -= i;
    }

    public Complex mul(double r, double i) {
        Complex z = new Complex();
        z.r = this.r * r - this.i * i;
        z.i = this.r * i + this.i * r;
        return z;
    }
    public Complex mul(Complex z) {
        Complex result = new Complex();
        result.r = this.r * z.r - this.i * z.i;
        result.i = this.r * z.i + this.i * z.r;
        return result;
    }

    public Complex div(double r, double i) {
        Complex result = new Complex();
        result.r = (this.r*r + this.i*i)/(r*r + i*i);
        result.i = (this.i*r - this.r*i)/(r*r + i*i);
        return result;
    }
    public Complex div(Complex z) {
        Complex result = new Complex();
        result.r = (this.r*z.r + this.i*z.i)/(z.r*z.r + z.i*z.i);
        result.i = (this.i*z.r - this.r*z.i)/(z.r*z.r + z.i*z.i);
        return result;
    }



    public void display() {
        System.out.println(r + " + " + i + "i");
    }


}
