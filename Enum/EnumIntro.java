enum Season {
    Winter, Summer
}

public class EnumIntro {

    public static void main(String[] args) {
        for (Season s : Season.values()) {
            System.out.println(s);
        }

        for (int i = 0; i < Season.values().length; i++) {
            System.out.println(Season.values()[i]);
        }
    }
}