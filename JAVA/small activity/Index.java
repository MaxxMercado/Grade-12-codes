import java.io.*;

public class Index{
    public static void main(String args []) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

        String number;
        int sum = 0;

        System.out.println("Please input a positive number");
        number = br.readLine();
        int _number = Integer.parseInt(number);


        
        do{
            sum += _number;
             System.out.println("Please input a positive number: ");
            number = br.readLine();
            _number = Integer.parseInt(number);
        }
        while(_number > 0);
                System.out.println("The some of all positive numbers: " + sum);
        

    
    } 
}

        