package com.lab2;
class audi{
    public void carName(){
        System.out.println("I am driving an audi car");
    }
    public void carSymbol(){
        System.out.println("Car symbol is three rings");
    }
}
class ferrari extends audi{
    @Override
    public void carName() {
        System.out.println("I am driving a ferrari car");
    }

    @Override
    public void carSymbol() {
        System.out.println("Car symbol is horse");
    }
}
public class cars{
    public static void main(String[] args) {
        audi audi1=new audi();
        ferrari ferrari1=new ferrari();
        audi1.carName();
        audi1.carSymbol();
        ferrari1.carName();
        ferrari1.carSymbol();
    }
}
