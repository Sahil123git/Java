public class switch_excer {
    public static void main(String[] args) {
        int month = 4;
        String season;
        switch (month) {
            case 1:// no break so if any one is crct tht will work till it found break statement
            case 2:
            case 12:
                season = "Winter";
                break;

            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;

            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;

            case 9:
            case 10:
            case 11:
                season = "Autmn";
                break;

            default:
                season = "Bogus Month";
                break;// not necessary

        }
        System.out.println("April is the " + season + ".");
    }
}
