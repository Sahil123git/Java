class BoundedGeneric<T extends Number> {// if we'll not write (extends Number) then compiler will think it can be
                                        // string. But by writing (extends Number) now it can only have any
                                        // sub class of Number
    T[] nums;

    BoundedGeneric(T[] arr) {
        nums = arr;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue(); // No Error!!!
        }
        return sum / nums.length;
    }

    public static void main(String args[]) {
        Integer[] arr1 = { 2, 5, 6, 7, 8 };
        // int arr1[] = new int[4];
        BoundedGeneric<Integer> si = new BoundedGeneric<Integer>(arr1);
        System.out.println(si.average());
        Double[] arr2 = { 1.5, 2.4, 5.6, 8.8 };
        BoundedGeneric<Double> si2 = new BoundedGeneric<Double>(arr2);
        System.out.println(si2.average());

    }
}