import java.io.*;

public class Switch{
    public static void main(String args []) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num1,num2,option,title;
        double result = 0;

        System.out.println("----------Calculator----------");
        System.out.println("[1] Addition");
        System.out.println("[2] Subtraction");
        System.out.println("[3] Multiplication");
        System.out.println("[4] Division");
        System.out.println("[5] Remainder");
        System.out.println("[6] Exit");
        System.out.println("Choose an option");
        option = br.readLine();
    
        switch(option){
            case "1":
                    title = "addition";
                    System.out.println("Enter 1st Integer ");
                    num1 = br.readLine();

                    System.out.println("Enter 2nd Integer ");
                    num2 = br.readLine();

                    double _num1 = Double.parseDouble(num1);
                    double _num2 = Double.parseDouble(num2);

                    result = _num1 + _num2;
                    break;
            case "2":
                    title = "Subtraction";
                    System.out.println("Enter 1st Integer ");
                    num1 = br.readLine();

                    System.out.println("Enter 2nd Integer ");
                    num2 = br.readLine();

                    _num1 = Double.parseDouble(num1);
                    _num2 = Double.parseDouble(num2);

                    result = _num1 - _num2;
                    break;
            case "3":
                    title = "Multiplication";
                    System.out.println("Enter 1st Integer ");
                    num1 = br.readLine();

                    System.out.println("Enter 2nd Integer ");
                    num2 = br.readLine();

                    _num1 = Double.parseDouble(num1);
                    _num2 = Double.parseDouble(num2);

                    result = _num1 * _num2;
                    break;
            case "4":
                    title = "Division";
                    System.out.println("Enter 1st Integer ");
                    num1 = br.readLine();

                    System.out.println("Enter 2nd Integer ");
                    num2 = br.readLine();

                   _num1 = Double.parseDouble(num1);
                   _num2 = Double.parseDouble(num2);

                    result = _num1 / _num2;
                    break;
           case "5":
                    title = "Remainder";
                    System.out.println("Enter 1st Integer ");
                    num1 = br.readLine();

                    System.out.println("Enter 2nd Integer ");
                    num2 = br.readLine();

                    _num1 = Double.parseDouble(num1);
                    _num2 = Double.parseDouble(num2);

                    result = _num1 % _num2;
                    break;
            case "6":
                  title = "exit";
                    System.out.println("Goodbye");

                    break; 
                default:
                title = "Invalid option";
        }

        System.out.println("Result: " + title + " " + result);

    } 
}

//num1 name of double 
//num1 = Double.parseDouble(br.readLine());
//age = Integer.parseInt(br.readLine());