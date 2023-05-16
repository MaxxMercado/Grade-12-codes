import java.io.*;

public class Ifelse{
    public static void main(String args []) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name, age;
        String message = "";

        System.out.println("Enter Your Name: ");
        name = br.readLine();

        System.out.println("Enter Your age: ");
        age = br.readLine();

        int _age= Integer.parseInt(age);

        if(_age < 0){
            message = "Invalid Age cannot be negative";

        }else if(_age < 18){
            message = "Invalid Age! 18 below not prohibited";

        }else {
            message = "Proceed";
        }
      
       System.out.println(message);

       
    
    }
}
