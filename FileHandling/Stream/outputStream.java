import java.io.FileOutputStream;

public class outputStream {
    public static void main(String[] args) throws Exception {
        FileOutputStream f = new FileOutputStream("JaFile.txt");
        // if this JaFile.txt is not there then this will create and then wrte the txt
        // FileOutputStream f = new FileOutputStream("JavaFile.txt", true);
        // Constructor FIleOutputStream(String name,boolean append)
        // so we are sending true to allow appending our new text
        f.write('s');
        String st = "---welcome_to  HelloWorld";
        byte[] bt = st.getBytes();

        f.write(bt);
        f.write(bt, 3, 5);// will write from 3rd char and write totla 5 chars
        f.close();

    }
}
