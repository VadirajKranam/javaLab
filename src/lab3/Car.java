package lab3;

public class Car implements vehicle{
    String name;
    int wheels;

    public Car(String name, int wheels) {
        this.name = name;
        this.wheels = wheels;
    }

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void printWheels() {
        System.out.println("The number of wheels : "+this.wheels);
    }

    @Override
    public void print() {
        System.out.println("The name of the car is : "+this.name);
    }

}
