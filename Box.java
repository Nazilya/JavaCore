package javaCore.urok3.Homework;

import java.util.ArrayList;
import java.util.Objects;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();
    public Box() {
    }
    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }
    public void addFruits(ArrayList<T> newFruits) {
        if (newFruits != null){
            fruits.addAll(newFruits);
        }
    }
    public Float getWeight() {
        float result = 0.0f;
        if (this.fruits.isEmpty()) {
            return result;
        }
        result = fruits.size() * fruits.get(0).weight;
        return result;
    }
    public boolean compare(Box<? extends Fruit> otherBox) {
        return otherBox.getWeight().equals(this.getWeight());
    }
    public void toAnotherBox(Box<T> box) {
        if (this.fruits != null) {
            box.addFruits(this.fruits);
            this.fruits.clear();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return Objects.equals(fruits, box.fruits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fruits);
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits +
                '}';
    }
}
