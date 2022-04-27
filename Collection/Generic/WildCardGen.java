class StatsWild<T extends Number> {
    T[] nums;

    StatsWild(T[] arr) {
        nums = arr;
    }

    double avg() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    // Concept: if the invoking object is of type Stats<Integer>, then the parameter
    // obj must also be of type Stats<Integer>.

    // boolean sameAvg(StatsWild<T> obj) this will give error
    boolean sameAvg(StatsWild<?> obj) {// here parameter is another obj
        if (avg() == obj.avg()) {
            return true;
        }
        return false;
    }
}

public class WildCardGen {
    public static void main(String[] args) {
        Integer num[] = { 1, 2, 3, 4 };
        StatsWild<Integer> obj = new StatsWild<Integer>(num);

        Double num1[] = { 1.5, 4.1, 5.6, 8.8, 7.3, 9.0 };
        StatsWild<Double> obj2 = new StatsWild<Double>(num1);

        boolean bl = obj2.sameAvg(obj);
        System.out.println(bl);
    }
}
