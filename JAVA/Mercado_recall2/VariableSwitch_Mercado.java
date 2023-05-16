import java.io.*;

public class VariableSwitch_Mercado{
    public static void main(String args []) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1,n2,n3;

        System.out.println("Enter your varA: ");
        n1 = Integer.parseInt(br.readLine());

        System.out.println("Enter your varB: ");
        n2 = Integer.parseInt(br.readLine());

        n3 = n1;
        n1 = n2;
        n2 = n3;

        System.out.println("\nOUTPUT: " );
        System.out.println("VarA = " + n1 );
        System.out.println("VarB = " +n2 );
    }
}