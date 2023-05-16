import java.io.*;

public class Hello{
    public static void main(String args []) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name;
        int age;

        String month = "February";
        short day = 20; 
        int year = 2023; 
        double money = 999.999;

        //data type variables
        System.out.println("hello Maxx ");
        System.out.println("Date: "+ month + " " + day + " " + year);
        System.out.println("Money = " +money + "\n");
        
        //readline
        System.out.print("\tEnter your name: ");
        name = br.readLine();
        System.out.print("\tEnter your age: ");
        age = Integer.parseInt(br.readLine());

        Thread.sleep(1500);

        System.out.println("\n||------------------------------------||");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        //calculator 
        Thread.sleep(1500);
        System.out.println("\n||------------CALCULATOR-------------||\n");

        String num1, num2;
        int sum = 0;
    
        System.out.println("Addition Calculator");
        System.out.println("Enter 1st Integer ");
        num1 = br.readLine();
        System.out.println("Enter 2nd Integer \n");
        num2 = br.readLine();

        //string to integer 
        int _num1 = Integer.parseInt(num1);
        int _num2 = Integer.parseInt(num2);

        sum = _num1 + _num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);


    }
}