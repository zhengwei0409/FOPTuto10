
package Question3;


public class Person implements Comparable<Person> {

    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    // Accessor method for the name
    public String getName() {
        return name;
    }

    // Display method to show the name
    public void display() {
        System.out.println("Person: " + name);
    }

    /* 
        If the result is negative, the current object is considered "less than" the specified object.
        If the result is zero, the current object is considered "equal to" the specified object.
        If the result is positive, the current object is considered "greater than" the specified object.
    */
    
    @Override
    public int compareTo(Person o) {
        if(this.name.compareTo(o.getName()) == 0) {
            return 0;
        } else if(this.name.compareTo(o.getName()) > 0) {
            return 1;
        } else{
            return -1;
        }
    }
    
}
