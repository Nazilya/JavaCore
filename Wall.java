package lesson1;

public class Wall implements Obstacle{
    public final int height;
    public Wall(int height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return String.format("wall with height: %d", height);
    }
}

//Препяятствие Стена. Есть высота; Есть конструктор; Метод toString
