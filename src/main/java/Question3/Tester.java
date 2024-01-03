
package Question3;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        // Creating an array of Person objects
        Person[] people = {
            new Person("Zheng Wei"),
            new Person("Jian Ming"),
            new Person("Yee Fong"),
            new Person("Wei Jun"),
            new Person("Jing Ze"),
            new Person("Kwong Yang"),
        };
        
        // Displaying the unsorted array
        System.out.println("Unsorted Array:");
        for (Person person : people) {
            person.display();
        }
        
        // Sorting the array in ascending order
        Arrays.sort(people);

        // Displaying the sorted array
        System.out.println("\nSorted Array (Ascending Order):");
        for (Person person : people) {
            person.display();
        }
    }
}
