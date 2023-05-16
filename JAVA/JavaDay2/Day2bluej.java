
/**
 * Write a description of class Day2part2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
public class Day2bluej
{
     public static void main(String args[])throws Exception{
          BufferedReader br =new BufferedReader(new InputStreamReader (System.in));
          
          System.out.println("Good Morning");
          
          //calling method and printing method with static
          number();

          System.out.println(number());
          
          //calling method without static 
          Day2bluej hello = new Day2bluej();
          hello.hello();
          
          //calling car broom from car 
          Carbluej newcar = new Carbluej();
          newcar.broom();
          
          //calling variables from car
          Carbluej mycar = new Carbluej();
          mycar.brand = "Ferrari";
          mycar.model = "f40";
          mycar.color = "Red";
          mycar.year = 2003;
        
          System.out.println(mycar.brand + " " + mycar.model + " " + mycar.color +" "+ mycar.year);
          
          System.out.println("----------------------------------------------");
          System.out.println("Enter your car Brand");
          String brand = br.readLine();
          
          System.out.println("Enter your car Model");
          String model = br.readLine();
          
          System.out.println("Enter your car Color");
          String color = br.readLine();
          
          System.out.println("Enter your car Year");
          int _year = Integer.parseInt(br.readLine());
          
          System.out.print("\n");
          
          Carbluej yourcar = new Carbluej();
          yourcar.setcar(brand, model, color, _year );
          yourcar.getcar();
          //this is for set car and get car
          
          System.out.print("\n");
          
          Carbluej yournewcar = new Carbluej();
          yournewcar.setbrand(brand);
          yournewcar.setmodel(model);
          yournewcar.setcolor(color);
          yournewcar.setyear(_year);
          
          //convert yournewcar into string for faster use
          String _brand = yournewcar.getbrand();
          String _model = yournewcar.getmodel();
          String _color = yournewcar.getcolor();
          int _years = yournewcar.getyear();
          System.out.println("This is your new car " + yournewcar.getbrand());
    }
        
    public static int number(){
          return 5;
      }
      
    public void hello (){
        System.out.println("hello ");
    }
        
}

