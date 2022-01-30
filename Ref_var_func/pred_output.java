public class pred_output {
    int a = 1;
    int b = 2;

    pred_output func(pred_output obj) {
        pred_output obj3 = new pred_output();
        obj3 = obj;
        obj3.a = obj.a++ + ++obj.b;
        obj.b = obj.b;
        return obj3;
    }

    public static void main(String[] args) {
        pred_output obj1 = new pred_output();
        pred_output obj2 = obj1.func(obj1);

        System.out.println("obj1.a = " + obj1.a + " obj1.b = " + obj1.b);
        System.out.println("obj2.a = " + obj2.a + " obj2.b = " + obj2.b);

    }
}

// public class jr { there can be only 1 public class

// }
