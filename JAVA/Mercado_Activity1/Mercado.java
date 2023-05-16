import java.io.*;

public class Mercado{
    public static void main(String args []) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       String name, num1, num2;
        int sum, diff, prod, quo, rem;

        System.out.println("ALL-IN-ONE Calculator");

        System.out.println("Enter Name: ");
        name = br.readLine();

        System.out.println("Loading Please Wait...");
        Thread.sleep(1500);

        System.out.println("Welcome " + name);
        Thread.sleep(750);

        System.out.println("Enter 1st Integer ");
        num1 = br.readLine();
        Thread.sleep(750);

        System.out.println("Enter 2nd Integer ");
        num2 = br.readLine();
        Thread.sleep(750);

        int _num1 = Integer.parseInt(num1);
        int _num2 = Integer.parseInt(num2);

         sum = _num1 + _num2;
         diff = _num1 - _num2;
         prod = _num1 * _num2;
         quo = _num1 / _num2;
         rem =  _num1 % _num2;

        System.out.println("Addition: " + num1 + " + " + num2 + " = " + sum);
        Thread.sleep(750);

        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + diff);
        Thread.sleep(750);

        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + prod);
        Thread.sleep(750);

        System.out.println("Division: " + num1 + " / " + num2 + " = " + quo);
        Thread.sleep(750);

        System.out.println("Remainder " + rem);
        Thread.sleep(750);
    }
}
