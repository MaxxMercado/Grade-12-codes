import java.io.*;

public class RelationDisplay_Mercado{
    public static void main(String args []) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int n1, n2;

        System.out.println("Enter your your first number");
        n1 = Integer.parseInt(br.readLine());

        System.out.println("Enter your your second number");
        n2 = Integer.parseInt(br.readLine());

        if(n1 > n2){
            System.out.println(n1 + " is greater than " + n2);
        }
        else if (n1 < n2){
             System.out.println(n2 + " is greater than " + n1);
        }
        else {
            System.out.println(n1 + " is equal to " +  n2);
        }
 
    }
}