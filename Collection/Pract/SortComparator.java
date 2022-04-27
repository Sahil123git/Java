
// Java Program to show how to override the compareTo()
// method of comparable interface
import java.util.*;

// implementing Comparable interface
public class SortComparator implements Comparable<SortComparator> {

    String name;
    int age;

    // Class constructor
    SortComparator(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getage() {
        return age;
    }

    public String getname() {
        return name;
    }

    public static void main(String[] args) {
        // Creating SortComparator class object
        SortComparator ob[] = new SortComparator[4];

        // Inserting elements in the objects
        ob[0] = new SortComparator("Aayush", 14);
        ob[1] = new SortComparator("Ravi", 12);
        ob[2] = new SortComparator("Sachin", 19);
        ob[3] = new SortComparator("Mohit", 20);

        // sort the array,using overriden method
        Arrays.sort(ob);

        for (SortComparator o : ob) {

            // printing the sorted array objects name and
            // age
            System.out.println(o.name + " " + o.age);
        }

        // if you want to create a dynamic array ,then you
        // can create an arraylist
        ArrayList<SortComparator> objects = new ArrayList<>();

        // creating a new SortComparator object
        SortComparator newObject1 = new SortComparator("Rohan Devaki", 20);

        // inserting the new object into the arraylist
        objects.add(newObject1);

        // creating a new SortComparator object
        SortComparator newObject2 = new SortComparator("Algorithammer", 22);

        // inserting the new object into the arraylist
        objects.add(newObject2);

        // using Collections to sort the arraylist
        Collections.sort(objects);

        for (SortComparator o : objects) {
            // printing the sorted objects in arraylist by
            // name and age
            System.out.format("%s %d\n", o.name, o.age);
        }
    }

    // Overriding compareTo() method
    @Override
    public int compareTo(SortComparator o) {
        if (this.age > o.age) {

            // if current object is greater,then return 1
            return 1;
        } else if (this.age < o.age) {

            // if current object is greater,then return -1
            return -1;
        } else {

            // if current object is equal to o,then return 0
            return 0;
        }
    }
}
