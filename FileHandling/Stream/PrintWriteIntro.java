import java.io.*;
import java.util.*;

public class PrintWriteIntro {
    public static void main(String[] args) throws Exception {
        try {
            PrintWriter pw = new PrintWriter("Printer.txt");

            pw.println("Welcome to this world");
            pw.println("12 fgdd");
            pw.println(55);
            // pw.flush();
            pw.close();

        } catch (FileNotFoundException e) {
        }

        // Use of Scanner in File Handling
        String s = "welcome to java";
        Scanner st = new Scanner(s);
        // st.useDelimiter("a");// thiis will be used as delimiter
        while (st.hasNext()) {
            System.out.println(st.nextLine());
        }

        System.out.println("Nxt method");
        Scanner st1 = new Scanner(new File("Printer.txt"));
        while (st1.hasNext()) {
            System.out.println(st1.nextLine());
        }
    }
}
/*
 * Next() and NextLine() difference
 * Next() read input from the input device till the space character.
 * NextLine() read input from the input device till the line change.
 * 
 * Next() cannot read those words having space in it.
 * NextLine() can read those words having space in it.
 */
