package oot.b6709624.week10.lab.lab1;
import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) {
        // 1: Array variable name must match usage 'persons[0]' below
        Person[] persons = new Person[3];

        // 2 & 3: Creating first Person with Phone data
        persons[0] = new Person("John Smith", new Phone("1234567890",
                "pass123"));

        persons[1] = new Person("Jane Doe", new Phone("0987654321",
                "secure456"));

        // 4 & 5: Creating third Person
        persons[2] = new Person("Alice Wonderland", new Phone("1122334455",
                "key789"));

        Scanner sc = new Scanner(System.in);

        // Iterate through the array
        for (Person p : persons) {
            // 6: Call the method defined in the previous step
            p.displayInfo(sc);
            System.out.println();
        }
        sc.close();
    }
}
