import java.io.*;

class Employee implements Serializable // marker interface , it does not have any method
{

    int empID;
    String name;
    String dep;

    Employee(int empID, String name, String dep) {
        this.empID = empID;
        this.name = name;
        this.dep = dep;
    }

    public String toString() {
        return "This employee name is  " + name + " " + empID + " " + dep;

    }

}

public class EmpSerial {
    public static void main(String[] args) throws Exception {
        // Serialization
        FileOutputStream fos = new FileOutputStream("Emp.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Employee str = new Employee(1245, "Sahil", "Development");
        oos.writeObject(str);
        oos.close();
        fos.close();

        // Deserialization
        FileInputStream fis = new FileInputStream("Emp.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee s2 = (Employee) ois.readObject();
        // (Employee) this is used to typecaste
        System.out.println(s2);
        ois.close();
        fis.close();
    }
}
