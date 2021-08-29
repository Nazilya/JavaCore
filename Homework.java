package urok4.Homework;

import java.util.*;

public class Homework {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList(
                "One", "Two", "Three", "One", "Four", "Five", "Two", "One", "Six", "Six",
                "Seven", "Three", "One", "Eight", "Nine", "Three", "Two", "One", "Five", "Ten"
        ));
        printWithoutDuplicates(stringList);
        countDuplicates(stringList);
        testPhoneBook();
    }
    public static void printWithoutDuplicates(List<String> input) {
        Set<String> inputSet = new HashSet<>(input);
        System.out.println(inputSet);

    }
    public static void countDuplicates(List<String> input) {
        Set<String> inputSet = new HashSet<>(input);
        for (String word: inputSet) {
            int count = 0;
            for (String inner : input) {
                if (word.equals(inner)) {
                    count++;
                }
            }
            System.out.printf("%s: %d\n", word, count);
        }
    }
    public static void testPhoneBook() {
        PhoneBook.add("Chilvers", "+1 951 707 895");
        PhoneBook.add("Hodgon", "+2 951 522 895");
        PhoneBook.add("Ewence", "+3 951 354 893");
        PhoneBook.add("Frampton", "+4 951 301 894");
        PhoneBook.add("Roose", "+5 951 707 895");
        PhoneBook.add("Goode", "+6 951 522 896");
        PhoneBook.add("Lowseley", "+7 951 707 111");
        PhoneBook.add("Bere", "+8 951 301 222");
        PhoneBook.add("Avramovsky", "+9 951 958 753");
        PhoneBook.add("Roose", "+1 951 894 456");
        PhoneBook.add("Hodgon", "+2 951 896 854");
        PhoneBook.add("Chilvers", "+3 951 958 354");
        PhoneBook.add("Cheng", "+4 951 354 965");
        PhoneBook.add("Roose", "+5 951 522 452");
        PhoneBook.add("Hunstone", "+6 951 958 786");
        PhoneBook.add("Arthur", "+1 951 301 522");
        PhoneBook.add("Yurin", "+1 951 896 301");
        PhoneBook.add("Wernher", "+7 951 897 314");

        PhoneBook.get("Chilvers");
        PhoneBook.get("Hodgon");
        PhoneBook.get("Ewence");
        PhoneBook.get("Frampton");
        PhoneBook.get("Roose");
        PhoneBook.get("Goode");
        PhoneBook.get("Lowseley");
        PhoneBook.get("Bere");
        PhoneBook.get("Avramovsky");
        PhoneBook.get("Cheng");
        PhoneBook.get("Hunstone");
        PhoneBook.get("Arthur");
        PhoneBook.get("Yurin");
        PhoneBook.get("Wernher");
    }
}