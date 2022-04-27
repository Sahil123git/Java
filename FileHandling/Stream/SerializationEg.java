import java.io.*;

class Student implements Serializable // marker interface , it does not have any method
{

    int rollno;
    String name;
    double cgpa;

    Student(int rollno, String name, double cgpa) {
        this.rollno = rollno;
        this.name = name;
        this.cgpa = cgpa;
    }

    public String toString() {
        return "This student has " + rollno + " " + name + " " + cgpa;

    }

}

/*
 * Note:
 * Only non-static data members are saved via Serialization process
 * Static data members and transient data members are not saved via
 * Serialization process
 */
class SerializationEg

{

    /*
     * throws IOException, FileNotFoundException,ClassNotFoundException can
     * use this also
     */
    public static void main(String arg[]) throws Exception {
        try {
            // Serialisation
            FileOutputStream fos = new FileOutputStream("Printer.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            Student s1 = new Student(101, "virat", 8.5);

            oos.writeObject(s1);

            oos.close();
            fos.close();
        } catch (FileNotFoundException f1) {
        } catch (IOException f2) {
        }

        // Deserialization
        FileInputStream fis = new FileInputStream("Printer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s2 = (Student) ois.readObject();
        System.out.println(s2);
        ois.close();
        fis.close();

    }
}