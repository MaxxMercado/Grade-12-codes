import java.io.*;

public class Integertype_Mercado{
    public static void main(String args []) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1;

        System.out.println("Enter your your number");
        n1 = Integer.parseInt(br.readLine());

        if(n1 < 0){
            System.out.println("Your number " + n1 + " is Negative ");
        }
        else if(n1 == 0){
            System.out.println("Your number " + n1 + " is Zero");
        }
        else  {
            System.out.println("Your number " + n1 + " is Positive");
        }


    }
}