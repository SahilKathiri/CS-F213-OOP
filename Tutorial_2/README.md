Tutorial held on 17<sup>th</sup> Sep 2015, Thursday.

* Define a <code>class CreditCard  which has String name, String cardNo, boolean enabled, int pin, String expiryMonth, int cardType, (Platinum, Gold, Silver), int currentCredit, int creditLimit</code>. 
Provide the following methods. 
    1. appropriate constructor, 
    2. changePin(int newPin), 
    3 transact(int amt), 
    4. changeCardStatus(boolean status) 
    5. display()   
    Note: transact() should check if the card is enabled + pin + credit limit. Further based on the card type an discount is offered. 3% for platinum, 2% for Gold and 1% for Silver.

* Write a complete Java program to simulate dice game. 
The program asks the user to guess a no in the range 1-6. 
Then it generates a random no (1..6) compares with that guessed by user and displays appropriate messages.

* Define a class Complex containing the real and imaginary parts of the complex no, and member functions add(), sub(), mul(), div(), which work in the normal human semantics. The class Complex is to be invoked from the ComplexNoTester as follows 
    ```java
    public class ComplexNoTester {
     public static void main(String[] args) {
      Complex c1 = new Complex(1, 3); //1=>real, 3=>imag
      Complex c2 = new Complex(“2 + 3i”);
      Complex c3 = new Complex(c1);
      c1.add(c2);  // c1 = c1 + c2;
      c1.add(3, 6); // c1 = c1 + complex(3,6);
      c4 = c1.add(c3); //c4 = c1 + c3
      c1.display();
     }
    }
    ```

* Define a class Reverser, which has the following  methods
    ```java
    void reverse1(int[] inpArr, int[] outArr);  //outArr is the reversed inpArr
    void reverse2(int[] arr); // arr in reversed in place
    int[] reverse3(int[] arr) ; //reverse3 returns the reversed array 
       ```
    It is intended that the class Reverser is used as follows in the main program
    ```java
    public class ReverseTester {
      int[]  a = {1, 2, 3, 4, 5 };
      int[] b = new int[10];
      Reverser.reverse1(a, b);  
      Reverser.reverse2(b);
      int[] c = reverse3((b);
    }
    ```
    Note that no object of class Reverser is intended to be created, (and hence the array to be 
    reversed in not required to be stored in the class).
    
* Define a class Matrix to contain an n (rows) by m (columns) double dimensional array, single 
dimensional arrays to hold sum of rows, sum of columns and a single variable to hold sum of 
all elements of the double dimensional array.
    ```java
    class Matrix {
      int[][] m;
      int[] sumOfRows, sumOfColumns;
      int  allSum;
      public Matrix(int n, int m) {/* write the necessary initialization code*/}
      public void sum() { 
        /*write the necessary code for computing sumOfRows, sumOfColumns, allSum */
      }
    }
    ```
    
    Note: main method, method to read the matrix elements etc are not necessary.
    
* ISBN (International Standard Book Number) consists of 10 digits (d<sub>1</sub>d<sub>2</sub>d<sub>3</sub>d<sub>4</sub>d<sub>5</sub>d<sub>6</sub>d<sub>7</sub>d<sub>8</sub>d<sub>9</sub>d<sub>10</sub>). The 
last digit d10 is a checksum, computed from the digits d1..d9 as given below
If d10 is 10, then its treated as ‘X’. Write a complete Java program that reads the first  9 digit 
ISBN no as a string  and generates and displays a new string containing all the 10 digits of the 
ISBN no. 

   > *d<sub>10</sub> = 11 - [(10 * d<sub>1</sub> + 9 * d<sub>2</sub> + 8 * d<sub>3</sub> + ... + 2 * d<sub>9</sub>) % 11]*
    
    Eg input : 013601267, output = 0136012671
