import java.io.*;

public class Mercado_T1C1 {
    public static void main (String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String option, number1, number2;
        double result, num1, num2;
        int _option;

        do {
        
        System.out.println("[1] Odd or Even");
        System.out.println("[2] Decimal value of a fraction");
        System.out.println("[3] Money Denomination");
        System.out.println("[4] Lowest term of a fraction");
        System.out.println("[5] Exit");

        System.out.println("Choose an option: ");
        option = br.readLine();
         _option = Integer.parseInt(option);

   
        switch (option) {
            case "1":
                
                System.out.println("\nOdd or Even");
                System.out.println("Enter number");
                number1 = br.readLine();

                int num = Integer.parseInt(number1);
                
                result = num % 2;

                if (result == 0){
                    System.out.println("Number is Even\n ");
                }else if(result <= 0 ){
                    System.out.println("Cannot enter a negative number \n ");
                }else{
                    System.out.println("Number is odd \n");
                }
                break;
           
            case "2":
                System.out.println("\nDecimal value of fraction ");

                System.out.println("Enter Numerator");
                number1 = br.readLine();
                System.out.println("Enter Denominator");
                number2 = br.readLine();

                num1 = Double.parseDouble(number1);
                num2 = Double.parseDouble(number2);

                result = num1 / num2;

                System.out.println("\nNumerator " + num1);
                System.out.println("Numerator " + num2);
                System.out.println("Decimal Value: \n" + result);
                System.out.println(" ");
                break;

            case "3":
                System.out.println("\nMoney denomination ");

                System.out.println("Enter money ");
                number1 = br.readLine();
                int money = Integer.parseInt(number1);

                int thousand = money/1000;
                money = money % 1000;

                int fivehundred = money/500;
                money = money%500;

                int twohundred = money/200;
                money = money % 200;

                int onehundred = money/100;
                money = money % 100;

                int fifty = money/50;
                money = money % 50;

                int twenty = money/20;
                money = money % 20;

                int ten = money/10;
                money = money % 10;

                int five = money/5;
                money= money % 5;

                int one = money/1;
                money = money % 1;

                System.out.println(" ");
                System.out.println("1000: " + thousand);
                System.out.println("500: " + fivehundred);
                System.out.println("200: " + twohundred);
                System.out.println("100: " + onehundred);
                System.out.println("50: " + fifty);
                System.out.println("20: " + twenty);
                System.out.println("10: " + ten);
                System.out.println("5: " + five);
                System.out.println("1: " + one);
                System.out.println(" ");
                break;

            case "4":
                System.out.println("\nLowest term of a fraction ");


                System.out.println("Enter Numerator");
                number1 = br.readLine();
                System.out.println("Enter Denominator");
                number2 = br.readLine();

                num1 = Double.parseDouble(number1);
                num2 = Double.parseDouble(number2);

                double gcd = 1;

                for(int i = 1; i <= num1 && i <= num2; ++i) {
                    // Checks if i is factor of both integers
                    if(num1 % i == 0 && num2 % i == 0)
                      gcd = i;
                  }
              
                  double lcm = (num1 * num2) / gcd;

                  System.out.println("The Lowest common factor of " + num1 + " and "+ num2 + " is " + lcm );
                  System.out.println(" " );
              


                break;

            case "5":
                System.out.println("\nEXIT");
              
            default:
                break;

        }

        }while(_option < 5);

           
    

        

        
    }
   
}


