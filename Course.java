package  lesson9.Homework;

import java.util.Objects;

/**
 *
 * Класс описываеющий курс, только одно поле с именем, и сгенерированные
 * конструктор, геттер, equals, hashCode и toString
 *
 * equals и hashCode необходимы для операций фильтрации в стриме
 */
public class Course {
    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(name, course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
