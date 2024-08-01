package Edu;

public class EduEnum {
    public static void main(String[] args) {
    EnumDays monday = EnumDays.MONDAY;
    System.out.println(monday);
    System.out.println(monday == EnumDays.MONDAY);
    }
}

enum EnumDays {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY
}

//class FinalDays {
//    public static final int MONTHDAY = 1;
//    public static final int TUESDAY = 2;
//}

