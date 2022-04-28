class GenMeth2 {
    // here class is not generic so we can make generic method
    // The type parameters(T,V) are declared before the return type of the method
    // Generic mthd can either be static or non static
    <T, V extends T> T isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++)
            if (x.equals(y[i]))
                return x;
        return x;
    }

    public static void main(String args[]) {

        GenMeth2 ref = new GenMeth2();
        Integer nums[] = { 1, 2, 3, 4, 5 };
        System.out.println(ref.isIn( 2, nums));
        // System.out.println("2 is in nums");
        // if(isIn("two", nums))
        // System.out.println("two is in strs");
    }
}