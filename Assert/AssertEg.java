public class AssertEg {
    public static void main(String[] args) {
        int x = getPositiveInt(7);
        int y = getPositiveInt(2);
        assert (x > 0);
        assert (y > 0);
        int total = x + y;
        System.out.println("total = " + total);
    }

    public static int getPositiveInt(int num) {
        return num - 3;
    }
}

// -ea is required to enable Assert
/*
 * PS C:\Users\Sahil\OneDrive\Desktop\programming\Clg\Clg_java\Assert> cd
 * "c:\Users\Sahil\OneDrive\Desktop\programming\Clg\Clg_java\Assert\" ; if ($?)
 * { javac AssertEg.java } ; if ($?) { java -ea AssertEg }
 * Exception in thread "main" java.lang.AssertionError
 * at AssertEg.main(AssertEg.java:6)
 */
