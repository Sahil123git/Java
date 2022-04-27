import java.io.*;
import java.nio.file.*;

public class PathDemo {
    public static void main(String[] args) {
        Path currentWorkingDirPath = Paths.get("");// to get cur dir path
        System.out.println("currentWorkingDirPath.toAbsolutePath() : " + currentWorkingDirPath.toAbsolutePath());
        // toAbsolute will return absolute path
        Path path1 = Paths.get("project1");
        System.out.println("path1.toAbsolutePath() : " + path1.toAbsolutePath());
        System.out.println("Does path1 exists? : " + Files.exists(path1));
        try {
            if (Files.exists(path1)) {
                Files.delete(path1);
            }
            Files.createDirectory(path1);// to create directory
            // Directory means Folder
        } catch (FileAlreadyExistsException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Does path1 exists? after createDirectory call : " + Files.exists(path1));
        // after creting now dir will exists
        System.out.println("Files.isRegularFile(path1) : " + Files.isRegularFile(path1));
        // isRegular means tht this is a file
        System.out.println("Files.isDirectory(path1) : " + Files.isDirectory(path1));
        // isDirectory means if this is Directory
    }
}

// int*arr=new int[10];