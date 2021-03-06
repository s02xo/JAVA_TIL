package s04.p01;

/**
 * 상속 (Inheritence)
 * 상속 : 어떤 클래스의 모든 멤버 변수 및 메소드를 계승하며,
 * 새로운 클래스를 생성하는 것 (부모 클래스로부터 상속받은 자식 클래스는 부모로부터 상속 받은 것 + 자신의 것)
 *
 * 상속 대상 : 조상 클래스, 부모 클래스, 상위 클래스, 슈퍼 클래스 (개념적으로 상위에 있는 클래스)
 * 상속 결과 : 자손 클래스, 자식 클래스 ,하위 클래스, 서브 클래스
 *
 * 상속 관계를 흔히 'IS-A' 관계라고 부른다.
 */

class Person {
    String name; // 인스턴스 변수

    public void work() {
        System.out.println("일하기");
    }

    public void sleep() {
        System.out.println("잠자기");
    }
}

// Person을 상속하는 자식 클래스
// extends 키워드를 이용하여 상속함 => (Developer 클래스는 Person 클래스를 상속한다)
class Developer extends Person{
    String mainLang;

    public void writeCode(){
        System.out.println("돈 받은 만큼 코딩하기");
    }
}


class Student extends Person{
    String major;

    public void writeCode(){
        System.out.println("밤새 코딩하기");
    }
}

public class Main {
    public static void main(String[] args) {
        // 클래스를 상속하면 모든 멤버 변수와 모든 메소드를 상속받는다.
        Developer dev = new Developer(); // Developer 지만 Person이기도 하다.
        dev.name = "나개발";               // Developer 'IS-A' Person
        System.out.println(dev.name);
        dev.work();
        dev.sleep();

        dev.mainLang = "Java";
        dev.writeCode();

        Student stud = new Student(); // Student 'IS-A' Person
        stud.writeCode();
    }
}
