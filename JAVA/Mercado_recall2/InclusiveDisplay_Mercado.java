import java.io.*;

public class InclusiveDisplay_Mercado{
    public static void main(String args []) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1,n2;

        System.out.println("Enter smallest number" );
        n1 = Integer.parseInt(br.readLine());

        System.out.println("Enter biggest number" );
        n2 = Integer.parseInt(br.readLine());

        for(int i = n1 + 1; i < n2; i++){
            System.out.println("Numbers between " + i );
        }
    } 
}