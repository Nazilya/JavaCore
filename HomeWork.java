package lesson9.Homework;

import java.util.List;
import java.util.stream.Collectors;

public class HomeWork {

    /**
     *
     * Имеется следующая структура:
     *
     *      interface Student {
     *          String getName();
     *          List<Course> getAllCourses();
     *      }
     *
     *      interface Course {}
     *
     * Написать функцию, принимающую список Student и возвращающую список уникальных курсов,
     * на которые подписаны студенты.
     *
     * Написать функцию, принимающую на вход список Student и возвращающую
     * список из трех самых любознательных (любознательность определяется количеством курсов).
     *
     * Написать функцию, принимающую на вход список Student и экземпляр Course,
     * возвращающую список студентов, которые посещают этот курс.
     *
     */

    public static void main(String[] args) {

        /**
         *
         * Что бы не путаться в интерфейсах, решил сразу классы реализовать, в них думаю будет нагляднее.
         * Соответственно, класс Student и Course отвечают за описание соответсвующих сущностей, класс HomeWorkData
         * предоставляет данные для теста задания
         *
         */

        List<Student> students = HomeWorkData.getStudentsList(); // Получаем список студентов
        Course randomCourse = HomeWorkData.getRandomCourse(); // Получаем случайный курс
        System.out.println(getUnicsCourses(students)); // Первая функция
        System.out.println(getStudentsWithMoreCourses(students)); // Вторая функция
        System.out.println(getStudentsWithCourse(students, randomCourse)); // Третья функция
    }

    public static List<Course> getUnicsCourses(List<Student> students) {
        return students.stream() // Создаем стрим
                .flatMap(student -> student.getAllCourses().stream()) // Из списка студентов вытаскиеваем списки курсов в один список и дальше продолжаем стрим по ним
                .distinct() // Оставляем только уникальные курсы
                .collect(Collectors.toList()); // Собираем результат в список
    }

    public static List<Student> getStudentsWithMoreCourses(List<Student> students) {
        return students.stream() // Создаем стрим
                .sorted((s1, s2) -> (s2.getAllCourses().size()) - (s1.getAllCourses().size())) // Сортируем студентов по размерам списков их курсов
                .limit(3) // Ограничиваем результат в соответствии с заданием
                .collect(Collectors.toList()); // Собираем результат в список
    }

    public static List<Student> getStudentsWithCourse(List<Student> students, Course course) {
        System.out.println(course); // Печать рандомного курса в консоль, для проверки
        return students.stream() // Создаем стрим
                .filter(student -> student.getAllCourses().contains(course)) // Фильтруем стрим по принципу, что список курсов студента должен содержать переданный курс
                .collect(Collectors.toList()); // Собираем результат в список
    }
}
