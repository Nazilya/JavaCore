package javaCore.urok3.Homework;

public class Apple extends Fruit{
    public Apple() {
        super(1.0f);
    }
    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                '}';
    }
}