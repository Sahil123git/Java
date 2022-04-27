import java.io.*;

public class inputStream {
    public static void main(String[] args) throws Exception {
        FileInputStream fi = new FileInputStream("JavaFile.txt");
        // if there is no file with this name then there will be error
        System.out.println(fi.available());// how many character are not read
        int c = fi.read();// return integer value
        System.out.println((char) c + " F ");// typecasting the integer value

        c = fi.read();
        System.out.println((char) c);

        byte[] br = new byte[8];

        fi.read(br);// will read br length of characters from file

        for (byte b : br) {
            System.out.print((char) b);
        }
        System.out.println();
        System.out.println(fi.available());
        // fi.read(br);
        // fi.read(br);
        // // int a = fi.read();
        while ((c = fi.read()) != -1) {// to read all remaining characters of the file
            System.out.print((char) c);
        }
        fi.close();
    }
}
