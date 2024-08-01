package Edu.InnerClass;

public class InnerClass {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        Mammal.Whale whale = mammal.new Whale();
        whale.info();

        Mammal.Whale whale2 = new Mammal().new Whale();
        whale2.info();
    }
}

class Mammal {
    String birth = "출산";

    class Whale {
        String name = "고래";
        static final String color = "회색";

//        자바언어 사양상 컴파일 에러 발생
//        주의 : 컴파일러에 따라 특정 설정하에 동작 할수도 있으나, static 사용하지 않기
        static int age = 18;

        public void info() {
            System.out.println(birth);
            System.out.println(name);
            System.out.println(color);
        }
    }
}