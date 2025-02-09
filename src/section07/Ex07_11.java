package section07;

public class Ex07_11 {
    public static void main(String[] args) {
        Family father = new Family();

        // 인스턴스 멤버는 객체가 생성될 때
        father.name = "김아빠";
        father.age = 50;
        // father.address = "서울";
        Family.address = "인천"; // 정적멤버 프로그램이 실행될 때 메모리에 바로 올라감!

        // System.out.println(father.name);
        // System.out.println(father.age);
        System.out.println(Family.address);
        // 주소 공유 -정적 static 각각 인스턴스 멤버 접근 공유 주소 정적
        System.out.println();

        Family son = new Family();

        son.name = "김아들";
        son.age = 20;

        System.out.println(son.name);
        System.out.println(son.age);
        System.out.println(Family.address);
    }
}
