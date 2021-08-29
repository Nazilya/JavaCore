package javaCore.urok3.Homework;

public class Orange extends Fruit{
    public Orange(){
        super(1.5f);
    }
    @Override
    public String toString() {
        return "Orange{" +
                "weight=" + weight +
                '}';
    }
}
