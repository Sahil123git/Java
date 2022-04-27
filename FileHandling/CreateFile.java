import java.io.*;
import java.util.*;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File f1 = new File("project1");
        System.out.println("is a file " + f1.isFile());
        System.out.println("is a Directory " + f1.isDirectory());
        System.out.println("exists " + f1.exists());
        System.out.println("Hidden ?" + f1.isHidden());
        System.out.println("canRead ?" + f1.canRead());
        System.out.println("canWrite ?" + f1.canWrite());
        System.out.println("getPath ?" + f1.getPath());
        System.out.println("getAbsolutePath?" + f1.getAbsolutePath());
        System.out.println("getName" + f1.getName());

        File f2 = new File("Jv.java");
        if (!f2.exists()) {
            f2.createNewFile();
        }
        System.out.println("length is " + f2.length());
        System.out.println("Last modified on " + new Date(f2.lastModified()));
        f2.renameTo(new File("doc.java"));

        File f3 = new File("doc.java");
        f3.delete();// will permanently delete file or folder
        
        // --------------------------------------------------
        File f4 = new File("Project1");
        File files[] = f4.listFiles();
        for (File f : files) {
            System.out.println("getName " + f.getName() + " last modified " + new Date(f.lastModified()));
        }
    }
}
// new Date gives long value which menas num of millisec elapsed till Jan 1970
