 
import java.io.*;

public class DemoJavaDay2{
    public static void main(String args[]){

        System.out.println("Good Morning ");

        //calling method
        System.out.println(number());

        //with static 
        number();
        

        //without static
        DemoJavaDay2 hello = new DemoJavaDay2();
        hello.hello();

        //Car.broom();
        Car newCar = new Car();
        newCar.broom();

    }

    public static int number(){
        return 2;
    }

    public void hello(){
        System.out.println("Hello ");
    }
  


}