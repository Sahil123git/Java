import java.util.*;

// import javax.swing.text.html.StyleSheet.ListPainter;

class CollectionEg {

    public static void main(String args[]) {

        List al = new ArrayList();
        al.add("Hello");
        al.add(200);
        al.add(new Integer(25));
        al.add(1, "java");
        System.out.println(al);

        ArrayList al2 = new ArrayList(al);
        al2.add(2, "programming");
        al2.remove(1);// deleting using index
        System.out.println(al2.indexOf("Hello"));
        System.out.println(al2.indexOf(1));
        al2.remove("Hello");// deleting using obj
        System.out.println(al.size());
        System.out.println(al2);

        Iterator it = al2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        ListIterator ltr = al2.listIterator();
        while (ltr.hasNext()) {
            System.out.print(ltr.nextIndex() + " ");
            System.out.print(ltr.previousIndex() + " ");
            System.out.println(ltr.next() + " ");
        }
        System.out.println("In Reverse order");
        ListIterator ltr3 = al2.listIterator(al2.size());
        while (ltr3.hasPrevious()) {
            System.out.println(ltr3.previous());
        }
    }

}