public class Index_Of {

    static int fnd_occur(String str, String fnd) {
        int count = 0, chkr = 1, ind = 0;
        while (chkr > 0) {
            ind = str.indexOf(fnd, ind);
            System.out.println(ind);
            chkr = ++ind;
            count += 1;
        }
        return count - 1;
    }

    static int fnd_occ_2(String str, String fnd) {
        int i = 0, cnt = 0;
        while (str.indexOf(fnd, i) != -1) {
            i = str.indexOf(fnd, i) + fnd.length();
            cnt++;
        }
        return cnt;
    }

    static int fnd_occ_lst_ind(String str, String fnd) {
        int i = str.length() - 1, cnt = 0;
        while (str.lastIndexOf(fnd, i) != -1) {
            i = str.lastIndexOf(fnd, i) - 1;
            cnt++;
        }
        return cnt;
    }

    public static void main(String args[]) {
        String s = 's'+"hey hello hey hello hey hello"+'j'+'s';
        System.out.println(s);
        String str="sahil dussa dss";
        int x = s.indexOf("hello");
        System.out.println(x);
        int y = s.indexOf("hello", 12);
        System.out.println(y);

        int z = s.indexOf('o');
        System.out.println(z);
        int r = s.indexOf('e', 12);
        System.out.println(r);

        int t = s.lastIndexOf("hey");
        System.out.println(t);
        int k = str.lastIndexOf("dss", 12);// start searching from 9 index but(right to left)
        System.out.println(k+" chkr");

        System.out.println(s.indexOf("sd"));

        String st = "sa sa sa sa sasasasa";
        System.out.println(fnd_occur(st, "sa"));
        System.out.println(fnd_occ_2(st, "sa"));
        System.out.println(fnd_occ_lst_ind(st, "sa"));
    }
}
