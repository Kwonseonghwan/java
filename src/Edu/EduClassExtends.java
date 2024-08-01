package Edu;

public class EduClassExtends {
    public static void main(String[] args) {
        Whale whale = new Whale();
        whale.printInfo();
    }
}

class Mammal {
    String Kinds;
    final protected String name = "테스트"; // 상수

    public Mammal() {
//        System.out.println("Mammal");
        this.Kinds = "포유류";
    }
    //final method : 자식 클래스에서 오버라이딩 불가능
//    final public void printInfo() {
    public void printInfo() {
        System.out.println("Kinds: " + Kinds);
    }
}

class Whale extends Mammal {
    public Whale() {
        super();
//        this.name = "고래";
//        System.out.println("Whale");
        System.out.println(this.Kinds.concat(this.name));
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Name: " + name);
    }
}