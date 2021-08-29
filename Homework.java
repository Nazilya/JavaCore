package javaCore.urok3.Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(new ArrayList<>(Arrays.asList(new Apple(), new Apple(), new Apple(), new Apple(), new Apple())));
        Box<Apple> newAppleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>(new ArrayList<>(Arrays.asList(new Orange(), new Orange(), new Orange(), new Orange())));
        Box<Orange> newOrangeBox = new Box<>(new ArrayList<>(Arrays.asList(new Orange(), new Orange())));

        System.out.println("Apple box: " + appleBox);
        System.out.println("New Apple box: " + newAppleBox);
        System.out.println("Orange box: " + orangeBox);
        System.out.println("New Orange box: " + newOrangeBox);
        appleBox.addFruits(new ArrayList<>(Arrays.asList(new Apple(), new Apple())));
        appleBox.toAnotherBox(newAppleBox);
        System.out.println("New Apple box weight: " + newAppleBox.getWeight());
        System.out.println("Orange box weight: " + orangeBox.getWeight());
        System.out.println(newAppleBox.compare(orangeBox));
        newAppleBox.addFruits(new ArrayList<>(Arrays.asList(new Apple(), new Apple())));
        orangeBox.addFruits(new ArrayList<>(Arrays.asList(new Orange(), new Orange())));
        System.out.println("New Apple box weight: " + newAppleBox.getWeight());
        System.out.println("Orange box weight: " + orangeBox.getWeight());
        System.out.println(newAppleBox.compare(orangeBox));
        newOrangeBox.toAnotherBox(orangeBox);
        System.out.println("Orange box weight: " + orangeBox.getWeight());
        System.out.println("Apple box: " + appleBox);
        System.out.println("New Apple box: " + newAppleBox);
        System.out.println("Orange box: " + orangeBox);
        System.out.println("New Orange box: " + newOrangeBox);

//
//
//        Integer[] ints = {1, 2, 3, 4, 5};
//        Swapper<Integer> integerSwapper = new Swapper<>();
//        integerSwapper.swap(ints, 2, 4);
//
//        for (Integer i : ints) {
//            System.out.printf(i + " ");
//        }
//        System.out.println();
//
//        Float[] floats = {1.6f, 2.4f, 3.6f, 4.2f, 5.1f};
//        Swapper<Float> floatSwapper = new Swapper<>();
//        floatSwapper.swap(floats, 0, 2);
//
//        for (Float i : floats){
//            System.out.printf(i + " ");
//        }
//        System.out.println();

    }
}
