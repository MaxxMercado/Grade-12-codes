import java.io.*;

public class Forloop{
    public static void main(String args []) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String number;

        System.out.println("Enter a number ");
        number = br.readLine();
        int _number = Integer.parseInt(number);

        for(int count = 5; count >= _number; count-- ){
            System.out.println("["+ count + "] Hello World");
            Thread.sleep(1000);
        }

            System.out.println("thank you bye");



    }
}