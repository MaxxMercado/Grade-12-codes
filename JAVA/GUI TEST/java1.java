import java.io.*;
import java.util.Random;

public class java1 {

    private static Object out;

    public static <S> void main (String args[])throws Exception{
    BufferedReader br =new BufferedReader(new InputStreamReader (System.in));
    int num1;

    Random r = new Random();
    int x = r.nextInt();

    System.out.println("Enter your number");
    num1 = Integer.parseInt(br.readLine());
    
    System.out.println("Your number is: " + num1 );
    
    }
}
