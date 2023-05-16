import java.io.*;

public class SumProductTenNumbers_Mercado{
    public static void main(String args []) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,sum,prod;
        
            System.out.println("Enter your number 1: ");
            n1 = Integer.parseInt(br.readLine());

            System.out.println("Enter your number 2: ");
            n2 = Integer.parseInt(br.readLine());

            System.out.println("Enter your number 3: ");
            n3 = Integer.parseInt(br.readLine());

            System.out.println("Enter your number 4: ");
            n4 = Integer.parseInt(br.readLine());

            System.out.println("Enter your number 5: ");
            n5 = Integer.parseInt(br.readLine());

            System.out.println("Enter your number 6: ");
            n6 = Integer.parseInt(br.readLine());

            System.out.println("Enter your number 7: ");
            n7 = Integer.parseInt(br.readLine());

            System.out.println("Enter your number 8: ");
            n8 = Integer.parseInt(br.readLine());

            System.out.println("Enter your number 9: ");
            n9 = Integer.parseInt(br.readLine());

            System.out.println("Enter your number 10: ");
            n10 = Integer.parseInt(br.readLine());

            sum = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
            prod = n1 * n2 * n3 * n4 * n5 * n6 * n7 * n8 * n9 * n10;

            System.out.println("Sum of all numbers : " + sum);
            System.out.println("Product of all numbers: " + prod);
    }
}