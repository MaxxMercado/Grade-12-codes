
/**
 * Write a description of class Carbluej here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Carbluej
{
    String brand;
    String model;
    String color;
    int year;
    public void broom(){
        System.out.println("Broom Broom");
    }
    
    //getter
    public void getcar(){
        
        System.out.println("Car Brand: " + this.brand);
        System.out.println("Car Model: " + this.model);
        System.out.println("Car Color: "+ this.color);
        System.out.println("Car Year: " + this.year);
    }
    
    
    public String getbrand(){
        return this.brand;
    }
    
    public String getmodel(){
        return this.model;
    }
    
    public String getcolor(){
        return this.color;
    }
    
    public int getyear(){
        return this.year;
    }
    
    
    //setter
    public void setbrand(String brand){
        this.brand = brand;
    }
    
    public void setmodel(String model){
        this.model = model;
    }
    
    public void setcolor(String color){
        this.color = color;
    }
    
    public void setyear(int year){
        this.year = year;
    }
    
    public void setcar(String brand, String model, String color, int year){
        this.brand = brand; 
        this.model = model;
        this.color = color;
        this.year = year;
    }
}
