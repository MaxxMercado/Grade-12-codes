import java.io.*;

public class PerfectSquare_Mercado{
    public static void main(String args []) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = 1;
        int psq;
         

        for (int i = n1; i <= 20; i++){
        psq = i * i;
        System.out.println("Perfect squares " + psq );
        }


    }
}    