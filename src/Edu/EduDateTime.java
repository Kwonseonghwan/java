package Edu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EduDateTime {
    public static void main(String[] args) {
        // LocalDate Class
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);
        System.out.println(nowDate.getYear()); // 연도
        System.out.println(nowDate.getMonth()); // 월 영어
        System.out.println(nowDate.getMonthValue()); // 월 숫자
        System.out.println(nowDate.getDayOfMonth()); // 날짜
        System.out.println(nowDate.getDayOfWeek()); // 요일 영어
        System.out.println(nowDate.getDayOfWeek().getValue()); // 요일 숫자 0: 일요일 ~6
        System.out.println(nowDate.lengthOfMonth()); // 해당 달의 일수
        System.out.println(nowDate.lengthOfYear()); // 해당 연도의 일수

        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);
        System.out.println(nowTime.getHour());
        System.out.println(nowTime.getMinute());
        System.out.println(nowTime.getSecond());
        System.out.println(nowTime.getNano());
        System.out.println(nowTime.getHour());

        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println(nowDateTime);
        System.out.println(nowDateTime.getYear());
        System.out.println(nowDateTime.getMonth());
        System.out.println(nowDateTime.getDayOfMonth());
        System.out.println(nowDateTime.getDayOfWeek());
        System.out.println(nowDateTime.getDayOfWeek().getValue());
        System.out.println(nowDateTime.getHour());
        System.out.println(nowDateTime.getMinute());
        System.out.println(nowDateTime.getSecond());
        System.out.println(nowDateTime.getNano());
        System.out.println(nowDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

//        long dateCompare = nowDateTime.compareTo(nowDateTime2, ChronoUnit.YEARS);
//        System.out.println(Math.abs(dateCompare));
//
//        boolean boo = nowDateTime.isAfter(nowDateTime2);
//        LocalDateTime nowDateTime2 = LocalDateTime.of(2024,2,24,12,00,00);
//        System.out.println(nowDateTime2);

    }
}
