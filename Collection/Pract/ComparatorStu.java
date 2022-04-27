public class ComparatorStu {
    public static void main(String args[]) {
        ArrayList<Student> l = new ArrayList<Student>();
        l.add(new Student("Ritesh", 12012297, 9.67));
        l.add(new Student("Rahul", 12012298, 9.57));
        l.add(new Student("Abhimanyu", 12012299, 9.47));

        Collections.sort(l, new CgpaSort());

        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        Collections.sort(l, new RollSort());

        itr = l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
