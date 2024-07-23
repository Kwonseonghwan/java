package Edu;

public class ControlStatement {
    public static void main(String[] args) {
//        if(조건1) {
//            // 처리
//        } else if(조건2){
//            // 처리
//        } else {
//            // 처리코드
//        }

        // switch 문
        String food = "뚝배기";
        switch (food) {
            case "김밥" :
                System.out.println("분식");
                break;
            case "뚝배기" :
                System.out.println("한식");
                break;
            default:
                System.out.println("기타");
                break;
        }

        // for 문
        for(int i = 0; i < 3; i++) {
            if( i == 1 ) {
                break;
            }
            System.out.println(i);
        }

        // 구구단 출력
        for(int a = 1; a < 10; a++) {
            System.out.println("구구단" + a + "단");
            for(int b = 1; b < 10; b++) {
                System.out.printf("%d X %d = %d%n", a , b , a * b);
            }
        }

        // 별찍기 쉬프트+f10
        int cnt = 6;
        for(int i = 0; i < cnt; i++) {
            for(int j = i; j < (cnt - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < cnt; i++) {
            for(int j = i; j < (cnt - 1); j++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
