package lab3;

public class Bike implements vehicle{
    String name;
    int wheels=0;
    public Bike(String name,int wheel) {
        this.name = name;
        this.wheels=wheel;
    }
    public Bike(String name)
    {
        this.name=name;
        this.wheels=vehicle.wheels;
    }

    @Override
    public void print() {
        System.out.println("The name of vehicle is : "+this.name);
    }

    @Override
    public void printWheels() {
       if (this.wheels==0)
       {
           System.out.println("Number of wheels : "+vehicle.wheels);
       }
       else
       {
           System.out.println("Number of wheels : "+this.wheels);
       }
    }
}
